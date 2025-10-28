package com.pcbuilder.core; 

import com.pcbuilder.components.*; 
import java.util.ArrayList;
import java.util.List;

public class PC {

    private final Motherboard motherboard;
    private final CPU cpu;
    private final List<RAM> ramSticks; 
    private final SSD ssd;
    private final Mouse mouse; 
    private final CloudStorage cloudStorage; 

    public PC(Motherboard motherboard, CPU cpu, List<RAM> ramSticks, SSD ssd, Mouse mouse, CloudStorage cloudStorage) {
        if (motherboard == null || cpu == null || ramSticks == null || ssd == null || ramSticks.isEmpty() || mouse == null || cloudStorage == null) {
            throw new IllegalArgumentException("Semua komponen esensial (termasuk mouse dan cloud storage) tidak boleh null atau kosong.");
        }
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.ramSticks = ramSticks;
        this.ssd = ssd;
        this.mouse = mouse; 
        this.cloudStorage = cloudStorage;
    }
    
    public Motherboard getMotherboard() { return motherboard; }
    public CPU getCpu() { return cpu; }
    public List<RAM> getRamSticks() { return ramSticks; }
    public Mouse getMouse() { return mouse; } 
    public CloudStorage getCloudStorage() { return cloudStorage; } 

public void displayConfiguration() {
    System.out.println("\n========================================");
    System.out.println("        PC CONFIGURATION REPORT         ");
    System.out.println("========================================");

    System.out.println("\n-- ESSENTIAL COMPONENTS --");
    System.out.println("Motherboard : " + motherboard.getName());
    System.out.println("CPU         : " + cpu.getName());
    System.out.println("SSD         : " + ssd.getName());
    System.out.println("Mouse       : " + mouse.getName());
    System.out.println("CloudStorage: " + cloudStorage.getName());

    System.out.println("\nRAM (Total Sticks: " + ramSticks.size() + ")");
    for (int i = 0; i < ramSticks.size(); i++) {
        System.out.println("  - RAM Stick " + (i + 1) + ": " + ramSticks.get(i).getName());
    }

    System.out.println("----------------------------------------");
    System.out.printf("TOTAL PRICE : Rp %.2f\n", calculateTotalPrice());
    System.out.println("========================================\n");
}


    public void generateReport() {
        System.out.println("\n--- PC Build by team 8 ---");
        System.out.println("CPU: " + this.getCpu().getName());
        System.out.println("Motherboard: " + this.getMotherboard().getName());
        System.out.println("Mouse: " + this.getMouse().getName()); 
        System.out.println("Cloud Storage: " + this.getCloudStorage().getName()); 
        System.out.println("RAM Sticks Installed: " + this.ramSticks.size());
        System.out.println("-----------------------");
        System.out.println("Total Price: Rp " + String.format("%,.2f", this.calculateTotalPrice()));
        System.out.println("--- Build Successful! ---");
    }
    
    public double calculateTotalPrice() {
        double total = motherboard.getPrice() + cpu.getPrice() + ssd.getPrice() + mouse.getPrice() + cloudStorage.getPrice();
        for (RAM ram : ramSticks) { total += ram.getPrice(); }
        return total;
    }
}