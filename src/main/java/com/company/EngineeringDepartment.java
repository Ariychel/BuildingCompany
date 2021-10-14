package com.company;

import java.util.Objects;

public class EngineeringDepartment{

    protected String nameOfDirector;
    protected int numberOfEngineers;

    public EngineeringDepartment(){
        nameOfDirector="Noname";
        numberOfEngineers=0;
    }

    public EngineeringDepartment(String nameOfDirector, int numberOfEngineers, BuildingCompany buildingCompany,
                                 LawDepartment lawDepartment) throws Exception {

        this.nameOfDirector=nameOfDirector;
        if(numberOfEngineers+lawDepartment.getNumberOfLawyers()<=buildingCompany.getNumberOfEmployees()){
        this.numberOfEngineers=numberOfEngineers;
        } else {
            throw new Exception("Number of engineers bigger than number company's employees");
        }
    }

    public void setNameOfDirector(String nameOfDirector){
        this.nameOfDirector=nameOfDirector;
    }

    public void setNumberOfEngineers(int numberOfEngineers, BuildingCompany buildingCompany,
                                     LawDepartment lawDepartment) throws Exception {

        if(numberOfEngineers+lawDepartment.getNumberOfLawyers()<=buildingCompany.getNumberOfEmployees()) {
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
        return "EngineeringDepartment{" +
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
