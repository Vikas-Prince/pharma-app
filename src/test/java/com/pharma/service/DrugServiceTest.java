package com.pharma.service;

import com.pharma.model.Drug;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DrugServiceTest {

    private final DrugService service = new DrugService();

    @Test
    public void testGetAllDrugs() {
        List<Drug> drugs = service.getAllDrugs();
        assertEquals(2, drugs.size());
        assertEquals("Paracetamol", drugs.get(0).getName());
    }
}
