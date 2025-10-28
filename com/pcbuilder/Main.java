package com.pcbuilder; 

import com.pcbuilder.core.PC; 
import com.pcbuilder.components.*; 
import com.pcbuilder.reporting.PCReportGenerator; 
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Motherboard mobo = new Motherboard("ASUS ROG B550", 2500000, "B550");
        CPU cpu = new CPU("AMD Ryzen 5", 3000000, 6, 3.7);
        SSD ssd = new SSD("Samsung 500GB", 1500000, 500, "NVMe");
        Mouse mouse = new Mouse("Logitech G502", 750000, 16000, false);
        CloudStorage cloud = new CloudStorage("Google Drive 100GB (1 Year)", 269000, 100, "Google");
        
        List<RAM> ramSticks = new ArrayList<>();
        ramSticks.add(new RAM("Corsair 16GB Stick", 1200000, 16, "DDR4"));

        PC pcGaming = new PC(mobo, cpu, ramSticks, ssd, mouse, cloud);
        PCReportGenerator reportGenerator = new PCReportGenerator(); 
        
        System.out.println("PC dibuat.");
        reportGenerator.generateReport(pcGaming);

    }
}