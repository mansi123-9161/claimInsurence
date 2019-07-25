package com.stackroute.solidprinciple2;

public class ClaimInsurence{
    private int claimId;
    private Insurence insuranceToBeClaimedByUser;
    private Boolean approvedBySurveyor=false;
    private Boolean approvedByManager=false;

    public int getClaimId() {
        return claimId;
    }

    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }

    public Insurence getInsuranceToBeClaimedByUser() {
        return insuranceToBeClaimedByUser;
    }

    public void setInsuranceToBeClaimedByUser(Insurence insuranceToBeClaimedByUser) {
        this.insuranceToBeClaimedByUser = insuranceToBeClaimedByUser;
    }

    public Boolean getApprovedBySurveyor() {
        return approvedBySurveyor;
    }

    public void setApprovedBySurveyor(Boolean approvedBySurveyor) {
        this.approvedBySurveyor = approvedBySurveyor;
    }

    public Boolean getApprovedByManager() {
        return approvedByManager;
    }

    public void setApprovedByManager(Boolean approvedByManager) {
        this.approvedByManager = approvedByManager;
    }
    public ClaimInsurence(Insurence insuranceOfCustomer) {
        this.insuranceToBeClaimedByUser= insuranceOfCustomer;
    }
}
