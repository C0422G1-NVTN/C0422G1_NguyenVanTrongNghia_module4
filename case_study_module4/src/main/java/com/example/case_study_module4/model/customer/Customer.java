package com.example.case_study_module4.model.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Customer{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private String name;

        @Column(columnDefinition = "DATE")
        private String birthday;

        private int gender;
        private String identifyCard;
        private  String phoneNumber;
        private  String email;

        @ManyToOne
        @JoinColumn(name = "customerType", referencedColumnName = "id")
        private CustomerType customerType;

        private String address;

        public Customer() {
        }

        public Customer(Integer id, String name, String birthday, int gender, String identifyCard, String phoneNumber,
                        String email, CustomerType customerType, String address) {
                this.id = id;
                this.name = name;
                this.birthday = birthday;
                this.gender = gender;
                this.identifyCard = identifyCard;
                this.phoneNumber = phoneNumber;
                this.email = email;
                this.customerType = customerType;
                this.address = address;
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getBirthday() {
                return birthday;
        }

        public void setBirthday(String birthday) {
                this.birthday = birthday;
        }

        public int getGender() {
                return gender;
        }

        public void setGender(int gender) {
                this.gender = gender;
        }

        public String getIdentifyCard() {
                return identifyCard;
        }

        public void setIdentifyCard(String identifyCard) {
                this.identifyCard = identifyCard;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public CustomerType getCustomerType() {
                return customerType;
        }

        public void setCustomerType(CustomerType customerType) {
                this.customerType = customerType;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }
}