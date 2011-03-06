package restapi.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "ansatte")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String firstName;
    private String lastName;
    private String seniority;
    private String email;
    private String mobilePhone;
    private String department;
    private String interestGroup;
    private String status;
    private String streetAddress;
    private String postalAddress;
    private String postalNr;
    private String gender;
    private String startDate;
    private String endDate;
    private String imageUrl;
    private String imageData;

    public Employee() {}

    public Employee(int id, String firstName, String lastName, String seniority, String email, String mobilePhone, String department, String interestGroup, String status, String streetAddress, String postalAddress, String postalNr, String gender, String startDate, String endDate, String imageUrl, String imageData) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.seniority = seniority;
        this.email = email;
        this.mobilePhone = mobilePhone;
        this.department = department;
        this.interestGroup = interestGroup;
        this.status = status;
        this.streetAddress = streetAddress;
        this.postalAddress = postalAddress;
        this.postalNr = postalNr;
        this.gender = gender;
        this.startDate = startDate;
        this.endDate = endDate;
        this.imageUrl = imageUrl;
        this.imageData = imageData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getInterestGroup() {
        return interestGroup;
    }

    public void setInterestGroup(String interestGroup) {
        this.interestGroup = interestGroup;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getPostalNr() {
        return postalNr;
    }

    public void setPostalNr(String postalNr) {
        this.postalNr = postalNr;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageData() {
        return imageData;
    }

    public void setImageData(String imageData) {
        this.imageData = imageData;
    }
}

