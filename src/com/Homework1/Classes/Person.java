package com.Homework1.Classes;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Person {

    @XmlElement(name="ObjectId")
    @JsonProperty("ObjectId")
    private Integer objectId;

    @XmlElement(name = "StateFileNumber")
    @JsonProperty("StateFileNumber")
    private String stateFileNumber;

    @XmlElement(name = "SocialSecurityNumber")
    @JsonProperty("SocialSecurityNumber")
    private String socialSecurityNumber;

    @XmlElement(name = "FirstName")
    @JsonProperty("FirstName")
    private String firstName;

    @XmlElement(name = "MiddleName")
    @JsonProperty("MiddleName")
    private String middleName;

    @XmlElement(name = "LastName")
    @JsonProperty("LastName")
    private String lastName;

    @XmlElement(name = "BirthYear")
    @JsonProperty("BirthYear")
    private Integer birthYear;

    @XmlElement(name = "BirthMonth")
    @JsonProperty("BirthMonth")
    private Integer birthMonth;

    @XmlElement(name = "BirthDay")
    @JsonProperty("BirthDay")
    private Integer birthDay;

    @XmlElement(name = "Gender")
    @JsonProperty("Gender")
    private String gender;

    @XmlElement(name = "NewbornScreeningNumber")
    @JsonProperty("NewbornScreeningNumber")
    private String newbornScreeningNumber;

    @XmlElement(name = "IsPartOfMultipleBirth")
    @JsonProperty("IsPartOfMultipleBirth")
    private String isPartOfMultipleBirth;

    @XmlElement(name = "BirthOrder")
    @JsonProperty("BirthOrder")
    private Integer birthOrder;

    @XmlElement(name = "BirthCounty")
    @JsonProperty("BirthCounty")
    private String birthCounty;

    @XmlElement(name = "MotherFirstName")
    @JsonProperty("MotherFirstName")
    private String motherFirstName;

    @XmlElement(name = "MotherMiddleName")
    @JsonProperty("MotherMiddleName")
    private String motherMiddleName;

    @XmlElement(name = "MotherLastName")
    @JsonProperty("MotherLastName")
    private String motherLastName;

    @XmlElement(name = "Phone1")
    @JsonProperty("Phone1")
    private String phone1;

    @XmlElement(name = "Phone2")
    @JsonProperty("Phone2")
    private String phone2;

    public Integer getObjectId() {
        return objectId;
    }

//    @XmlElement(name = "ObjectId")
    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public String getStateFileNumber() {
        return stateFileNumber;
    }

    public void setStateFileNumber(String stateFileNumber) {
        this.stateFileNumber = stateFileNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(Integer birthMonth) {
        this.birthMonth = birthMonth;
    }

    public Integer getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNewbornScreeningNumber() {
        return newbornScreeningNumber;
    }

    public void setNewbornScreeningNumber(String newbornScreeningNumber) {
        this.newbornScreeningNumber = newbornScreeningNumber;
    }

    public String getIsPartOfMultipleBirth() {
        return isPartOfMultipleBirth;
    }

    public void setIsPartOfMultipleBirth(String isPartOfMultipleBirth) {
        this.isPartOfMultipleBirth = isPartOfMultipleBirth;
    }

    public Integer getBirthOrder() {
        return birthOrder;
    }

    public void setBirthOrder(Integer birthOrder) {
        this.birthOrder = birthOrder;
    }

    public String getBirthCounty() {
        return birthCounty;
    }

    public void setBirthCounty(String birthCountry) {
        this.birthCounty = birthCountry;
    }

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    public String getMotherMiddleName() {
        return motherMiddleName;
    }

    public void setMotherMiddleName(String motherMiddleName) {
        this.motherMiddleName = motherMiddleName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    @Override
    public String toString() {
        return "Person{" +
                "objectId=" + objectId +
                ", stateFileNumber='" + stateFileNumber + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", birthMonth=" + birthMonth +
                ", birthDay=" + birthDay +
                ", gender='" + gender + '\'' +
                ", newbornScreeningNumber='" + newbornScreeningNumber + '\'' +
                ", isPartOfMultipleBirth='" + isPartOfMultipleBirth + '\'' +
                ", birthOrder=" + birthOrder +
                ", birthCountry='" + birthCounty + '\'' +
                ", motherFirstName='" + motherFirstName + '\'' +
                ", motherMiddleName='" + motherMiddleName + '\'' +
                ", motherLastName='" + motherLastName + '\'' +
                ", phone1='" + phone1 + '\'' +
                ", phone2='" + phone2 + '\'' +
                '}';
    }
}
