package com.example.finalproject.pojo;

public class Stateeconomy {
    private String state;

    private Integer medianIncome;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getMedianIncome() {
        return medianIncome;
    }

    public void setMedianIncome(Integer medianIncome) {
        this.medianIncome = medianIncome;
    }
}