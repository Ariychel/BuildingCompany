package com.company;

import java.util.Objects;

public class LawDepartment{
    protected String nameOfDirector;
    protected int numberOfLawyers;

    public LawDepartment(){
        nameOfDirector="Noname";
        numberOfLawyers=0;
    }



    public LawDepartment(String nameOfDirector, int numberOfLawyers, BuildingCompany buildingCompany,
                         EngineeringDepartment engineeringDepartment) throws Exception {

        this.nameOfDirector=nameOfDirector;
        if(numberOfLawyers+engineeringDepartment.getNumberOfEngineers()<=buildingCompany.getNumberOfEmployees()){
            this.numberOfLawyers=numberOfLawyers;
        } else {
            throw new Exception("Number of lawyers bigger than number company's employees");
        }
    }

    public void setNameOfDirector(String nameOfDirector){
        this.nameOfDirector=nameOfDirector;
    }

    public void setNumberOfLawyers(int numberOfLawyers, BuildingCompany buildingCompany,
                                   EngineeringDepartment engineeringDepartment) throws Exception {

        if(numberOfLawyers+engineeringDepartment.getNumberOfEngineers()<=buildingCompany.getNumberOfEmployees()) {
            this.numberOfLawyers = numberOfLawyers;
        } else {
            throw new Exception("Number of lawyers bigger than number company's employees");
        }
    }

    public String getNameOfDirector(){
        return nameOfDirector;
    }

    public int getNumberOfLawyers(){
        return numberOfLawyers;
    }

    @Override
    public String toString() {
        return "LawDepartment{" +
                "nameOfDirector='" + nameOfDirector + '\'' +
                ", numberOfLawyers=" + numberOfLawyers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LawDepartment that = (LawDepartment) o;
        return numberOfLawyers == that.numberOfLawyers &&
                Objects.equals(nameOfDirector, that.nameOfDirector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameOfDirector, numberOfLawyers);
    }
}
