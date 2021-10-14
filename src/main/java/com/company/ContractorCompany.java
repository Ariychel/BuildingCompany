package com.company;

public class ContractorCompany extends Contractor{

    public ContractorCompany(){
        nameOfContractor = "";
        numberOfEmployees = 0;
    }

    public ContractorCompany(String nameOfContractor, int numberOfEmployees){
        this.nameOfContractor = nameOfContractor;
        this.numberOfEmployees = numberOfEmployees;
    }
}
