/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.model;

import java.util.List;

/**
 *
 * @author Chakradhar Grandhi
 * NEUID:002933727
 */
public class Hospital {

    private int hospitalId;
    private String name;
    private String city;
    private int community;
    private List<Doctor> doctors;

    public Hospital(int hospitalId, String name, String city, int community) {
        this.hospitalId = hospitalId;
        this.name = name;
        this.city = city;
        this.community = community;
    }
    
    
    

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCommunity() {
        return community;
    }

    public void setCommunity(int community) {
        this.community = community;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }
}
