package solid.live.srp;

import java.util.*;


public class Employee {
    private int empId;
    private static int TOTAL_LEAVES_ALLOWED = 30;

    private double monthlySalary;
    private String name;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;
    private int leavesTaken;
    private int totalLeaveAllowed;
    private int leaveTaken;
    private String manager;
    private int yearsInOrg;
    private int thisYear;
    private int[] leavesLeftPreviously;



    public int getEmpId() {
        return empId;
    }

    public static int getTotalLeavesAllowed() {
        return TOTAL_LEAVES_ALLOWED;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public String getName() {
        return name;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public int getTotalLeaveAllowed() {
        return totalLeaveAllowed;
    }

    public int getLeaveTaken() {
        return leaveTaken;
    }

    public String getManager() {
        return manager;
    }

    public int getYearsInOrg() {
        return yearsInOrg;
    }

    public int getThisYear() {
        return thisYear;
    }

    public int[] getLeavesLeftPreviously() {
        return leavesLeftPreviously;
    }


    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public Employee() {
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        HtmlFormatter.toHtml(e1);
        // System.out.println(s1);

    }
    //other method related to customer
}


