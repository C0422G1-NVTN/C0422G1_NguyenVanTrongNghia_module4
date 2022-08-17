package com.medical.service;

import com.medical.model.Medical;

import java.util.List;

public interface IMedicalService {
    List<String> gender();

    List<String> nation();

    List<String> vehicle();

    List<Integer> day();

    List<Integer> month();

    List<Integer> year();

    void saveMedical(Medical medical);

    List<Medical> findAllMedical();

    Medical findId(int id);

    void edit(Medical medical);

    void delete(int id);
}
