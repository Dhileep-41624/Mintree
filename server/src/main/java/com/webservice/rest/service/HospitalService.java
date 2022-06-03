package com.webservice.rest.service;

import java.util.List;

import com.webservice.rest.entity.*;

public interface HospitalService {

    public Doctor showDoctorInformation(String name);
    // public Patient showPatientInformation(Integer Id);
    public Patient showPatientInfo(String name);
    public boolean saveDoctorInformation(Doctor doctor);
    public boolean savePatientInformation(Patient patient);
    public List<Patient> getPatientListOfDoctor(String name,Doctor doctor);
    public List<Doctor> getDoctors();

}
