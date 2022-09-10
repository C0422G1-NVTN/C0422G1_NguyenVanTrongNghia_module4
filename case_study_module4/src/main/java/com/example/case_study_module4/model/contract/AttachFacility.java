package com.example.case_study_module4.model.contract;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "attach_facility")
public class AttachFacility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attach_facility_id")
    private Integer idAttachFacility;

    @Column(name = "attach_facility_name")
    private String nameAttachFacility;

    @Column(name = "price")
    private Double price;

    @Column(name = "unit")
    private String unit;

    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "attachFacility")
    private Set<ContractDetail> contractDetails;


    public AttachFacility() {
    }

    public AttachFacility(Integer idAttachFacility, String nameAttachFacility, Double price, String unit, String status) {
        this.idAttachFacility = idAttachFacility;
        this.nameAttachFacility = nameAttachFacility;
        this.price = price;
        this.unit = unit;
        this.status = status;
    }

    public Integer getIdAttachFacility() {
        return idAttachFacility;
    }

    public void setIdAttachFacility(Integer idAttachFacility) {
        this.idAttachFacility = idAttachFacility;
    }

    public String getNameAttachFacility() {
        return nameAttachFacility;
    }

    public void setNameAttachFacility(String nameAttachFacility) {
        this.nameAttachFacility = nameAttachFacility;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
