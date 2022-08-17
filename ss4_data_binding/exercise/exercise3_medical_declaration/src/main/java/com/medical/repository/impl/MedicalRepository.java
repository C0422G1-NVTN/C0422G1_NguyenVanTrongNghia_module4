package com.medical.repository.impl;

import com.medical.model.Medical;
import com.medical.repository.IMedicalRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicalRepository implements IMedicalRepository {
    List<Medical> medicalList = new ArrayList<>();
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
    public List<Medical> saveMedical(Medical medical) {
        medicalList.add(medical);
        return medicalList;
    }
}
