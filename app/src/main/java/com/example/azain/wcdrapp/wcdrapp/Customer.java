package com.example.azain.wcdrapp.wcdrapp;

/**
 * Created by A.Zain on 3/19/2018.
 */

public class Customer {
    private int custId;
    private int custCode;
    private String nameAR;
    private String NameEN;
    private int empId;
    private int lineBrId;

    public Customer(int custId, int custCode, String nameAR, String nameEN, int empId, int lineBrId) {
        this.custId = custId;
        this.custCode = custCode;
        this.nameAR = nameAR;
        NameEN = nameEN;
        this.empId = empId;
        this.lineBrId = lineBrId;
    }

    public Customer(int custId, int custCode, String nameAR, String nameEN) {
        this.custId = custId;
        this.custCode = custCode;
        this.nameAR = nameAR;
        NameEN = nameEN;
    }


    public int getCustId() {
        return custId;
    }

    public int getCustCode() {
        return custCode;
    }

    public String getNameAR() {
        return nameAR;
    }

    public String getNameEN() {
        return NameEN;
    }

    public int getEmpId() {
        return empId;
    }

    public int getLineBrId() {
        return lineBrId;
    }
}
