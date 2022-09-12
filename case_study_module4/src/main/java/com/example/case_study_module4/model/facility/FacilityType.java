package com.example.case_study_module4.model.facility;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "facility_type")
public class FacilityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "facility_type_id")
    private Integer facilityTypeId;
    @Column(name = "facility_type_name")
    private String facilityTypeName;

    @OneToMany (mappedBy = "facilityType")
    Set<Facility> facilitySet;

    public Set<Facility> getFacilitySet() {
        return facilitySet;
    }

    public void setFacilitySet(Set<Facility> facilitySet) {
        this.facilitySet = facilitySet;
    }

    public FacilityType() {
    }

    public FacilityType(Integer facilityTypeId, String facilityTypeName) {
        this.facilityTypeId = facilityTypeId;
        this.facilityTypeName = facilityTypeName;
    }

    public Integer getFacilityTypeId() {
        return facilityTypeId;
    }

    public void setFacilityTypeId(Integer facilityTypeId) {
        this.facilityTypeId = facilityTypeId;
    }

    public String getFacilityTypeName() {
        return facilityTypeName;
    }

    public void setFacilityTypeName(String facilityTypeName) {
        this.facilityTypeName = facilityTypeName;
    }


}
