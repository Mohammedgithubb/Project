package com.example.makersharks.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.data.domain.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.makersharks.dto.SupplierDto;
import com.example.makersharks.entity.Supplier;
import com.example.makersharks.repository.SupplierRepository;

@Service
public class SupplierService {

	@Autowired
    private SupplierRepository supplierRepository;

    public List<SupplierDto> searchSuppliers(String location, String natureOfBusiness, List<String> manufacturingProcesses, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        List<Supplier> suppliers = supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(location, natureOfBusiness, manufacturingProcesses, pageable);

        // Convert each Supplier entity to SupplierDto
        return suppliers.stream()
                        .map(SupplierDto::mapToDto)
                        .collect(Collectors.toList());
    }
}



