package com.example.jinguang.mytimescale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import view.DecimalScaleRulerView;
import view.DrawUtil;

public class MainActivity extends AppCompatActivity {
    private float mHeight = 170;
    private float mMaxHeight = 220;
    private float mMinHeight = 100;


    private float mWeight = 0f;
    private float mMaxWeight = 200;
    private float mMinWeight = 25;
    DecimalScaleRulerView mWeightRulerView;
    TextView mWeightValueTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWeightValueTwo = findViewById(R.id.tv_user_weight_value_two);
        mWeightRulerView = findViewById(R.id.ruler_weight);

        mWeightRulerView.setParam(DrawUtil.dip2px(4f), DrawUtil.dip2px(32f), DrawUtil.dip2px(24f),
                DrawUtil.dip2px(14f), DrawUtil.dip2px(9f), DrawUtil.sp2px(20f));
        mWeightRulerView.initViewParam(mWeight, 0, 1440, 10);
        mWeightRulerView.setValueChangeListener(new DecimalScaleRulerView.OnValueChangeListener() {
            @Override
            public void onValueChange(String value) {
                mWeightValueTwo.setText(value);
            }
        });
    }
}
