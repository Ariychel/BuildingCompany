package com.company;

public abstract class Employee {

    protected String name;
    protected int age,experienceOfWork;

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setExperienceOfWork(int experienceOfWork){
        this.experienceOfWork=experienceOfWork;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getExperienceOfWork(){
        return experienceOfWork;
    }

}
