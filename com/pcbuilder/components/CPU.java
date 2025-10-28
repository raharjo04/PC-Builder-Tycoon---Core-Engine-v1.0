package com.pcbuilder.components;

public class CPU implements Component {
    private final String name;
    private final double price;
    private final int coreCount;
    private final double clockSpeedGHz;
    
    public CPU(String name, double price, int coreCount, double clockSpeedGHz) {
        this.name = name;
        this.price = price;
        this.coreCount = coreCount;
        this.clockSpeedGHz = clockSpeedGHz;
    }
    
    @Override
    public double getPrice() {
        return price;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    public int getCoreCount() {
        return coreCount;
    }
    
    public double getClockSpeedGHz() {
        return clockSpeedGHz;
    }
}