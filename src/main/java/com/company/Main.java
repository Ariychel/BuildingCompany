package com.company;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        BuildingCompany buildingCompany = new BuildingCompany("Lazar", 24, 4, 2);
        buildingCompany.buildingTheHouse();
    }
}
