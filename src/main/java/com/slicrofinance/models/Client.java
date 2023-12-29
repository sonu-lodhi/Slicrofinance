package com.slicrofinance.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="clients")
public class Client {
    @Id
    private long id;
    private String name;
    private String fatherName;
    private String gender;
    private String maritalStatus;
    private String education;
    private String panCard;
    private String aadharCard;
    private Date dob;
    private String occupation;
    private String phoneNo;
    private String presentAddress;
    private String city;
    private String pinCode;
    private String religion;
}
