package com.pcbuilder.components;

public class CloudStorage implements Component {
    private final String name;
    private final double price; 
    private final int capacityGB;
    private final String provider;
    
    public CloudStorage(String name, double price, int capacityGB, String provider) {
        this.name = name;
        this.price = price;
        this.capacityGB = capacityGB;
        this.provider = provider;
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
    
    public String getProvider() {
        return provider;
    }
}