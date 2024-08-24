package com.example.makersharks.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "manufacturers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplierId")
    private Long supplierId;
    @Column(name = "companyName")
    private String companyName;
    @Column(name = "website")
    private String website;
    @Column(name = "location")
    private String location;
    @Column(name = "natureOfBusiness")
    private String natureOfBusiness; // e.g., small_scale, medium_scale, large_scale
    @Column(name = "manufacturingProcesses")
    private String manufacturingProcesses; // e.g., moulding, 3d_printing, casting, coating
    
    
    
	public Long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getNatureOfBusiness() {
		return natureOfBusiness;
	}
	public void setNatureOfBusiness(String natureOfBusiness) {
		this.natureOfBusiness = natureOfBusiness;
	}
	public String getManufacturingProcesses() {
		return manufacturingProcesses;
	}
	public void setManufacturingProcesses(String manufacturingProcesses) {
		this.manufacturingProcesses = manufacturingProcesses;
	}

    // Getters and Setters
}


