package com.jtjisgod.kmuexample01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup rg = (RadioGroup)findViewById(R.id.radioGroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                ImageView iv = (ImageView)findViewById(R.id.imageView);
                if(checkedId == R.id.radioButton) { // LEO
                    iv.setImageDrawable(getDrawable(R.drawable.tmntleo));
                } else if(checkedId == R.id.radioButton5) { // Mike
                    iv.setImageDrawable(getDrawable(R.drawable.tmntmike));
                } else if(checkedId == R.id.radioButton4) { // Don
                    iv.setImageDrawable(getDrawable(R.drawable.tmntdon));
                } else if(checkedId == R.id.radioButton3) { // Raph
                    iv.setImageDrawable(getDrawable(R.drawable.tmntraph));
                }
                Toast.makeText(MainActivity.this, "Changed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
