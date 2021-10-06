package com.company;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;
import java.util.Scanner;

public class BuildingCompany {
    protected String nameOfCompany;
    protected int numberOfEmployees, numberOfDoneProjects, numberOfOffices;
    private static final Logger logger = LogManager.getLogger(BuildingCompany.class);

    public BuildingCompany(){
        nameOfCompany="NULL";
        numberOfEmployees=0;
        numberOfDoneProjects=0;
        numberOfOffices=0;
    }

    public BuildingCompany(String nameOfCompany, int numberOfEmployees, int numberOfDoneProjects, int numberOfOffices){
        this.nameOfCompany=nameOfCompany;
        this.numberOfEmployees=numberOfEmployees;
        this.numberOfDoneProjects=numberOfDoneProjects;
        this.numberOfOffices=numberOfOffices;
    }

    public void setNameOfCompany(String nameOfCompany){
        this.nameOfCompany=nameOfCompany;
    }

    public void setNumberOfEmployees(int numberOfEmployees){
        this.numberOfEmployees=numberOfEmployees;
    }

    public void setNumberOfDoneProjects(int numberOfDoneProjects){
        this.numberOfDoneProjects=numberOfDoneProjects;
    }

    public void setNumberOfOffices(int numberOfOffices){
        this.numberOfOffices=numberOfOffices;
    }

    public void setAll(String nameOfCompany, int numberOfEmployees, int numberOfDoneProjects, int numberOfOffices){
        this.nameOfCompany=nameOfCompany;
        this.numberOfEmployees=numberOfEmployees;
        this.numberOfDoneProjects=numberOfDoneProjects;
        this.numberOfOffices=numberOfOffices;
    }

    public String getNameOfCompany(){
        return nameOfCompany;
    }

    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }

    public int getNumberOfDoneProjects(){
        return numberOfDoneProjects;
    }

    public int getNumberOfOffices(){
        return  numberOfOffices;
    }

    public void buildingTheHouse(){

        Client client = new Client();
        {
            Scanner scanner = new Scanner(System.in);
            String messageOne = "Enter Client's name: ";
            logger.info(messageOne);
            String clientName = scanner.nextLine();
            client.setNameOfClient(clientName);
        }

        int houseArea;
        {
            Scanner scanner = new Scanner(System.in);
            String messageOne = "Enter area of the house: ";
            logger.info(messageOne);
            houseArea = scanner.nextInt();
        }

        int priceForAllWork;
        {
            Scanner scanner = new Scanner(System.in);
            String messageOne = "Enter price for one square meter(USA Dollar): ";
            logger.info(messageOne);
            double priceForOneSquareMeter = scanner.nextDouble();
            priceForAllWork = (int)(houseArea * priceForOneSquareMeter);
        }

        ContractorCompany contractorCompany = new ContractorCompany();
        {
            Scanner scanner = new Scanner(System.in);
            String messageOne = "Enter contractor's company name: ";
            logger.info(messageOne);
            String contractorCompanyName = scanner.nextLine();
            contractorCompany.setNameOfContractor(contractorCompanyName);

            String messageTwo = "Enter count of number of employees: ";
            logger.info(messageTwo);
            int numberOfEmployees = scanner.nextInt();
            contractorCompany.setNumberOfEmployees(numberOfEmployees);
        }

        int needEmployees;
        {
            int tmpNeedEmployees = houseArea / 10 + 1;

            if (tmpNeedEmployees <= contractorCompany.getNumberOfEmployees()){
                needEmployees = tmpNeedEmployees;
            } else {
                needEmployees = contractorCompany.getNumberOfEmployees();
            }
        }

        Time howLongItTakes = new Time();
        {

            double areaForOneEmployee = houseArea / needEmployees;
            int days = (int)(areaForOneEmployee * 35);
            if (houseArea <= 100){
                howLongItTakes.setHowLongItTakes(days);
            } else if (houseArea > 100 == houseArea <= 200) {
                int days15Pct = (int)(days * 0.15);
                days += days15Pct;
                howLongItTakes.setHowLongItTakes(days);
            } else {
                int days35Pct = (int)(days * 0.35);
                days += days35Pct;
                howLongItTakes.setHowLongItTakes(days);
            }

        }

        logger.info("\n" +
                    "Client's name is "+ client.getNameOfClient()+".\n" +
                    "Area of the house is "+houseArea+" square meters.\n" +
                    "Contractor's company name is "+contractorCompany.getNameOfContractor()+".\n" +
                    "For this work company give "+needEmployees+" employees.\n" +
                    "This work takes "+howLongItTakes.getDays()+" days.\n" +
                    "Price for all work is "+priceForAllWork + "$.\n");
    }


    @Override
    public String toString() {
        return "BuildingCompany{" +
                "nameOfCompany='" + nameOfCompany + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                ", numberOfDoneProjects=" + numberOfDoneProjects +
                ", numberOfOffices=" + numberOfOffices +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildingCompany that = (BuildingCompany) o;
        return Objects.equals(nameOfCompany, that.nameOfCompany) &&
                Objects.equals(numberOfEmployees, that.numberOfEmployees) &&
                Objects.equals(numberOfDoneProjects, that.numberOfDoneProjects) &&
                Objects.equals(numberOfOffices, that.numberOfOffices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfCompany, numberOfEmployees, numberOfDoneProjects, numberOfOffices);
    }
}
