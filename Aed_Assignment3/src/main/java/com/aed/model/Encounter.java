/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.model;

/**
 *
 * @author Chakradhar Grandhi
 * NEUID:002933727
 */
public class Encounter {

    private int encounterID;
    private int personId;
    private VitalSigns vitalSign;
    private String dateOfEncounter;
    private String comment;

    public Encounter(int encounterID, int personId, VitalSigns vitalSign, String dateOfEncounter, String comment, String status, int doctorId, int hospitalId) {
        this.encounterID = encounterID;
        this.personId = personId;
        this.vitalSign = vitalSign;
        this.dateOfEncounter = dateOfEncounter;
        this.comment = comment;
        this.status = status;
        this.doctorId = doctorId;
        this.hospitalId = hospitalId;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }
    private String status; //can be enum("accepted","rejected","pending")
    private int doctorId;
    private int hospitalId;

    public int getEncounterID() {
        return encounterID;
    }

    public void setEncounterID(int encounterID) {
        this.encounterID = encounterID;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public VitalSigns getVitalSigns() {
        return vitalSign;
    }

    public void setVitalSigns(VitalSigns vitalSign) {
        this.vitalSign = vitalSign;
    }

    public String getDateOfEncounter() {
        return dateOfEncounter;
    }

    public void setDateOfEncounter(String dateOfEncounter) {
        this.dateOfEncounter = dateOfEncounter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

}
