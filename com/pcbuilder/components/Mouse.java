package com.pcbuilder.components;

public class Mouse implements Component {
    private final String name;
    private final double price;
    private final int dpi;
    private final boolean isWireless;
    
    public Mouse(String name, double price, int dpi, boolean isWireless) {
        this.name = name;
        this.price = price;
        this.dpi = dpi;
        this.isWireless = isWireless;
    }
    
    @Override
    public double getPrice() {
        return price;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    public int getDpi() {
        return dpi;
    }
    
    public boolean isWireless() {
        return isWireless;
    }
}