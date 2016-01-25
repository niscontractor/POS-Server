/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trt.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author trt
 */
@Entity
@Table(name = "INSURANCE_PURCHASE_DETAILS")
public class InsurancePurchaseDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private long id;
    @Column(name = "NAME",length = 250)
    private String name;
    @Column(name = "BUSINESS_NAME",length = 250)
    private String businessName;
    @Column(name = "ADDRESS",length = 1000)
    private String address;
    @Column(name = "BUSINESS_TYPE", length = 250)
    private String businessType;
    @Column(name = "CONTACT_DETAILS",length = 100)
    private String contactDetails;
    @Column(name = "EMAIL",length = 200)
    private String email;
    @Column(name = "current_insurance",length = 250)
    private String currentInsurance;
    @JoinColumn(name = "INSURANCE_DETAILS_ID", referencedColumnName = "ID")
    @ManyToOne(cascade = CascadeType.ALL)
    private InsuranceDetails insuranceDetails;

    public InsurancePurchaseDetails() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrentInsurance() {
        return currentInsurance;
    }

    public void setCurrentInsurance(String currentInsurance) {
        this.currentInsurance = currentInsurance;
    }

    public InsuranceDetails getInsuranceDetails() {
        return insuranceDetails;
    }

    public void setInsuranceDetails(InsuranceDetails insuranceDetails) {
        this.insuranceDetails = insuranceDetails;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final InsurancePurchaseDetails other = (InsurancePurchaseDetails) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InsurancePurchaseDetails{" + "id=" + id + ", name=" + name + ", businessName=" + businessName + ", address=" + address + ", businessType=" + businessType + ", contactDetails=" + contactDetails + ", email=" + email + ", currentInsurance=" + currentInsurance + ", insuranceDetails=" + insuranceDetails + '}';
    }

}
