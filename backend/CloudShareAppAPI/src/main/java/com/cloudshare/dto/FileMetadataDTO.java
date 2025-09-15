package com.cloudshare.dto;

import java.time.LocalDateTime;

public class FileMetadataDTO {
    private String id;
    private String name;
    private String type;
    private Long size;
    private String clerkId;
    private Boolean isPublic;
    private String fileLocation;
    private LocalDateTime uploadedAt;
    
	public FileMetadataDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FileMetadataDTO(String id, String name, String type, Long size, String clerkId, Boolean isPublic,
			String fileLocation, LocalDateTime uploadedAt) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.size = size;
		this.clerkId = clerkId;
		this.isPublic = isPublic;
		this.fileLocation = fileLocation;
		this.uploadedAt = uploadedAt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getClerkId() {
		return clerkId;
	}

	public void setClerkId(String clerkId) {
		this.clerkId = clerkId;
	}

	public Boolean getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}

	public String getFileLocation() {
		return fileLocation;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public LocalDateTime getUploadedAt() {
		return uploadedAt;
	}

	public void setUploadedAt(LocalDateTime uploadedAt) {
		this.uploadedAt = uploadedAt;
	}
    
    
}
