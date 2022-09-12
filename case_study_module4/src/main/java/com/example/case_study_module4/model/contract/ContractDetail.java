package com.example.case_study_module4.model.contract;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "contract_detail")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_detail_id")
    private Integer idContractDetail;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "contract_id", referencedColumnName = "contractId")
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "attach_facility_id", referencedColumnName = "attach_facility_id")
    private AttachFacility attachFacility;

    @Column(name = "quantity")
    private Integer quantity;

    public ContractDetail() {
    }

    public ContractDetail(Integer idContractDetail,Contract contract, AttachFacility attachFacility, Integer quantity) {
        this.idContractDetail = idContractDetail;
        this.contract = contract;
        this.attachFacility = attachFacility;
        this.quantity = quantity;
    }

    public Integer getIdContractDetail() {
        return idContractDetail;
    }

    public void setIdContractDetail(Integer idContractDetail) {
        this.idContractDetail = idContractDetail;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachFacility getAttachFacility() {
        return attachFacility;
    }

    public void setAttachFacility(AttachFacility attachFacility) {
        this.attachFacility = attachFacility;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
