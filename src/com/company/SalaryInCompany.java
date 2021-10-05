package com.company;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class SalaryInCompany implements InterfaceForSalary {
    String[][] tableOfSalary;
    private static final Logger logger = LogManager.getLogger(SalaryInCompany.class);

    public SalaryInCompany(){
        tableOfSalary = new String[][]{{"Director: ", ""}, {"Owner: ", ""}, {"Engineer: ", ""},
                {"Lawyer: ",""},{"Contractor: ",""}};
    }
    @Override
    public void setSalary() {
        Scanner scanner = new Scanner(System.in);
        String messageOne = "Enter salary of every person if company:";
        logger.info(messageOne);

        for (int i=0; i<5; i++){
                logger.info(tableOfSalary[i][0]);
                String enteredText = scanner.nextLine();
                tableOfSalary[i][1] = enteredText;
        }

    }

    @Override
    public void getSalary() {
        String messageOne = "Table of Salary:";
        logger.info(messageOne);
        for (int i=0; i<5; i++){
            for (int j=0; j<2; j++){
                logger.info(tableOfSalary[i][j]);
            }
        }
    }
}
