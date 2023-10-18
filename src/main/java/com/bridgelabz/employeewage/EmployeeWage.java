package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {

    public String employeeAttendance(int num) {
        int employee = 1;
        int employeecheck = num;


        if (employeecheck == employee) {
            return "Present";
        } else {
            return "Absent";

        }


    }

    public String calculateEmployeeSalary(int hour) {

        int wagePerHour = 20;

        int salary = wagePerHour * hour;


        if (salary == 160) {

            return "Full Day Work";
        } else {

        }
        return "Employee is Absent";
    }

    public String checkEmployeeAttendanceBasedOnTheHours(int hours) {

        int wagePerHour = 20;

        if (hours == 8) {
            int salary = wagePerHour * hours;
            return "Full Day Present";

        } else if (hours == 4) {
            int salary = wagePerHour * hours;
            return "Half Day Present";

        }

        return "Employee is Absent";

    }

    public int calculateTheSalaryOfTheEmployeeOnTheBasisOfMonth(int fulldays, int parttime, int absent, int wageperhour) {

        int full_day_empHrs = 8;
        int part_time_empHrs = 4;
        int Full_TIME_WORk = wageperhour * full_day_empHrs;
        int PART_TIME_WORK = wageperhour * part_time_empHrs;
        int salary = Full_TIME_WORk * fulldays;
        int salary1 = PART_TIME_WORK * parttime;
        int totalWage = salary + salary1;
        return totalWage;
    }

    public int calculateTheSalaryOfTheEmployeeOnTheBasisOfMonthAndHours(int fulldays, int parttime, int absent, int wageperhour, int hours) {

        int full_day_empHrs = 8;
        int part_time_empHrs = 4;
        int Full_TIME_WORk = wageperhour * full_day_empHrs;
        int PART_TIME_WORK = wageperhour * part_time_empHrs;
        int salary = Full_TIME_WORk * fulldays;
        int salary1 = PART_TIME_WORK * parttime;
        int totalWage = salary + salary1;
        return totalWage;
    }

    public String calculateEmployeeWageEachCompany(String company, int empRatePerHour, int full_day, int part_time) {
        int full_day_empHrs = 8;
        int part_time_empHrs = 4;
        int Full_TIME_WORk = empRatePerHour * full_day_empHrs;
        int PART_TIME_WORK = empRatePerHour * part_time_empHrs;
        int salary = Full_TIME_WORk * full_day;
        int salary1 = PART_TIME_WORK * part_time;
        int totalWage = salary + salary1;
        String companyWage = "Company Name " + company + " Total salary " + totalWage;
        return companyWage;

    }


}







/*
    public static void main(String[] args) {
        EmployeeWage obj = new EmployeeWage();
        obj.employeeAttendance();
    }


 */
