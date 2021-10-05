package com.company;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public final class PersonInCompany implements DirectorOfCompany, OwnerOfCompany {
    String nameOfPerson, nameOfOwner;
    int ageOfPerson, ageOfOwner;
    boolean ifDirector,ifOwner;
    private static final Logger logger = LogManager.getLogger(PersonInCompany.class);

    public PersonInCompany(){
        nameOfPerson = "Noname";
        nameOfOwner = "Noname";
        ageOfPerson = 0;
        ageOfOwner = 0;
        ifDirector = false;
        ifOwner = false;
    }
    
    public PersonInCompany(String nameOfPerson, int ageOfPerson, boolean ifDirector, boolean ifOwner){
        this.nameOfPerson = nameOfPerson;
        this.ageOfPerson = ageOfPerson;
        this.ifDirector = ifDirector;
        this.ifOwner = ifOwner;
    }

    public PersonInCompany(int ageOfOwner, String nameOfOwner, boolean ifDirector, boolean ifOwner){
        this.ageOfOwner = ageOfOwner;
        this.nameOfOwner = nameOfOwner;
        this.ifDirector = ifDirector;
        this.ifOwner = ifOwner;
    }
    

    @Override
    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }

    @Override
    public String getNameOfPerson() {
       return nameOfPerson;
    }

    @Override
    public void setAgeOfPerson(int ageOfPerson) {
        this.ageOfPerson = ageOfPerson;
    }

    @Override
    public int getAgeOfPerson() {
        return ageOfPerson;
    }

    @Override
    public void whoIsThisPerson() {
        Scanner in = new Scanner(System.in);

        String firstQuestion = "This person is director of company?(yes/no): ";
        logger.info(firstQuestion);
        String firstAnswer = in.nextLine();
        ifDirector = firstAnswer.equals("yes");

        String secondQuestion = "This person is owner of company?(yes/no): ";
        logger.info(secondQuestion);
        String secondAnswer = in.nextLine();
        ifOwner = secondAnswer.equals("yes");

        if (ifDirector & ifOwner & true){

            String whoThisPerson = "This person is director and owner of this company";
            logger.info(whoThisPerson);

        } else {

            String whoThisPerson;

            if (ifDirector == true){
                whoThisPerson = "This person is director";
            } else {
                whoThisPerson = "This person isn't director";
            }

            if (ifOwner == true){

                if (ifDirector == true){
                    whoThisPerson += " and owner of this company";
                } else {
                    whoThisPerson += " and is owner of this company";
                }

            } else {
                if (ifDirector == true){
                    whoThisPerson += " and ins't owner of this company";
                } else {
                    whoThisPerson += " and owner of this company";
                }
            }

            logger.info(whoThisPerson);

        }
    }

    @Override
    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    @Override
    public String getNameOfOwner() {
        return nameOfOwner;
    }

    @Override
    public void setAgeOfOwner(int ageOfOwner) {
        this.ageOfOwner = ageOfOwner;
    }

    @Override
    public int getAgeOfOwner() {
        return ageOfOwner;
    }
}
