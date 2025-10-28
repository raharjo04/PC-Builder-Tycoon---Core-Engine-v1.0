package com.pcbuilder.components;

public class Motherboard implements Component {
    private final String name;
    private final double price;
    private final String chipset;
    
    public Motherboard(String name, double price, String chipset) {
        this.name = name;
        this.price = price;
        this.chipset = chipset;
    }
    
    @Override
    public double getPrice() {
        return price;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    public String getChipset() {
        return chipset;
    }
}