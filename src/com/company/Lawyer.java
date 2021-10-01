package com.company;

import java.util.Objects;

public final class Lawyer extends LawDepartment{

    private String nameOfLawyer;
    private int ageOfLawyer, experienceOfWork;

    public Lawyer(){
        nameOfLawyer="Noname";
        ageOfLawyer=0;
        experienceOfWork=0;
    }

    public Lawyer(String nameOfLawyer,int ageOfLawyer,int experienceOfWork){
        this.nameOfLawyer=nameOfLawyer;
        this.ageOfLawyer=ageOfLawyer;
        this.experienceOfWork=experienceOfWork;
    }

    public void setNameOfLawyer(String nameOfLawyer){
        this.nameOfLawyer=nameOfLawyer;
    }

    public void setAgeOfLawyer(int ageOfLawyer){
        this.ageOfLawyer=ageOfLawyer;
    }

    public void setExperienceOfWork(int experienceOfWork){
        this.experienceOfWork=experienceOfWork;
    }

    public String getNameOfLawyer(){
        return nameOfLawyer;
    }

    public int getAgeOfLawyer(){
        return ageOfLawyer;
    }

    public int getExperienceOfWork(){
        return experienceOfWork;
    }

    @Override
    public String toString() {
        return "Lawyer{" +
                "nameOfLawyer='" + nameOfLawyer + '\'' +
                ", ageOfLawyer=" + ageOfLawyer +
                ", experienceOfWork=" + experienceOfWork +
                ", nameOfDirector='" + nameOfDirector + '\'' +
                ", numberOfLawyers=" + numberOfLawyers +
                ", nameOfCompany='" + nameOfCompany + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                ", numberOfDoneProjects=" + numberOfDoneProjects +
                ", numberOfOffices=" + numberOfOffices +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lawyer lawyer = (Lawyer) o;
        return ageOfLawyer == lawyer.ageOfLawyer &&
                experienceOfWork == lawyer.experienceOfWork &&
                Objects.equals(nameOfLawyer, lawyer.nameOfLawyer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameOfLawyer, ageOfLawyer, experienceOfWork);
    }

}
