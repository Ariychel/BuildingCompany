package com.company;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Storage extends BuildingCompany{

    private String addressOfStorage;
    private ArrayList<String> listOfMaterials = new ArrayList<String>();
    private ArrayList<Integer> countOfMaterial = new ArrayList<Integer>();

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
        System.out.print(messageOne);
        Scanner in = new Scanner(System.in);
        int countOfMaterials = in.nextInt();

        for (int i=0; i < countOfMaterials; i++){
            Scanner scanner = new Scanner(System.in);
            String messageTwo = "Input name of material - ";
            System.out.print(messageTwo);
            String nameOfMaterial = scanner.nextLine();
            listOfMaterials.add(nameOfMaterial);

            String messageThree = "Input count of this material - ";
            System.out.print(messageThree);
            int count = scanner.nextInt();
            countOfMaterial.add(count);
        }

    }

    void outputListOfMaterials(){
        String messageOne = "   Name      Count   ";
        System.out.println(messageOne);
        for (int i=0; i<listOfMaterials.size(); i++){
            System.out.println(listOfMaterials.get(i)+" "+ countOfMaterial.get(i));
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
