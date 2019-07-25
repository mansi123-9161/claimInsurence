package com.stackroute.solidprinciple2;
import java.util.*;
public class Company {
    public static void main(String[] args) {
        int customerid;
        String customerName;
        int applicationId;
        System.out.println("Enter Customer Id:");
        Scanner inputId=new Scanner(System.in);
        customerid=inputId.nextInt();
        System.out.println("Enter your Name:");
        Scanner inputName=new Scanner(System.in);
        customerName=inputId.next();
        System.out.println("Is your Insurance Claimed:");
        Scanner inputStatus=new Scanner(System.in);
        applicationId=inputId.nextInt();
        CustomerInfo customer=new CustomerInfo(customerid,customerName,applicationId);
        Survayer insuranceSurveyor=new Survayer();
        Autherizer autherizer=new Autherizer();


        insuranceSurveyor.validatingClaim( customer.raisingClaim());
        System.out.println("Is approved by Surveyor: "+customer.claimRequest.getApprovedBySurveyor());
        if (customer.claimRequest.getApprovedBySurveyor()) {
            Autherizer.au(customer.raisingClaim());
            System.out.println("Is approved by Manager: " + customer.claimRequest.getApprovedBySurveyor());
        }
    }

}
