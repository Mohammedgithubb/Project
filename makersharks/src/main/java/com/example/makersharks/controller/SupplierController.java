package com.example.makersharks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.makersharks.dto.SupplierDto;
import com.example.makersharks.service.SupplierService;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/query")
    public ResponseEntity<List<SupplierDto>> getSuppliers(
            @RequestParam String location, 
            @RequestParam String natureOfBusiness, 
            @RequestParam List<String> manufacturingProcesses, 
            @RequestParam int page, 
            @RequestParam int size) {

        List<SupplierDto> suppliers = supplierService.searchSuppliers(location, natureOfBusiness, manufacturingProcesses, page, size);
        return ResponseEntity.ok(suppliers);
    }
}

