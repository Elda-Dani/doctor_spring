package com.nestdigital.doctorsApp.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctors")
public class Doctormodel {
@Id
@GeneratedValue

    private int id;
    private String doctorname;
    private String department;
    private String hospital;
    private String address;
    private String doj;
    private String phone;
    private String email;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Doctormodel() {
    }

    public Doctormodel(int id, String doctorname, String department, String hospital, String address, String doj, String phone, String email) {
        this.id = id;
        this.doctorname = doctorname;
        this.department = department;
        this.hospital = hospital;
        this.address = address;
        this.doj = doj;
        this.phone = phone;
        this.email = email;
    }
}
