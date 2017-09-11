package com.example.asus_pc.customicolumn;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private CustomRectangle custzhu;
    private CustomRectangle customRectangle;
    ArrayList<CustomRectangle.Bar> barLists = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        customRectangle = (CustomRectangle) findViewById(R.id.custzhu);

        for(int i=0; i<3; i++){
            float ratio = (float) Math.random();

            int color = (int) (Color.GRAY * ratio);
            CustomRectangle.Bar bar = new CustomRectangle.Bar(i, ratio, color, "第一", "增长");
            barLists.add(bar);
        }
        customRectangle.setBarLists(barLists);

    }
}
