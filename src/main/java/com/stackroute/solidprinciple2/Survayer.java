package com.stackroute.solidprinciple2;

public class Survayer extends Employee {
    public void validatingClaim(ClaimInsurence insurence){

        if(insurence.getInsuranceToBeClaimedByUser()!= null){
            if (!insurence.getInsuranceToBeClaimedByUser().isClaimedByUser()) {
                insurence.setApprovedBySurveyor(true);
            }
        }
        else
            insurence.setApprovedBySurveyor(false);
    }
}
