package com.example.intelligent_children_platform.indenx.detail;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.*;
import com.example.intelligent_children_platform.R;
import com.example.intelligent_children_platform.indenx.function.Education_function;
import java.util.ArrayList;
import java.util.List;
import android.support.v7.app.AppCompatActivity;
public class Drug_detail extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drug_database_layout);
        Button wuqu_bt=findViewById(R.id.wuqu_bt);
        Button huizong_bt=findViewById(R.id.huizong_bt);
        Button celue=findViewById(R.id.celue);
        wuqu_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Drug_detail.this, Yongyaowuqu.class);
                startActivity(intent);
            }
        });
        huizong_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Drug_detail.this, Yongyaozhinan.class);
                startActivity(intent);
            }
        });
        celue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Drug_detail.this, Yongyaocelue.class);
                startActivity(intent);
            }
        });
    }
}
