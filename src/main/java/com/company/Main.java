package com.company;

import java.lang.reflect.Field;
import java.util.stream.Stream;

import org.apache.log4j.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {

       BuildingCompany buildingCompany = new BuildingCompany("Lazar", 24, 4, 2);
       // buildingCompany.buildingTheHouse();

       /* buildingCompany.setNumberOfEmployees(10);
        EngineeringDepartment engineeringDepartment = new EngineeringDepartment();
        engineeringDepartment.setNumberOfEngineers(14, buildingCompany, new LawDepartment());*/

       //buildingCompany.setNameWithEnum();
        //LOGGER.info(buildingCompany.getNameOfCompany());

        Class<BuildingCompany> buildingCompanyClass = BuildingCompany.class;
        Field[] declaredFields = buildingCompanyClass.getDeclaredFields();
        Stream.of(declaredFields).forEach(LOGGER::info);

        Class<? extends BuildingCompany> buildingCompanyClass_1 = buildingCompany.getClass();
        Field nameOfCompanyField = buildingCompanyClass_1.getDeclaredField("nameOfCompany");

        nameOfCompanyField.setAccessible(true);//give access to private and protected variables
        String nameCompany = (String) nameOfCompanyField.get(buildingCompany);
        LOGGER.info(nameCompany);
    }
}
