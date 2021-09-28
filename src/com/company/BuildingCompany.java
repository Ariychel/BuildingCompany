package com.company;

import java.util.Objects;

public class BuildingCompany {
    protected String nameOfCompany;
    protected int numberOfEmployees, numberOfDoneProjects, numberOfOffices;

    public BuildingCompany(){
        nameOfCompany="NULL";
        numberOfEmployees=0;
        numberOfDoneProjects=0;
        numberOfOffices=0;
    }

    public BuildingCompany(String nameOfCompany, int numberOfEmployees, int numberOfDoneProjects, int numberOfOffices){
        this.nameOfCompany=nameOfCompany;
        this.numberOfEmployees=numberOfEmployees;
        this.numberOfDoneProjects=numberOfDoneProjects;
        this.numberOfOffices=numberOfOffices;
    }

    public void setNameOfCompany(String nameOfCompany){
        this.nameOfCompany=nameOfCompany;
    }

    public void setNumberOfEmployees(int numberOfEmployees){
        this.numberOfEmployees=numberOfEmployees;
    }

    public void setNumberOfDoneProjects(int numberOfDoneProjects){
        this.numberOfDoneProjects=numberOfDoneProjects;
    }

    public void setNumberOfOffices(int numberOfOffices){
        this.numberOfOffices=numberOfOffices;
    }

    public void setAll(String nameOfCompany, int numberOfEmployees, int numberOfDoneProjects, int numberOfOffices){
        this.nameOfCompany=nameOfCompany;
        this.numberOfEmployees=numberOfEmployees;
        this.numberOfDoneProjects=numberOfDoneProjects;
        this.numberOfOffices=numberOfOffices;
    }

    public String getNameOfCompany(){
        return nameOfCompany;
    }

    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }

    public int getNumberOfDoneProjects(){
        return numberOfDoneProjects;
    }

    public int getNumberOfOffices(){
        return  numberOfOffices;
    }

    @Override
    public String toString() {
        return "BuildingCompany{" +
                "nameOfCompany='" + nameOfCompany + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                ", numberOfDoneProjects=" + numberOfDoneProjects +
                ", numberOfOffices=" + numberOfOffices +
                '}';
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
