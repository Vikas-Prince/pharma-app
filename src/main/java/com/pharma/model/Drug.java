package com.pharma.model;

public class Drug {
    private String name;
    private String manufacturer;
    private String expiry;

    public Drug(String name, String manufacturer, String expiry) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.expiry = expiry;
    }

    // Getters
    public String getName() { return name; }
    public String getManufacturer() { return manufacturer; }
    public String getExpiry() { return expiry; }
}
