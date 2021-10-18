package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Storage {

    private String addressOfStorage;
    private ArrayList<String> listOfMaterials = new ArrayList<String>();
    private ArrayList<Integer> countOfMaterial = new ArrayList<Integer>();
    private static final Logger LOGGER = Logger.getLogger(Storage.class);

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
        String messageOne = "Enter count of materials - ";
        LOGGER.info(messageOne);
        Scanner in = new Scanner(System.in);
        int countOfMaterials = in.nextInt();

        for (int i=0; i < countOfMaterials; i++){
            Scanner scanner = new Scanner(System.in);
            String messageTwo = "Enter name of material - ";
            LOGGER.info(messageTwo);
            String nameOfMaterial = scanner.nextLine();
            listOfMaterials.add(nameOfMaterial);

            String messageThree = "Enter count of this material - ";
            LOGGER.info(messageThree);
            int count = scanner.nextInt();
            countOfMaterial.add(count);
        }

    }

    void outputListOfMaterials(){
        String messageOne = "   Name      Count   ";
        LOGGER.info(messageOne);
        for (int i=0; i<listOfMaterials.size(); i++){
            LOGGER.info(listOfMaterials.get(i)+" "+ countOfMaterial.get(i));
        }
    }

    @Override
    public String toString() {
        return "Storage{" +
                "addressOfStorage='" + addressOfStorage + '\'' +
                ", listOfMaterials=" + listOfMaterials +
                ", countOfMaterial=" + countOfMaterial +
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
