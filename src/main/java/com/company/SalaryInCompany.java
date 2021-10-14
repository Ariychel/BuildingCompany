package com.company;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class SalaryInCompany {
    String[][] tableOfSalary;
    private static final Logger logger = LogManager.getLogger(SalaryInCompany.class);

    public SalaryInCompany(){
        tableOfSalary = new String[][]{{"Director: ", ""}, {"Owner: ", ""}, {"Engineer: ", ""},
                {"Lawyer: ",""},{"Contractor: ",""}};
    }

    public void setSalary() {
        Scanner scanner = new Scanner(System.in);
        String enterSalary = "Enter salary of every person in company:";
        logger.info(enterSalary);

        for (int i=0; i<5; i++){
                logger.info(tableOfSalary[i][0]);
                String enteredText = scanner.nextLine();
                tableOfSalary[i][1] = enteredText;
        }

    }

    public void getSalary() {
        String table = "Table of Salary:";
        logger.info(table);
        for (int i=0; i<5; i++){
            for (int j=0; j<2; j++){
                logger.info(tableOfSalary[i][j]);
            }
        }
    }
}
