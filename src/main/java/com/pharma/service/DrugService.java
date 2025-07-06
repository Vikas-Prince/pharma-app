package com.pharma.service;

import com.pharma.model.Drug;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugService {

    public List<Drug> getAllDrugs() {
        return List.of(
            new Drug(
                "Paracetamol",
                "Used to treat fever and mild pain.",
                "Take one tablet every 6 hours after food.",
                "Avoid overdose. Monitor liver function.",
                "Cipla",
                "2026-05",
                "Painkiller"
            ),
            new Drug(
                "Amoxicillin",
                "Antibiotic for bacterial infections.",
                "500mg twice daily after meals.",
                "Do not take if allergic to penicillin.",
                "Sun Pharma",
                "2025-11",
                "Antibiotic"
            )
        );
    }

    public Drug getDrugByName(String name) {
        return getAllDrugs().stream()
                .filter(drug -> drug.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
