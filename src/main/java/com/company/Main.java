package com.company;

import org.apache.log4j.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);
    public static void main(String[] args) {

        BuildingCompany buildingCompany = new BuildingCompany("Lazar", 24, 4, 2);
        buildingCompany.buildingTheHouse();
        /*BuildingCompany buildingCompany = new BuildingCompany("Lazar",24,4);
        logger.info(buildingCompany.getNumberOfOffices());*/
    }
}
