package com.company;

import java.util.Objects;

public class BuildingCompany {
    String nameOfCompany, numberOfEmployees, numberOfDoneProjects, numberOfOffices;

    public BuildingCompany(){
        nameOfCompany="NULL";
        numberOfEmployees="0";
        numberOfDoneProjects="0";
        numberOfOffices="0";
    }

    public BuildingCompany(String nameOfCompany, String numberOfEmployees, String numberOfDoneProjects, String numberOfOffices){
        this.nameOfCompany=nameOfCompany;
        this.numberOfEmployees=numberOfEmployees;
        this.numberOfDoneProjects=numberOfDoneProjects;
        this.numberOfOffices=numberOfOffices;
    }

    public void setNameOfCompany(String nameOfCompany){
        this.nameOfCompany=nameOfCompany;
    }

    public void setNumberOfEmployees(String numberOfEmployees){
        this.numberOfEmployees=numberOfEmployees;
    }

    public void setNumberOfDoneProjects(String numberOfDoneProjects){
        this.numberOfDoneProjects=numberOfDoneProjects;
    }

    public void setNumberOfOffices(String numberOfOffices){
        this.numberOfOffices=numberOfOffices;
    }

    public void setAll(String nameOfCompany, String numberOfEmployees, String numberOfDoneProjects, String numberOfOffices){
        this.nameOfCompany=nameOfCompany;
        this.numberOfEmployees=numberOfEmployees;
        this.numberOfDoneProjects=numberOfDoneProjects;
        this.numberOfOffices=numberOfOffices;
    }

    public String getNameOfCompany(){
        return nameOfCompany;
    }

    public String getNumberOfEmployees(){
        return numberOfEmployees;
    }

    public String getNumberOfDoneProjects(){
        return numberOfDoneProjects;
    }

    public String getNumberOfOffices(){
        return  numberOfOffices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildingCompany that = (BuildingCompany) o;
        return Objects.equals(nameOfCompany, that.nameOfCompany) &&
                Objects.equals(numberOfEmployees, that.numberOfEmployees) &&
                Objects.equals(numberOfDoneProjects, that.numberOfDoneProjects) &&
                Objects.equals(numberOfOffices, that.numberOfOffices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfCompany, numberOfEmployees, numberOfDoneProjects, numberOfOffices);
    }
}
