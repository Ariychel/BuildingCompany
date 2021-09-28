package com.company;

import java.util.Objects;

public class EngineeringDepartment extends BuildingCompany{

    protected String nameOfDirector;
    protected int numberOfEngineers;

    public EngineeringDepartment(){
        nameOfDirector="Noname";
        numberOfEngineers=0;
    }

    public EngineeringDepartment(String nameOfDirector, int numberOfEngineers) throws Exception {
        this.nameOfDirector=nameOfDirector;
        if(numberOfEngineers<=super.numberOfEmployees){
        this.numberOfEngineers=numberOfEngineers;
        } else {
            throw new Exception("Number of engineers bigger than number company's employees");
        }
    }

    public void setNameOfDirector(String nameOfDirector){
        this.nameOfDirector=nameOfDirector;
    }

    public void setNumberOfEngineers(int numberOfEngineers) throws Exception {
        if(numberOfEngineers<=super.numberOfEmployees) {
            this.numberOfEngineers = numberOfEngineers;
        } else {
            throw new Exception("Number of engineers bigger than number company's employees");
        }
    }

    public String getNameOfDirector(){
        return nameOfDirector;
    }

    public int getNumberOfEngineers(){
        return numberOfEngineers;
    }

    @Override
    public String toString() {
        return "BuildingCompany{" +
                "nameOfCompany='" + nameOfCompany + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                ", numberOfDoneProjects=" + numberOfDoneProjects +
                ", numberOfOffices=" + numberOfOffices +
                '}'+"EngineeringDepartment{" +
                "nameOfDirector='" + nameOfDirector + '\'' +
                ", numberOfEngineers=" + numberOfEngineers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EngineeringDepartment that = (EngineeringDepartment) o;
        return numberOfEngineers == that.numberOfEngineers &&
                Objects.equals(nameOfDirector, that.nameOfDirector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameOfDirector, numberOfEngineers);
    }
}
