package com.company;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Storage extends BuildingCompany{

    private String addressOfStorage;
    private ArrayList<String> listOfMaterials = new ArrayList<String>();
    private ArrayList<Integer> countOfMaterial = new ArrayList<Integer>();
    private static final Logger logger = LogManager.getLogger(Storage.class);

    public Storage(){
        addressOfStorage = "";
    }

    public Storage(String adressOfStorage){
        this.addressOfStorage = adressOfStorage;
    }

    void setAddressOfStorage(String addressOfStorage){
        this.addressOfStorage = addressOfStorage;
    }

    String getAddressOfStorage(){
        return addressOfStorage;
    }

    void inputListOfMaterials(){
        String messageOne = "Input count of materials - ";
        logger.info(messageOne);
        Scanner in = new Scanner(System.in);
        int countOfMaterials = in.nextInt();

        for (int i=0; i < countOfMaterials; i++){
            Scanner scanner = new Scanner(System.in);
            String messageTwo = "Input name of material - ";
            logger.info(messageTwo);
            String nameOfMaterial = scanner.nextLine();
            listOfMaterials.add(nameOfMaterial);

            String messageThree = "Input count of this material - ";
            logger.info(messageThree);
            int count = scanner.nextInt();
            countOfMaterial.add(count);
        }

    }

    void outputListOfMaterials(){
        String messageOne = "   Name      Count   ";
        logger.info(messageOne);
        for (int i=0; i<listOfMaterials.size(); i++){
            logger.info(listOfMaterials.get(i)+" "+ countOfMaterial.get(i));
        }
    }

    @Override
    public String toString() {
        return "Materials{" +
                "adressOfStorage='" + addressOfStorage + '\'' +
                ", nameOfCompany='" + nameOfCompany + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                ", numberOfDoneProjects=" + numberOfDoneProjects +
                ", numberOfOffices=" + numberOfOffices +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Storage materials = (Storage) o;
        return Objects.equals(addressOfStorage, materials.addressOfStorage) &&
                Objects.equals(listOfMaterials, materials.listOfMaterials) &&
                Objects.equals(countOfMaterial, materials.countOfMaterial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), addressOfStorage, listOfMaterials, countOfMaterial);
    }

}
