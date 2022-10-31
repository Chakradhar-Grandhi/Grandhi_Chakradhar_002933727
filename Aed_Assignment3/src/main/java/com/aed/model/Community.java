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
 * NEUID : 002933727
 */
public class Community {

    private int communityId;
    private String name;
    private String city;
    private String zipcode;
    List<Integer> persons = new ArrayList<>();
    List<Integer> hospitals = new ArrayList<>();

    public Community(int communityId, String name, String city, String zipcode) {
        this.communityId = communityId;
        this.name = name;
        this.city = city;
        this.zipcode = zipcode;
    }
    
    

    public int getCommunityId() {
        return communityId;
    }

    public void setCommunityId(int communityId) {
        this.communityId = communityId;
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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    public void addPerson(int personId){
        persons.add(personId);
        System.out.println("Data Added");
        
                System.out.println(personId + "  Person Added");
    
    }
    public void removePerson(int personId){
        List<Integer> tempList = new ArrayList<>();
        for(int i : persons)
            if(i!=personId)
                tempList.add(i);
        persons = tempList;

    }
    public void addHospital(int hospitalId){
        hospitals.add(hospitalId);
        System.out.println("Data Added");
        
                System.out.println(hospitalId + "  Hospital Added");
    
    }
    
    public void removeHospital(int hospitalId){
        List<Integer> tempList = new ArrayList<>();
        for(int i : hospitals)
            if(i!=hospitalId)
                tempList.add(i);
        hospitals = tempList;
    }
    
    public boolean hospitalExists(int hospitalId){
        int flag = 0;
        for (int i :hospitals){
            if(i==hospitalId){
                flag=1;
            }
        }
        if(flag==1){
            return true;
        }
        return false;
    }
    
    public int hospitalLength(){
    return hospitals.size();
    }
    public int personLength(){
    return persons.size();
    }
    
    



}
