package com.ff.hack;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class FFHackMenuActivity extends AppCompatActivity {
    
    private Button modeOffBtn, modeLightBtn, modeAggBtn, modeExtBtn;
    private Button scanBtn, hideBtn;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ff_hack_menu);
        
        modeOffBtn = findViewById(R.id.mode_off);
        modeLightBtn = findViewById(R.id.mode_light);
        modeAggBtn = findViewById(R.id.mode_agg);
        modeExtBtn = findViewById(R.id.mode_ext);
        scanBtn = findViewById(R.id.scan_btn);
        hideBtn = findViewById(R.id.hide_btn);
        
        modeOffBtn.setOnClickListener(v -> switchMode(0));
        modeLightBtn.setOnClickListener(v -> switchMode(1));
        modeAggBtn.setOnClickListener(v -> switchMode(2));
        modeExtBtn.setOnClickListener(v -> switchMode(3));
        
        scanBtn.setOnClickListener(v -> scan());
        hideBtn.setOnClickListener(v -> hide());
    }
    
    private void switchMode(int mode) {
        HackEngine.setMode(mode);
        updateUI();
    }
    
    private void updateUI() {
        modeOffBtn.setAlpha(HackEngine.currentMode == 0 ? 1.0f : 0.5f);
        modeLightBtn.setAlpha(HackEngine.currentMode == 1 ? 1.0f : 0.5f);
        modeAggBtn.setAlpha(HackEngine.currentMode == 2 ? 1.0f : 0.5f);
        modeExtBtn.setAlpha(HackEngine.currentMode == 3 ? 1.0f : 0.5f);
    }
    
    private void scan() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    private void hide() {
        moveTaskToBack(true);
    }
}
