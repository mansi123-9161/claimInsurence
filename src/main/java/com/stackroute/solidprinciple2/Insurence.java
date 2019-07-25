package com.stackroute.solidprinciple2;

public class Insurence {
    private int insuranceId;
    private int customertId;
    private boolean claimedByUser;
    private boolean eligibleUser;

    public int getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }

    public int getCustomertId() {
        return customertId;
    }

    public void setCustomertId(int customertId) {
        this.customertId = customertId;
    }

    public boolean isClaimedByUser() {
        return claimedByUser;
    }

    public void setClaimedByUser(boolean claimedByUser) {
        this.claimedByUser = claimedByUser;
    }

    public boolean isEligibleUser() {
        return eligibleUser;
    }

    public void setEligibleUser(boolean eligibleUser) {
        this.eligibleUser = eligibleUser;
    }

    public Insurence(int insuranceId, int customertId, boolean claimedByUser, boolean eligibleUser) {
        this.insuranceId = insuranceId;
        this.customertId = customertId;
        this.claimedByUser = claimedByUser;
        this.eligibleUser = eligibleUser;
    }
}
