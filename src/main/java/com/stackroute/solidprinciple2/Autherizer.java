package com.stackroute.solidprinciple2;

public class Autherizer extends Employee {
    public void approvingClaim(ClaimInsurence claimrequest){

        if(claimrequest.getInsuranceToBeClaimedByUser()!= null){
            if (!claimrequest.getInsuranceToBeClaimedByUser().isClaimedByUser()) {
                claimrequest.setApprovedByManager(true);
            }
        }
        else
            claimrequest.setApprovedBySurveyor(false);
    }
}
