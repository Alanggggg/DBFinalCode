package com.example.finalproject.pojo;

public class Dogadoption {
    private String id;

    private String organizationId;

    private String primaryBreed;

    private String secondaryBreed;

    private String primaryColor;

    private String secondaryColor;

    private String age;

    private String gender;

    private String size;

    private String name;

    private String status;

    private String publishedAtTime;

    private String statusChangedTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getPrimaryBreed() {
        return primaryBreed;
    }

    public void setPrimaryBreed(String primaryBreed) {
        this.primaryBreed = primaryBreed == null ? null : primaryBreed.trim();
    }

    public String getSecondaryBreed() {
        return secondaryBreed;
    }

    public void setSecondaryBreed(String secondaryBreed) {
        this.secondaryBreed = secondaryBreed == null ? null : secondaryBreed.trim();
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor == null ? null : primaryColor.trim();
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor == null ? null : secondaryColor.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPublishedAtTime() {
        return publishedAtTime;
    }

    public void setPublishedAtTime(String publishedAtTime) {
        this.publishedAtTime = publishedAtTime == null ? null : publishedAtTime.trim();
    }

    public String getStatusChangedTime() {
        return statusChangedTime;
    }

    public void setStatusChangedTime(String statusChangedTime) {
        this.statusChangedTime = statusChangedTime == null ? null : statusChangedTime.trim();
    }
}