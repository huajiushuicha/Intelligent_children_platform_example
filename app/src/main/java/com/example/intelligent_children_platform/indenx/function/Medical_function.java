package com.example.intelligent_children_platform.indenx.function;
import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TableRow;
import android.widget.*;
import com.example.intelligent_children_platform.R;
import com.example.intelligent_children_platform.indenx.detail.Daily_detail;
import com.example.intelligent_children_platform.indenx.detail.Drug_detail;
import com.example.intelligent_children_platform.indenx.detail.SilkDatabase_detail;

public class Medical_function extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.medical_layout);
        //获取组件的ID对象
        //获取组件
      TableRow silkdatabase=findViewById(R.id.SilkDatabase_tablerow);
      TableRow drugdatabase=findViewById(R.id.Drug_tablerow);
      TableRow daily=findViewById(R.id.Daily_tablerow);
        silkdatabase.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Medical_function.this,SilkDatabase_detail.class);
                startActivity(intent);
            }
        });
        drugdatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Medical_function.this,Drug_detail.class);
                startActivity(intent);
            }
        });
        daily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Medical_function.this,Daily_detail.class);
                startActivity(intent);
            }
        });
    }
}