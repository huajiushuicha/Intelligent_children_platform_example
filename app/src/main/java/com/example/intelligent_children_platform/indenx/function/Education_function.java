package com.example.intelligent_children_platform.indenx.function;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TableRow;

import com.example.intelligent_children_platform.R;
import com.example.intelligent_children_platform.indenx.detail.ChineseWord_picture;
import com.example.intelligent_children_platform.indenx.detail.English_detail;
import com.example.intelligent_children_platform.indenx.detail.Story_detail;
import com.example.intelligent_children_platform.indenx.detail.TangPoem_detail;
import com.example.intelligent_children_platform.indenx.detail.ChineseWord_detail;

public class Education_function extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.education_layout);
        //获取组件的ID对象
        //获取组件
        TableRow TangPoem_tablerow = findViewById(R.id.TangPoem_tablerow);
        TableRow ChineseWord_tablerow=findViewById(R.id.ChineseWord_tablerow);
        TableRow English_tablerow=findViewById(R.id.English_tablerow);
        TableRow Story_tablerow=findViewById(R.id.Story_tablerow);
        //组件“TangPoem_tablerow”的点击事件
        TangPoem_tablerow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Education_function.this,TangPoem_detail.class);
                startActivity(intent);
            }
        });
        ChineseWord_tablerow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Education_function.this,ChineseWord_detail.class);
                startActivity(intent);
            }
        });
        English_tablerow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Education_function.this,English_detail.class);
                startActivity(intent);
            }
        });
        Story_tablerow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Education_function.this,Story_detail.class);
                startActivity(intent);
            }
        });


    }
}