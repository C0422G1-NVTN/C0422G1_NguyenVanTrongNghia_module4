package com.example.case_study_module4.model.contract;

import com.example.case_study_module4.model.customer.Customer;
import com.example.case_study_module4.model.facility.Facility;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id")
    private Integer idContract;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "facility_id", referencedColumnName = "facility_id")
    private Facility facility;

    @Column(columnDefinition = "DATE", name = "start_date")
    private String startDate;

    @Column(columnDefinition = "DATE", name = "end_date")
    private String endDate;

    private double deposit;

    @OneToMany(mappedBy = "Contract")
    private Set<ContractDetail> contractDetails;

    public Contract() {
    }

    public Contract(Integer idContract, Customer customer, Facility facility, String startDate,
                    String endDate, double deposit) {
        this.idContract = idContract;
        this.customer = customer;
        this.facility = facility;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
    }

    public Integer getIdContract() {
        return idContract;
    }

    public void setIdContract(Integer idContract) {
        this.idContract = idContract;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
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

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
