package com.example.finalproject.pojo;

public class Doggroups {
    private String group;

    private Float averagePopularity;

    private Float averageGroomingFrequency;

    private Float averageSheddingValue;

    private Float averageEnergyLevel;

    private Float averageTrainabilityValue;

    private Float averageDemeanorValue;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group == null ? null : group.trim();
    }

    public Float getAveragePopularity() {
        return averagePopularity;
    }

    public void setAveragePopularity(Float averagePopularity) {
        this.averagePopularity = averagePopularity;
    }

    public Float getAverageGroomingFrequency() {
        return averageGroomingFrequency;
    }

    public void setAverageGroomingFrequency(Float averageGroomingFrequency) {
        this.averageGroomingFrequency = averageGroomingFrequency;
    }

    public Float getAverageSheddingValue() {
        return averageSheddingValue;
    }

    public void setAverageSheddingValue(Float averageSheddingValue) {
        this.averageSheddingValue = averageSheddingValue;
    }

    public Float getAverageEnergyLevel() {
        return averageEnergyLevel;
    }

    public void setAverageEnergyLevel(Float averageEnergyLevel) {
        this.averageEnergyLevel = averageEnergyLevel;
    }

    public Float getAverageTrainabilityValue() {
        return averageTrainabilityValue;
    }

    public void setAverageTrainabilityValue(Float averageTrainabilityValue) {
        this.averageTrainabilityValue = averageTrainabilityValue;
    }

    public Float getAverageDemeanorValue() {
        return averageDemeanorValue;
    }

    public void setAverageDemeanorValue(Float averageDemeanorValue) {
        this.averageDemeanorValue = averageDemeanorValue;
    }
}