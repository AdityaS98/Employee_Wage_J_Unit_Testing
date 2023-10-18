package com.bridgelabz.employeewage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeWageTest {
    EmployeeWage obj = new EmployeeWage();

    @Test

    public void checkWhetherEmployeeisPresentOrAbsent() {

        String res = obj.employeeAttendance(1);
        Assertions.assertEquals("Present", res);

    }

    @Test

    public void calculateTheDailyWageOfTheEmployee() {

        String res = obj.calculateEmployeeSalary(8);
        Assertions.assertEquals("Full Day Work", res);


    }

    @Test
    public void calculateTheDailyWageOfTheEmployeeBasedOnTheHours() {

        String res = obj.checkEmployeeAttendanceBasedOnTheHours(8);
        Assertions.assertEquals("Full Day Present", res);

    }

    @Test

    public void calculateTheSalaryOfTheEmployeeBasedOnTheMonth() {
        int res = obj.calculateTheSalaryOfTheEmployeeOnTheBasisOfMonth(10, 10, 0, 20);
        Assertions.assertEquals(2400, res);
    }

    @Test

    public void calculateTheSalaryOfTheEmployeeBasedOnTheMultipleCompanies() {


        String res = obj.calculateEmployeeWageEachCompany("WIPRO", 20, 4, 4);
        String re1 = obj.calculateEmployeeWageEachCompany("TCS", 20, 4, 4);

        Assertions.assertEquals("Company Name WIPRO Total salary 960", res);
        Assertions.assertEquals("Company Name TCS Total salary 960", re1);
    }
}


