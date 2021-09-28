package com.company;

import java.util.Objects;

public final class Engineer extends EngineeringDepartment{

    private String nameOfEngineer;
    private int ageOfEngineer, experienceOfWork;

    public Engineer(){
        nameOfEngineer="Noname";
        ageOfEngineer=0;
        experienceOfWork=0;
    }

    public Engineer(String nameOfEngineer,int ageOfEngineer,int experienceOfWork){
        this.nameOfEngineer=nameOfEngineer;
        this.ageOfEngineer=ageOfEngineer;
        this.experienceOfWork=experienceOfWork;
    }

    public void setNameOfEngineer(String nameOfEngineer){
        this.nameOfEngineer=nameOfEngineer;
    }

    public void setAgeOfEngineer(int ageOfEngineer){
        this.ageOfEngineer=ageOfEngineer;
    }

    public void setExperienceOfWork(int experienceOfWork){
        this.experienceOfWork=experienceOfWork;
    }

    public String getNameOfEngineer(){
        return nameOfEngineer;
    }

    public int getAgeOfEngineer(){
        return ageOfEngineer;
    }

    public int getExperienceOfWork(){
        return experienceOfWork;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "nameOfEngineer='" + nameOfEngineer + '\'' +
                ", ageOfEngineer=" + ageOfEngineer +
                ", experienceOfWork=" + experienceOfWork +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Engineer engineer = (Engineer) o;
        return ageOfEngineer == engineer.ageOfEngineer &&
                experienceOfWork == engineer.experienceOfWork &&
                Objects.equals(nameOfEngineer, engineer.nameOfEngineer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameOfEngineer, ageOfEngineer, experienceOfWork);
    }

}