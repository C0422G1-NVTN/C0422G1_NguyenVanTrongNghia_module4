package com.example.case_study_module4.model.contract;

import com.example.case_study_module4.model.facility.RentType;

import javax.persistence.*;

@Entity
@Table(name = "contract_detail")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contract_detail")
    private Integer idContractDetail;

    @ManyToOne
    @JoinColumn(name = "id_contract", referencedColumnName = "id_contract")
    private Contract Contract;

    @ManyToOne
    @JoinColumn(name = "id_attach_facility", referencedColumnName = "id_attach_facility")
    private AttachFacility attachFacility;

    @Column(name = "quantity")
    private Integer quantity;

    public ContractDetail() {
    }

    public ContractDetail(Integer idContractDetail,Contract contract, AttachFacility attachFacility, Integer quantity) {
        this.idContractDetail = idContractDetail;
        Contract = contract;
        this.attachFacility = attachFacility;
        this.quantity = quantity;
    }

    public Integer getIdContractDetail() {
        return idContractDetail;
    }

    public void setIdContractDetail(Integer idContractDetail) {
        this.idContractDetail = idContractDetail;
    }

    public com.example.case_study_module4.model.contract.Contract getContract() {
        return Contract;
    }

    public void setContract(Contract contract) {
        Contract = contract;
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
