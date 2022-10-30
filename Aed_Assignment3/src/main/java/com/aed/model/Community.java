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



}
