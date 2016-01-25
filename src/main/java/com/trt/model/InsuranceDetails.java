/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trt.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author trt
 */
@Entity
@Table(name = "INSURANCE_DETAILS")
public class InsuranceDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private long id;
    @Column(name = "LOCATION", length = 20)
    private String location;
    @Column(name = "ZIP", length = 20)
    private String zip;
    @Column(name = "OTHER_LOCATION")
    private Integer otherLocation;
    @Column(name = "CURRENTLY_INSURED")
    private Boolean currentlyInsured;
    @Column(name = "CLAIM_IN_5_YEARS")
    private Boolean claimIn5Years;
    @Column(name = "START_YEAR")
    private Integer startYear;
    @Column(name = "NEXT_12M_SALES", length = 250)
    private String next12MSales;
    @Column(name = "NEXT_12M_PAYROLL", length = 250)
    private String next12MPayroll;
    @Column(name = "BIGGEST_CUSTOMER", length = 250)
    private String biggestCustomer;
    @Column(name = "EQUIPMENT_VALUE", length = 250)
    private String equipmentValue;
    @Column(name = "EMPLOYEES", length = 250)
    private String employees;
    @Column(name = "ACTIVITY_CONDUCTED")
    private Boolean activityConducted;
    @Column(name = "INSURANCE_RATE")
    private Double insuranceRate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "POLICY_START_DATE")
    private Date policyStartDate;

    public InsuranceDetails() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Integer getOtherLocation() {
        return otherLocation;
    }

    public void setOtherLocation(Integer otherLocation) {
        this.otherLocation = otherLocation;
    }

    public Boolean getCurrentlyInsured() {
        return currentlyInsured;
    }

    public void setCurrentlyInsured(Boolean currentlyInsured) {
        this.currentlyInsured = currentlyInsured;
    }

    public Boolean getClaimIn5Years() {
        return claimIn5Years;
    }

    public void setClaimIn5Years(Boolean claimIn5Years) {
        this.claimIn5Years = claimIn5Years;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public String getNext12MSales() {
        return next12MSales;
    }

    public void setNext12MSales(String next12MSales) {
        this.next12MSales = next12MSales;
    }

    public String getNext12MPayroll() {
        return next12MPayroll;
    }

    public void setNext12MPayroll(String next12MPayroll) {
        this.next12MPayroll = next12MPayroll;
    }

    public String getBiggestCustomer() {
        return biggestCustomer;
    }

    public void setBiggestCustomer(String biggestCustomer) {
        this.biggestCustomer = biggestCustomer;
    }

    public String getEquipmentValue() {
        return equipmentValue;
    }

    public void setEquipmentValue(String equipmentValue) {
        this.equipmentValue = equipmentValue;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public Boolean getActivityConducted() {
        return activityConducted;
    }

    public void setActivityConducted(Boolean activityConducted) {
        this.activityConducted = activityConducted;
    }

    public Double getInsuranceRate() {
        return insuranceRate;
    }

    public void setInsuranceRate(Double insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

    public Date getPolicyStartDate() {
        return policyStartDate;
    }

    public void setPolicyStartDate(Date policyStartDate) {
        this.policyStartDate = policyStartDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InsuranceDetails other = (InsuranceDetails) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InsuranceDetails{" + "id=" + id + ", location=" + location + ", zip=" + zip + ", otherLocation=" + otherLocation + ", currentlyInsured=" + currentlyInsured + ", claimIn5Years=" + claimIn5Years + ", startYear=" + startYear + ", next12MSales=" + next12MSales + ", next12MPayroll=" + next12MPayroll + ", biggestCustomer=" + biggestCustomer + ", equipmentValue=" + equipmentValue + ", employees=" + employees + ", activityConducted=" + activityConducted + ", insuranceRate=" + insuranceRate + ", policyStartDate=" + policyStartDate + '}';
    }

}
