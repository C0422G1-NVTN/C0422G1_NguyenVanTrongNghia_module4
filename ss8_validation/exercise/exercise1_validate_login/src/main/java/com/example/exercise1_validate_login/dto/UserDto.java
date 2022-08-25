package com.example.exercise1_validate_login.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.Period;


public class UserDto implements Validator {

    @NotBlank(message = "Vui long nhap lai voi.")
    @Size(min = 5, max = 45)
    @Pattern(regexp = "[A-Za-z]+", message = "Wrong format!!! (@Pattern)")
    private String firstName;

    @NotBlank(message = "Vui long nhap lai voi.")
    @Size(min = 5, max = 45)
    @Pattern(regexp = "[A-Za-z]+", message = "Wrong format!!! (@Pattern)")
    private String lastName;

    @NotBlank(message = "Vui long nhap lai voi.")
    @Pattern(regexp = "(09|03|07|08|05)+([0-9]{8})", message = "Nhập sai rồi ông (@Pattern)")
    private String phoneNumber;

    @NotBlank(message = "Vui long nhap lai voi.")
    private String age;

    @NotBlank(message = "Vui long nhap lai voi.")
    @Email
    private String email;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto) target;
        String ageVal = userDto.age;
        LocalDate localDate = null;
        Period period;
        try {
            localDate = LocalDate.parse(ageVal);
            period = Period.between(localDate,LocalDate.now());
            if (period.getYears()<18){
                errors.rejectValue("age","add.age","Phải lớn hơn hoặc bằng 18 tuổi!!!");
            }
        }catch (Exception e){
            errors.rejectValue("age","add.age","Khong dc null!!!");
        }


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
