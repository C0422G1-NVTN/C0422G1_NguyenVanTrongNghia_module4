package com.medical.repository;

import com.medical.model.Medical;

import java.util.List;

public interface IMedicalRepository {
List<String> gender();
List<String> nation();
List<String> vehicle();
List<Integer> day();
List<Integer> month();
List<Integer> year();
List<Medical> saveMedical(Medical medical);
}
