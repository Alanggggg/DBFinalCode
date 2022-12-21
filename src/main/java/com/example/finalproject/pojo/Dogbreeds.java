package com.example.finalproject.pojo;

public class Dogbreeds {
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