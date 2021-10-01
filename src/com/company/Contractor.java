package com.company;

public abstract class Contractor {
    String nameOfContractor;
    int numberOfEmployees;

    void setNameOfContractor(String nameOfContractor){
       this.nameOfContractor = nameOfContractor;
    }

    String getNameOfContractor(){
        return nameOfContractor;
    }

    void setNumberOfEmployees(int numberOfEmployees){
        this.numberOfEmployees = numberOfEmployees;
    }

    int getNumberOfEmployees(){
        return numberOfEmployees;
    }

}
