package com.example.makersharks.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.makersharks.entity.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    List<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(
        String location, 
        String natureOfBusiness, 
        List<String> manufacturingProcesses,
        Pageable pageable
    );
}



