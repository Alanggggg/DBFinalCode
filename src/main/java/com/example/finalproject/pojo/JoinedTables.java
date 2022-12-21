package com.example.finalproject.pojo;

import lombok.Data;

@Data
public class JoinedTables {
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

    private String address;

    private String email;

    private String city;

    private String sheltername;

    private String phone;

    private String state;

    private String zip;

    private Float latitude;

    private Float longitude;

    private String breed;

    private Integer popularity;

    private Float minHeight;

    private Float maxHeight;

    private Float minWeight;

    private Float maxWeight;

    private String group;

    private Float groomingFrequencyValue;

    private Float sheddingValue;

    private Float energyLevelValue;

    private Float trainabilityValue;

    private Float demeanorValue;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getSheltername() {
        return sheltername;
    }

    public void setSheltername(String sheltername) {
        this.sheltername = sheltername == null ? null : sheltername.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed == null ? null : breed.trim();
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Float getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(Float minHeight) {
        this.minHeight = minHeight;
    }

    public Float getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(Float maxHeight) {
        this.maxHeight = maxHeight;
    }

    public Float getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(Float minWeight) {
        this.minWeight = minWeight;
    }

    public Float getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Float maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group == null ? null : group.trim();
    }

    public Float getGroomingFrequencyValue() {
        return groomingFrequencyValue;
    }

    public void setGroomingFrequencyValue(Float groomingFrequencyValue) {
        this.groomingFrequencyValue = groomingFrequencyValue;
    }

    public Float getSheddingValue() {
        return sheddingValue;
    }

    public void setSheddingValue(Float sheddingValue) {
        this.sheddingValue = sheddingValue;
    }

    public Float getEnergyLevelValue() {
        return energyLevelValue;
    }

    public void setEnergyLevelValue(Float energyLevelValue) {
        this.energyLevelValue = energyLevelValue;
    }

    public Float getTrainabilityValue() {
        return trainabilityValue;
    }

    public void setTrainabilityValue(Float trainabilityValue) {
        this.trainabilityValue = trainabilityValue;
    }

    public Float getDemeanorValue() {
        return demeanorValue;
    }

    public void setDemeanorValue(Float demeanorValue) {
        this.demeanorValue = demeanorValue;
    }
}