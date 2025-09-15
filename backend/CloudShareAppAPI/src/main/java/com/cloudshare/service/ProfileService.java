package com.cloudshare.service;

import com.cloudshare.document.ProfileDocument;
import com.cloudshare.dto.ProfileDTO;
import com.cloudshare.repository.ProfileRepository;
import lombok.RequiredArgsConstructor;


import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

	@Autowired
    private ProfileRepository profileRepository;

    public ProfileDTO createProfile(ProfileDTO profileDTO) {

        if (profileRepository.existsByClerkId(profileDTO.getClerkId())) {
            return updateProfile(profileDTO);
        }

        ProfileDocument profile = new ProfileDocument();
        profile.setClerkId(profileDTO.getClerkId());
        profile.setEmail(profileDTO.getEmail());
        profile.setFirstName(profileDTO.getFirstName());
        profile.setLastName(profileDTO.getLastName());
        profile.setPhotoUrl(profileDTO.getPhotoUrl());
        profile.setCredits(5); //default credits
        profile.setCreatedAt(Instant.now());
                

        profile = profileRepository.save(profile);
        
        ProfileDTO dto = new ProfileDTO();
        dto.setId(profile.getId());
        dto.setClerkId(profile.getClerkId());
        dto.setEmail(profile.getEmail());
        dto.setFirstName(profile.getFirstName());
        dto.setLastName(profile.getLastName());
        dto.setPhotoUrl(profile.getPhotoUrl());
        dto.setCredits(profile.getCredits());
        dto.setCreatedAt(profile.getCreatedAt());
        
		return dto;	

    }

    public ProfileDTO updateProfile(ProfileDTO profileDTO) {
        ProfileDocument existingProfile = profileRepository.findByClerkId(profileDTO.getClerkId());

        if (existingProfile != null) {
            //update fields if provided
            if (profileDTO.getEmail() != null && !profileDTO.getEmail().isEmpty()) {
                existingProfile.setEmail(profileDTO.getEmail());
            }

            if (profileDTO.getFirstName() != null && !profileDTO.getFirstName().isEmpty()) {
                existingProfile.setFirstName(profileDTO.getFirstName());
            }

            if (profileDTO.getLastName() != null && !profileDTO.getLastName().isEmpty()) {
                existingProfile.setLastName(profileDTO.getLastName());
            }

            if (profileDTO.getPhotoUrl() != null && !profileDTO.getPhotoUrl().isEmpty()) {
                existingProfile.setPhotoUrl(profileDTO.getPhotoUrl());
            }

            profileRepository.save(existingProfile);

            ProfileDTO dto = new ProfileDTO();
            dto.setId(existingProfile.getId());
            dto.setEmail(existingProfile.getEmail());
            dto.setClerkId(existingProfile.getClerkId());
            dto.setFirstName(existingProfile.getFirstName());
            dto.setLastName(existingProfile.getLastName());
            dto.setCredits(existingProfile.getCredits());
            dto.setCreatedAt(existingProfile.getCreatedAt());
            dto.setPhotoUrl(existingProfile.getPhotoUrl());
            
            return dto;

        }
        return null;
    }

    public boolean existsByClerkId(String clerkId) {
        return profileRepository.existsByClerkId(clerkId);
    }


    public void deleteProfile(String clerkId) {
        ProfileDocument existingProfile = profileRepository.findByClerkId(clerkId);
        if (existingProfile != null) {
            profileRepository.delete(existingProfile);
        }
    }

    public ProfileDocument getCurrentProfile() {
        if (SecurityContextHolder.getContext().getAuthentication() == null) {
            throw new UsernameNotFoundException("User not authenticated");
        }

        String clerkId = SecurityContextHolder.getContext().getAuthentication().getName();
        return profileRepository.findByClerkId(clerkId);
    }
}
