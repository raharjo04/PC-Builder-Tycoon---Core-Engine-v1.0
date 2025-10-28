package com.pcbuilder.components;

public class SSD implements Component {
    private final String name;
    private final double price;
    private final int capacityGB;
    private final String interface_; 
    
    public SSD(String name, double price, int capacityGB, String interface_) {
        this.name = name;
        this.price = price;
        this.capacityGB = capacityGB;
        this.interface_ = interface_;
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
    
    public String getInterface() {
        return interface_;
    }
}