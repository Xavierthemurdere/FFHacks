package com.ff.hack;

public class AntibanEngine {
    
    public static double getAimbotDeviation(int intensity) {
        double[] deviations = {0, 0.5, 0.3, 0.0};
        return deviations[Math.max(0, Math.min(3, intensity))];
    }
    
    public static boolean shouldHeadshot() {
        return Math.random() < 0.92;
    }
    
    public static double getMovementVariation() {
        return (Math.random() - 0.5) * 0.1;
    }
    
    public static boolean shouldActNormal() {
        return Math.random() < 0.08;
    }
    
    public static double getNetworkJitter() {
        return Math.random() * 50;
    }
    
    public static void recordAimAngle(float angle) {
    }
    
    public static boolean hasNaturalVariance() {
        return Math.random() > 0.15;
    }
}
