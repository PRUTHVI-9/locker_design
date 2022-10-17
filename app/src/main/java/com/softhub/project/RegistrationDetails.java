package com.softhub.project;

public class RegistrationDetails {
    String customer_uid;
    String customer_name;
    String customer_contact;
    String customer_email;
    String customer_mobile_brand;
    String customer_payment;
    String customer_loan;
    String startDate;
    String endDate;
    String amount;
    String anti_theft_plan;
    String vendorId;
    String downpaymet;
    String emi_tenure;
    String photo;

    public RegistrationDetails(String customer_uid, String customer_name, String customer_contact, String customer_email, String customer_mobile_brand, String customer_payment, String customer_loan, String startDate, String endDate, String amount, String anti_theft_plan, String vendorId, String downpaymet, String emi_tenure, String photo) {
        this.customer_uid = customer_uid;
        this.customer_name = customer_name;
        this.customer_contact = customer_contact;
        this.customer_email = customer_email;
        this.customer_mobile_brand = customer_mobile_brand;
        this.customer_payment = customer_payment;
        this.customer_loan = customer_loan;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
        this.anti_theft_plan = anti_theft_plan;
        this.vendorId = vendorId;
        this.downpaymet = downpaymet;
        this.emi_tenure = emi_tenure;
        this.photo = photo;
    }

    public RegistrationDetails(String customer_uid, String customer_name, String customer_contact, String customer_email, String customer_mobile_brand, String customer_payment, String customer_loan, String startDate, String endDate, String amount, String anti_theft_plan, String vendorId) {
        this.customer_uid = customer_uid;
        this.customer_name = customer_name;
        this.customer_contact = customer_contact;
        this.customer_email = customer_email;
        this.customer_mobile_brand = customer_mobile_brand;
        this.customer_payment = customer_payment;
        this.customer_loan = customer_loan;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
        this.anti_theft_plan = anti_theft_plan;
        this.vendorId = vendorId;
    }

    public String getCustomer_uid() {
        return customer_uid;
    }

    public void setCustomer_uid(String customer_uid) {
        this.customer_uid = customer_uid;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_contact() {
        return customer_contact;
    }

    public void setCustomer_contact(String customer_contact) {
        this.customer_contact = customer_contact;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_mobile_brand() {
        return customer_mobile_brand;
    }

    public void setCustomer_mobile_brand(String customer_mobile_brand) {
        this.customer_mobile_brand = customer_mobile_brand;
    }

    public String getCustomer_payment() {
        return customer_payment;
    }

    public void setCustomer_payment(String customer_payment) {
        this.customer_payment = customer_payment;
    }

    public String getCustomer_loan() {
        return customer_loan;
    }

    public void setCustomer_loan(String customer_loan) {
        this.customer_loan = customer_loan;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAnti_theft_plan() {
        return anti_theft_plan;
    }

    public void setAnti_theft_plan(String anti_theft_plan) {
        this.anti_theft_plan = anti_theft_plan;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getDownpaymet() {
        return downpaymet;
    }

    public void setDownpaymet(String downpaymet) {
        this.downpaymet = downpaymet;
    }

    public String getEmi_tenure() {
        return emi_tenure;
    }

    public void setEmi_tenure(String emi_tenure) {
        this.emi_tenure = emi_tenure;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
