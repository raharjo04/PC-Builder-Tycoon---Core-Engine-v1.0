package com.pcbuilder.components;

public class RAM implements Component {
    private final String name;
    private final double price;
    private final int capacityGB;
    private final String type; 
    
    public RAM(String name, double price, int capacityGB, String type) {
        this.name = name;
        this.price = price;
        this.capacityGB = capacityGB;
        this.type = type;
    }
    
    @Override
    public double getPrice() {
        return price;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    public int getCapacityGB() {
        return capacityGB;
    }
    
    public String getType() {
        return type;
    }
}