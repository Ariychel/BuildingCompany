package com.company;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public final class PersonInCompany extends Employee implements IManagement, IHavingCompany {

    private boolean ifDirector,ifOwner;
    private static final Logger logger = LogManager.getLogger(PersonInCompany.class);

    public PersonInCompany(){
        name = "Noname";
        age = 0;
        ifDirector = false;
        ifOwner = false;
    }
    
    public PersonInCompany(String nameOfPerson, int ageOfPerson, boolean ifDirector, boolean ifOwner){
        this.name = nameOfPerson;
        this.age = ageOfPerson;
        this.ifDirector = ifDirector;
        this.ifOwner = ifOwner;
    }

    public void setNameOfPerson(String nameOfPerson){
        this.name=nameOfPerson;
    }

    public String getNameOfPerson(){
        return name;
    }

    public void setAgeOfPerson(int ageOfPerson){
        this.age=ageOfPerson;
    }

    public int getAgeOfPerson(){
        return age;
    }



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
    public void buyNewOffice(BuildingCompany buildingCompany) {
        if (ifOwner){
            String ownerBuyNewOffice = "The owner is going to buy a new office.";
            logger.info(ownerBuyNewOffice);
            buildingCompany.numberOfOffices++;
        } else {
            String thisPersonNotOwner = this.name+" isn't a owner of company.";
            logger.info(thisPersonNotOwner);
        }
    }

    @Override
    public void soldOffice(BuildingCompany buildingCompany) {
        if (ifOwner){
            String ownerSoldOffice ="The owner sold the office.";
            logger.info(ownerSoldOffice);
            buildingCompany.numberOfOffices--;
        } else {
            String thisPersonNotOwner = this.name+" isn't a owner of company.";
            logger.info(thisPersonNotOwner);
        }
    }

    @Override
    public void dissmissEmployees(BuildingCompany buildingCompany) {
        Scanner in = new Scanner(System.in);

        if (ifDirector){
            String firstQuestion = "How much dissmiss employees: ";
            logger.info(firstQuestion);
            int countOfEmployees = in.nextInt();
            String directorDissmissEmployees = "The director is going to dissmiss "+countOfEmployees+" employees.";
            logger.info(directorDissmissEmployees);
            buildingCompany.numberOfEmployees -= countOfEmployees;
        } else {
            String thisPersonNotDirector = this.name+" isn't the director of company.";
            logger.info(thisPersonNotDirector);
        }
    }

    @Override
    public void hireEmployees(BuildingCompany buildingCompany) {
        Scanner in = new Scanner(System.in);

        if (ifDirector){
            String firstQuestion = "How much hire employees: ";
            logger.info(firstQuestion);
            int countOfEmployees = in.nextInt();
            String directorDissmissEmployees = "The director is going to hire "+countOfEmployees+" employees.";
            logger.info(directorDissmissEmployees);
            buildingCompany.numberOfEmployees += countOfEmployees;
        } else {
            String thisPersonNotDirector = this.name+" isn't the director of company.";
            logger.info(thisPersonNotDirector);
        }

    }
}
