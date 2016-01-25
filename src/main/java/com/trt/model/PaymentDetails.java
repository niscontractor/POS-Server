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
@Table(name = "PAYMENT_DETAILS")
public class PaymentDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private long id;
    @Column(name = "CARD_TYPE",length = 100)
    private String cardType;
    @Column(name = "CARD_NAME",length = 200)
    private String cardName;
    @Column(name = "CARD_NUMBER",length = 50)
    private String cardNumber;
    @Column(name = "CARD_EXPIRY_MONTH")
    private Integer cardExpiryMonth;
    @Column(name = "CARD_EXPIRY_YEAR")
    private Integer cardExpiryYear;
    private Integer cardSecurityCode;
    @JoinColumn(name = "INSURANCE_PURCHASE_DETAILS_ID", referencedColumnName = "ID")
    @ManyToOne(cascade = CascadeType.ALL)
    private InsurancePurchaseDetails insurancePurchaseDetails;

    public PaymentDetails() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getCardExpiryMonth() {
        return cardExpiryMonth;
    }

    public void setCardExpiryMonth(Integer cardExpiryMonth) {
        this.cardExpiryMonth = cardExpiryMonth;
    }

    public Integer getCardExpiryYear() {
        return cardExpiryYear;
    }

    public void setCardExpiryYear(Integer cardExpiryYear) {
        this.cardExpiryYear = cardExpiryYear;
    }

    public Integer getCardSecurityCode() {
        return cardSecurityCode;
    }

    public void setCardSecurityCode(Integer cardSecurityCode) {
        this.cardSecurityCode = cardSecurityCode;
    }

    public InsurancePurchaseDetails getInsurancePurchaseDetails() {
        return insurancePurchaseDetails;
    }

    public void setInsurancePurchaseDetails(InsurancePurchaseDetails insurancePurchaseDetails) {
        this.insurancePurchaseDetails = insurancePurchaseDetails;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final PaymentDetails other = (PaymentDetails) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PaymentDetails{" + "id=" + id + ", cardType=" + cardType + ", cardName=" + cardName + ", cardNumber=" + cardNumber + ", cardExpiryMonth=" + cardExpiryMonth + ", cardExpiryYear=" + cardExpiryYear + ", cardSecurityCode=" + cardSecurityCode + ", insurancePurchaseDetails=" + insurancePurchaseDetails + '}';
    }

}
