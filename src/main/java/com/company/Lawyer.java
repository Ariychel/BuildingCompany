package com.company;

import java.util.Objects;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public final class Lawyer extends Employee implements Signing{

    private static final Logger logger = LogManager.getLogger(BuildingCompany.class);

    public Lawyer(){
        name="Noname";
        age=0;
        experienceOfWork=0;
    }

    public Lawyer(String nameOfLawyer,int ageOfLawyer,int experienceOfWork){
        this.name=nameOfLawyer;
        this.age=ageOfLawyer;
        this.experienceOfWork=experienceOfWork;
    }


    @Override
    public String toString() {
        return "Lawyer{" +
                "nameOfLawyer='" + name + '\'' +
                ", ageOfLawyer=" + age +
                ", experienceOfWork=" + experienceOfWork +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lawyer lawyer = (Lawyer) o;
        return age == lawyer.age &&
                experienceOfWork == lawyer.experienceOfWork &&
                Objects.equals(name, lawyer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, age, experienceOfWork);
    }

    @Override
    public void signTheAgreement() {
        String signingTheAgreement = this.getName()+" is signing the agreement with new client.";
        logger.info(signingTheAgreement);
    }
}
