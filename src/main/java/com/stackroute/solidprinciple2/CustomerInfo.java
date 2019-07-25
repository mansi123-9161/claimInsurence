package com.stackroute.solidprinciple2;

public class CustomerInfo {
    private int customerId;
    private String name;
    private int customerApplicationId;
    private Insurence insurence;
    //private String claimInfo;
   // private String claimProof;
    public ClaimInsurence claimRequest;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerApplicationId() {
        return customerApplicationId;
    }

    public void setCustomerApplicationId(int customerApplicationId) {
        this.customerApplicationId = customerApplicationId;
    }

    public Insurence getInsurence() {
        return insurence;
    }

    public void setInsurence(Insurence insurence) {
        this.insurence = insurence;
    }

    public ClaimInsurence getClaimRequest() {
        return claimRequest;
    }

    public void setClaimRequest(ClaimInsurence claimRequest) {
        this.claimRequest = claimRequest;
    }

    public CustomerInfo(int customerId, String name, int customerApplicationId) {
        this.customerId = customerId;
        this.name = name;
        this.customerApplicationId = customerApplicationId;

    }
    public ClaimInsurence raisingClaim(){
        claimRequest=new claimRequest(getInsurence());
        return  claimRequest;

    }
}

