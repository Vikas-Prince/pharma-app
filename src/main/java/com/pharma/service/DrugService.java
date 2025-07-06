package com.pharma.service;

import com.pharma.model.Drug;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugService {
    public List<Drug> getAllDrugs() {
        return List.of(
            new Drug("Paracetamol", "Cipla", "2026-05"),
            new Drug("Amoxicillin", "Sun Pharma", "2025-11")
        );
    }
}
