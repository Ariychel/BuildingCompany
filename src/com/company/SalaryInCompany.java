package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
public class SalaryInCompany implements InterfaceForSalary {
    String[][] tableOfSalary;

    public SalaryInCompany(){
        tableOfSalary = new String[][]{{"Director: ", ""}, {"Owner: ", ""}, {"Engineer: ", ""},
                {"Lawyer: ",""},{"Contractor: ",""}};
    }
    @Override
    public void setSalary() {
        Scanner scanner = new Scanner(System.in);
        String messageOne = "Enter salary of every person if company:";
        System.out.println(messageOne);

        for (int i=0; i<5; i++){
                System.out.print(tableOfSalary[i][0]);
                String enteredText = scanner.nextLine();
                tableOfSalary[i][1] = enteredText;
        }

        System.out.println();

    }

    @Override
    public void getSalary() {
        String messageOne = "Table of Salary:";
        System.out.println(messageOne);
        for (int i=0; i<5; i++){
            for (int j=0; j<2; j++){
                System.out.print(tableOfSalary[i][j]);
            }
            System.out.println();
        }
    }
}
