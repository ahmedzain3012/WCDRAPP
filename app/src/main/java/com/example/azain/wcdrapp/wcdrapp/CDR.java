package com.example.azain.wcdrapp.wcdrapp;

/**
 * Created by A.Zain on 3/19/2018.
 */

public class CDR {
    private int custId;
    private int pressId;
    private String pressNameAR;
    private String pressNameEN;
    private int issueId;
    private int issueNo;
    private String issueDate;
    private float issuePrice;
    private int custQty;
    private int rtnQty;

    public CDR(int custId, int pressId, String pressNameAR, String pressNameEN, int issueId, int issueNo, String issueDate, float issuePrice, int custQty, int rtnQty) {
        this.custId = custId;
        this.pressId = pressId;
        this.pressNameAR = pressNameAR;
        this.pressNameEN = pressNameEN;
        this.issueId = issueId;
        this.issueNo = issueNo;
        this.issueDate = issueDate;
        this.issuePrice = issuePrice;
        this.custQty = custQty;
        this.rtnQty = rtnQty;
    }

    public CDR(String pressNameAR, String pressNameEN, int issueNo, int custQty, int rtnQty) {
        this.pressNameAR = pressNameAR;
        this.pressNameEN = pressNameEN;
        this.issueNo = issueNo;
        this.custQty = custQty;
        this.rtnQty = rtnQty;
    }

    public CDR(String pressNameAR, String pressNameEN, int issueNo, String issueDate, int custQty, int rtnQty) {
        this.pressNameAR = pressNameAR;
        this.pressNameEN = pressNameEN;
        this.issueNo = issueNo;
        this.issueDate = issueDate;
        this.custQty = custQty;
        this.rtnQty = rtnQty;
    }

    public int getCustId() {
        return custId;
    }

    public int getPressId() {
        return pressId;
    }

    public String getPressNameAR() {
        return pressNameAR;
    }

    public String getPressNameEN() {
        return pressNameEN;
    }

    public int getIssueId() {
        return issueId;
    }

    public int getIssueNo() {
        return issueNo;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public float getIssuePrice() {
        return issuePrice;
    }

    public int getCustQty() {
        return custQty;
    }

    public int getRtnQty() {
        return rtnQty;
    }
}
