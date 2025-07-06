package com.pharma.controller;

import com.pharma.model.Drug;
import com.pharma.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DrugController {

    @Autowired
    private DrugService drugService;

    @GetMapping("/")
    public String index(Model model) {
        List<Drug> drugs = drugService.getAllDrugs();
        model.addAttribute("drugs", drugs);
        return "index";
    }
}
