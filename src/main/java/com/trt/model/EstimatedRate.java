/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trt.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "ESTIMATED_RATE")
public class EstimatedRate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private long id;
    @Column(name = "RATE")
    private Double rate;
    @Column(name = "COVERAGE_PL")
    private Double coveragePl;
    @Column(name = "COVERAGE_GL")
    private Double coverageGl;
    @Column(name = "COVERAGE_PROPERTY")
    private Double coverageProperty;
    @Column(name = "COVERAGE_PL_FLAG")
    private Boolean coveragePlFlag;
    @Column(name = "COVERAGE_GL_FLAG")
    private Boolean coverageGlFlag;
    @Column(name = "COVERAGE_PROPERTY_FLAG")
    private Boolean coveragePropertyFlag;
    @JoinColumn(name = "INSURANCE_DETAILS_ID", referencedColumnName = "ID")
    @ManyToOne(cascade = CascadeType.ALL)
    private InsuranceDetails insuranceDetails;

    public EstimatedRate() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getCoveragePl() {
        return coveragePl;
    }

    public void setCoveragePl(Double coveragePl) {
        this.coveragePl = coveragePl;
    }

    public Double getCoverageGl() {
        return coverageGl;
    }

    public void setCoverageGl(Double coverageGl) {
        this.coverageGl = coverageGl;
    }

    public Double getCoverageProperty() {
        return coverageProperty;
    }

    public void setCoverageProperty(Double coverageProperty) {
        this.coverageProperty = coverageProperty;
    }

    public InsuranceDetails getInsuranceDetails() {
        return insuranceDetails;
    }

    public void setInsuranceDetails(InsuranceDetails insuranceDetails) {
        this.insuranceDetails = insuranceDetails;
    }

    public Boolean getCoveragePlFlag() {
        return coveragePlFlag;
    }

    public void setCoveragePlFlag(Boolean coveragePlFlag) {
        this.coveragePlFlag = coveragePlFlag;
    }

    public Boolean getCoverageGlFlag() {
        return coverageGlFlag;
    }

    public void setCoverageGlFlag(Boolean coverageGlFlag) {
        this.coverageGlFlag = coverageGlFlag;
    }

    public Boolean getCoveragePropertyFlag() {
        return coveragePropertyFlag;
    }

    public void setCoveragePropertyFlag(Boolean coveragePropertyFlag) {
        this.coveragePropertyFlag = coveragePropertyFlag;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final EstimatedRate other = (EstimatedRate) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EstimatedRate{" + "id=" + id + ", rate=" + rate + ", coveragePl=" + coveragePl + ", coverageGl=" + coverageGl + ", coverageProperty=" + coverageProperty + ", coveragePlFlag=" + coveragePlFlag + ", coverageGlFlag=" + coverageGlFlag + ", coveragePropertyFlag=" + coveragePropertyFlag + ", insuranceDetails=" + insuranceDetails + '}';
    }

}
