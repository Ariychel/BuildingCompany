package com.company;

import java.util.Objects;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Engineer extends Employee implements Engineering {

    private static final Logger logger = LogManager.getLogger(Engineer.class);

    public Engineer(){
        name="Noname";
        age=0;
        experienceOfWork=0;
    }

    public Engineer(String nameOfEngineer,int ageOfEngineer,int experienceOfWork){
        this.name=nameOfEngineer;
        this.age=ageOfEngineer;
        this.experienceOfWork=experienceOfWork;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "nameOfEngineer='" + name + '\'' +
                ", ageOfEngineer=" + age +
                ", experienceOfWork=" + experienceOfWork +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Engineer engineer = (Engineer) o;
        return age == engineer.age &&
                experienceOfWork == engineer.experienceOfWork &&
                Objects.equals(name, engineer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, age, experienceOfWork);
    }

    @Override
    public void EngineeringNewHouse() {
        String engineeringNewHouse = this.getName()+" engineering a new house.";
        logger.info(engineeringNewHouse);
    }
}