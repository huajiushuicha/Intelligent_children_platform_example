package com.example.intelligent_children_platform.indenx;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.intelligent_children_platform.R;
import com.example.intelligent_children_platform.indenx.function.Amusement_function;
import com.example.intelligent_children_platform.indenx.function.Education_function;
import com.example.intelligent_children_platform.indenx.function.Exchange_function;
import com.example.intelligent_children_platform.indenx.function.Histogram_function;
import com.example.intelligent_children_platform.indenx.function.Medical_function;
import com.example.intelligent_children_platform.indenx.function.Shopping_function;

public class Indenx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.indenx_layout);
        //对象声明
        Button medical_btu,education_btu,suppervision_btu,amusement_btu,exchange_btu,shopping_btu;
        //获取组件ID对象
        medical_btu = findViewById(R.id.medical_btu);
        education_btu = findViewById(R.id.education_btu);
        suppervision_btu = findViewById(R.id.supervision_btu);
        amusement_btu = findViewById(R.id.amusement_btu);
        exchange_btu = findViewById(R.id.exchange_btu);
        shopping_btu = findViewById(R.id.shopping_btu);
        //点击事件及其活动穿梭
        medical_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Indenx.this, Medical_function.class);
                startActivity(intent);
            }
        });
        education_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Indenx.this, Education_function.class);
                startActivity(intent);
            }
        });
        suppervision_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Indenx.this,Histogram_function.class);
                startActivity(intent);
            }
        });
        amusement_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Indenx.this, Amusement_function.class);
                startActivity(intent);
            }
        });
        exchange_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Indenx.this, Exchange_function.class);
                startActivity(intent);
            }
        });
        shopping_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Indenx.this, Shopping_function.class);
                startActivity(intent);
            }
        });
    }
}