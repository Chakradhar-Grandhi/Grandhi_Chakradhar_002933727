/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.model;

import java.util.List;

/**
 *
 * @author Chakradhar Grandhi
 */
public class Doctor {

    private int docterId;
    private String name;
    private List<Hospital> hospitals;

    public int getDocterId() {
        return docterId;
    }

    public void setDocterId(int docterId) {
        this.docterId = docterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public List<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<Hospital> Hospitals) {
        this.hospitals = Hospitals;
    }
}
