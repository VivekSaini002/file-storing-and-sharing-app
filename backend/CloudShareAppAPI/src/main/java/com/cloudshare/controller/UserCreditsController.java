package com.cloudshare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudshare.document.UserCredits;
import com.cloudshare.dto.UserCreditsDTO;
import com.cloudshare.service.UserCreditsService;

@RestController
@RequestMapping("/users")
public class UserCreditsController {

	@Autowired
    private UserCreditsService userCreditsService;

    @GetMapping("/credits")
    public ResponseEntity<?> getUserCredits() {
        UserCredits userCredits = userCreditsService.getUserCredits();
        UserCreditsDTO response = new UserCreditsDTO();
        response.setCredits(userCredits.getCredits());
        response.setPlan(userCredits.getPlan());

        return ResponseEntity.ok(response);
    }
}
