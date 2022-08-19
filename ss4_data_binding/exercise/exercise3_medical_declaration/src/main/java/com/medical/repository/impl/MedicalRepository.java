package com.medical.repository.impl;

import com.medical.model.Medical;
import com.medical.repository.IMedicalRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicalRepository implements IMedicalRepository {
    private List<Medical> medicalList = new ArrayList<>();
    private static List<String> genders = new ArrayList<>();
    private static List<String> nations = new ArrayList<>();
    private static List<String> vehicles = new ArrayList<>();
    private static List<Integer> days = new ArrayList<>();
    private static List<Integer> months = new ArrayList<>();
    private static List<Integer> years = new ArrayList<>();

    static {
        genders.add("male");
        genders.add("female");
        genders.add("lgbt");
    }

    static {
        nations.add("USA");
        nations.add("ENG");
        nations.add("VIE");
        nations.add("THAI");
        nations.add("CAM");
    }

    static {
        vehicles.add("Tàu bay");
        vehicles.add("Tàu thuyền");
        vehicles.add("Ô tô");
        vehicles.add("Khác (ghi rõ)");
    }

    static {
        for (int i = 1; i < 31; i++) {
            days.add(i);
        }
    }

    static {
        for (int i = 1; i < 13; i++) {
            months.add(i);
        }
    }

    static {
        for (int i = 1990; i < 2023; i++) {
            years.add(i);
        }
    }

    @Override
    public List<String> gender() {
        return genders;
    }

    @Override
    public List<String> nation() {
        return nations;
    }

    @Override
    public List<String> vehicle() {
        return vehicles;
    }

    @Override
    public List<Integer> day() {
        return days;
    }

    @Override
    public List<Integer> month() {
        return months;
    }

    @Override
    public List<Integer> year() {
        return years;
    }

    @Override
    public void saveMedical(Medical medical) {
        int id = (int) (Math.random() * 1000);
        medical.setId(id);
        medicalList.add(medical);
    }

    @Override
    public List<Medical> findAllMedical() {
        return medicalList;
    }

    @Override
    public Medical findId(int id) {
        Medical medical = new Medical();
        for (int i = 0; i < medicalList.size(); i++) {
            if (id == medicalList.get(i).getId()) {
                medical = medicalList.get(i);
            }
        }
        return medical;
    }

    @Override
    public void edit(Medical medical) {
        for (int i = 0; i < medicalList.size(); i++) {
            if (medical.getId() == medicalList.get(i).getId()) {
//                medicalList.get(i).setName(medical.getName());
//                medicalList.get(i).setBirthday(medical.getBirthday());
//                medicalList.get(i).setGender(medical.getGender());
//                medicalList.get(i).setNation(medical.getNation());
//                medicalList.get(i).setIdCard(medical.getIdCard());
//                medicalList.get(i).setVehicle(medical.getVehicle());
//                medicalList.get(i).setIdVehicle(medical.getIdVehicle());
//                medicalList.get(i).setIdSeat(medical.getIdSeat());
//                medicalList.get(i).setStartDay(medical.getStartDay());
//                medicalList.get(i).setStartMonth(medical.getStartMonth());
//                medicalList.get(i).setStartYear(medical.getStartYear());
//                medicalList.get(i).setEndDay(medical.getStartDay());
//                medicalList.get(i).setEndMonth(medical.getEndMonth());
//                medicalList.get(i).setEndYear(medical.getEndYear());
                BeanUtils.copyProperties(medicalList.get(i), medical);
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < medicalList.size(); i++) {
            if (id == medicalList.get(i).getId()) {
                medicalList.remove(medicalList.get(i));
            }
        }
    }
}
