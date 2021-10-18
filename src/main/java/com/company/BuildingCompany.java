package com.company;

import java.util.Objects;
import java.util.Scanner;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public class BuildingCompany {
    private String nameOfCompany;
    protected int numberOfEmployees, numberOfDoneProjects, numberOfOffices;
    private static final Logger LOGGER = Logger.getLogger(BuildingCompany.class);

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

    public BuildingCompany(String nameOfCompany, int numberOfEmployees, int numberOfDoneProjects){
        this.nameOfCompany=nameOfCompany;
        this.numberOfEmployees=numberOfEmployees;
        this.numberOfDoneProjects=numberOfDoneProjects;
        this.numberOfOffices = RandomUtils.nextInt(5,15);
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
            LOGGER.info(messageOne);
            String clientName = scanner.nextLine();
            client.setNameOfClient(clientName);
        }

        int houseArea;
        {
            Scanner scanner = new Scanner(System.in);
            String messageOne = "Enter area of the house: ";
            LOGGER.info(messageOne);
            houseArea = scanner.nextInt();
        }

        int priceForAllWork;
        {
            Scanner scanner = new Scanner(System.in);
            String messageOne = "Enter price for one square meter(USA Dollar): ";
            LOGGER.info(messageOne);
            double priceForOneSquareMeter = scanner.nextDouble();
            priceForAllWork = (int)(houseArea * priceForOneSquareMeter);
        }

        ContractorCompany contractorCompany = new ContractorCompany();
        {
            Scanner scanner = new Scanner(System.in);
            String messageOne = "Enter contractor's company name: ";
            LOGGER.info(messageOne);
            String contractorCompanyName = scanner.nextLine();
            contractorCompany.setNameOfContractor(contractorCompanyName);

            String messageTwo = "Enter count of number of employees: ";
            LOGGER.info(messageTwo);
            int numberOfEmployees = scanner.nextInt();
            contractorCompany.setNumberOfEmployees(numberOfEmployees);
        }

        int needEmployees;
        {

            int quaterMetersForOne = 10, tmpNeedEmployees = houseArea / quaterMetersForOne + 1;

            if (tmpNeedEmployees <= contractorCompany.getNumberOfEmployees()){
                needEmployees = tmpNeedEmployees;
            } else {
                needEmployees = contractorCompany.getNumberOfEmployees();
            }
        }

        Time howLongItTakes = new Time();
        {
            int timeForOneEmployee = 35, OneHundredQM = 100, TwoHundredQM = 200;
            double areaForOneEmployee = houseArea / needEmployees, pct15 = 0.15, pct35 = 0.35;
            int days = (int)(areaForOneEmployee * timeForOneEmployee);
            if (houseArea <= OneHundredQM){
                howLongItTakes.setHowLongItTakes(days);
            } else if (houseArea > OneHundredQM == houseArea <= TwoHundredQM) {
                int days15Pct = (int)(days * pct15);
                days += days15Pct;
                howLongItTakes.setHowLongItTakes(days);
            } else {
                int days35Pct = (int)(days * pct35);
                days += days35Pct;
                howLongItTakes.setHowLongItTakes(days);
            }

        }

        String endList = "\n" +
                "Client's name is "+ client.getNameOfClient()+".\n" +
                "Area of the house is "+houseArea+" square meters.\n" +
                "Contractor's company name is "+contractorCompany.getNameOfContractor()+".\n" +
                "For this work company give "+needEmployees+" employees.\n" +
                "This work takes "+howLongItTakes.getDays()+" days.\n" +
                "Price for all work is "+priceForAllWork + "$.\n";
        boolean ifEmpty = StringUtils.isEmpty(endList);
        LOGGER.info(endList+"\n"+"This string is "+ifEmpty);
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
