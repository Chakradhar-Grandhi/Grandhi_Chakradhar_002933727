/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.model;

import java.util.ArrayList;
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
    List<Integer> doctors = new ArrayList<>();

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

    public boolean docExists(int docId){
        int flag = 0;
        for (int i :doctors){
            if(i==docId){
                flag=1;
            }
        }
        if(flag==1){
            return true;
        }
        return false;
    }
        public void addDoctor(int doctorId){
        doctors.add(doctorId);
        System.out.println("Data Added");
        
                System.out.println(doctorId + "  Doctor Added");
    
    }
    
    public void removeDoctor(int doctorId){
        List<Integer> tempList = new ArrayList<>();
        for(int i : doctors)
            if(i!=doctorId)
                tempList.add(i);
        doctors = tempList;
    }

    public List<Integer> getDoctors() {
        return doctors;
    }

    public int docSize() {
        return doctors.size();
    }
   
    
}
