package com.example.makersharks.dto;

import com.example.makersharks.entity.Supplier;

public class SupplierDto {

    private Long supplierId;
    private String companyName;
    private String website;
    private String location;
    private String natureOfBusiness;
    private String manufacturingProcesses;
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

	    // Getters, Setters, Constructors

	    // Constructor
	    public SupplierDto(Long supplierId, String companyName, String website, String location, String natureOfBusiness, String manufacturingProcesses) {
	        this.supplierId = supplierId;
	        this.companyName = companyName;
	        this.website = website;
	        this.location = location;
	        this.natureOfBusiness = natureOfBusiness;
	        this.manufacturingProcesses = manufacturingProcesses;
	    }

	    // Static method to map Supplier entity to SupplierDto
	    public static SupplierDto mapToDto(Supplier supplier) {
	        return new SupplierDto(
	            supplier.getSupplierId(),
	            supplier.getCompanyName(),
	            supplier.getWebsite(),
	            supplier.getLocation(),
	            supplier.getNatureOfBusiness(),
	            supplier.getManufacturingProcesses()
	        );
	    }
	}

