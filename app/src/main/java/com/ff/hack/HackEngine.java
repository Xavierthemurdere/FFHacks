package com.ff.hack;

public class HackEngine {
    
    public static int currentMode = 0;
    
    public static boolean aimbot;
    public static boolean aimSmooth;
    public static boolean espSkeleton;
    public static boolean espNames;
    public static boolean espItems;
    public static boolean espVehicles;
    public static boolean speedHack;
    public static boolean jumpBoost;
    public static boolean noRecoil;
    public static boolean damageMult;
    public static boolean noReload;
    public static boolean antiGravity;
    public static boolean autoLoot;
    public static boolean lagSwitch;
    public static boolean teleport;
    public static boolean behaviorRandom;
    
    public static void setMode(int mode) {
        currentMode = mode;
        disableAll();
        
        switch(mode) {
            case 1:
                aimbot = true;
                aimSmooth = true;
                behaviorRandom = true;
                break;
            case 2:
                aimbot = true;
                aimSmooth = true;
                espSkeleton = true;
                espNames = true;
                espItems = true;
                noRecoil = true;
                damageMult = true;
                behaviorRandom = true;
                break;
            case 3:
                aimbot = true;
                aimSmooth = true;
                espSkeleton = true;
                espNames = true;
                espItems = true;
                espVehicles = true;
                speedHack = true;
                jumpBoost = true;
                noRecoil = true;
                damageMult = true;
                noReload = true;
                antiGravity = true;
                autoLoot = true;
                lagSwitch = true;
                teleport = true;
                break;
        }
    }
    
    public static void disableAll() {
        aimbot = false;
        aimSmooth = false;
        espSkeleton = false;
        espNames = false;
        espItems = false;
        espVehicles = false;
        speedHack = false;
        jumpBoost = false;
        noRecoil = false;
        damageMult = false;
        noReload = false;
        antiGravity = false;
        autoLoot = false;
        lagSwitch = false;
        teleport = false;
        behaviorRandom = false;
    }
    
    public static float[] getAimbotVector() {
        if(!aimbot) return new float[]{0, 0};
        double deviation = AntibanEngine.getAimbotDeviation(currentMode);
        return new float[]{
            (float)(Math.random() * deviation - deviation/2),
            (float)(Math.random() * deviation - deviation/2)
        };
    }
    
    public static float getDamageMultiplier() {
        if(!damageMult) return 1.0f;
        switch(currentMode) {
            case 2: return 2.0f;
            case 3: return 5.0f;
            default: return 1.0f;
        }
    }
    
    public static void toggleFeature(String feature) {
        switch(feature.toLowerCase()) {
            case "aimbot": aimbot = !aimbot; break;
            case "aimsmooth": aimSmooth = !aimSmooth; break;
            case "espskeleton": espSkeleton = !espSkeleton; break;
            case "espnames": espNames = !espNames; break;
            case "espitems": espItems = !espItems; break;
            case "espvehicles": espVehicles = !espVehicles; break;
            case "speedhack": speedHack = !speedHack; break;
            case "jumpboost": jumpBoost = !jumpBoost; break;
            case "norecoil": noRecoil = !noRecoil; break;
            case "damagemult": damageMult = !damageMult; break;
            case "noreload": noReload = !noReload; break;
            case "antigravity": antiGravity = !antiGravity; break;
            case "autoloot": autoLoot = !autoLoot; break;
            case "lagswitch": lagSwitch = !lagSwitch; break;
            case "teleport": teleport = !teleport; break;
            case "behaviorrandom": behaviorRandom = !behaviorRandom; break;
        }
    }
    
    public static boolean isEnabled(String feature) {
        switch(feature.toLowerCase()) {
            case "aimbot": return aimbot;
            case "aimsmooth": return aimSmooth;
            case "espskeleton": return espSkeleton;
            case "espnames": return espNames;
            case "espitems": return espItems;
            case "espvehicles": return espVehicles;
            case "speedhack": return speedHack;
            case "jumpboost": return jumpBoost;
            case "norecoil": return noRecoil;
            case "damagemult": return damageMult;
            case "noreload": return noReload;
            case "antigravity": return antiGravity;
            case "autoloot": return autoLoot;
            case "lagswitch": return lagSwitch;
            case "teleport": return teleport;
            case "behaviorrandom": return behaviorRandom;
            default: return false;
        }
    }
}
