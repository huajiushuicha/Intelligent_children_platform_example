package com.example.intelligent_children_platform.indenx.function;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.*;
import com.example.intelligent_children_platform.R;
import com.example.intelligent_children_platform.indenx.function.Education_function;
import com.example.intelligent_children_platform.indenx.other_model.Shipin;
import com.example.intelligent_children_platform.indenx.other_model.Yinpin;
import com.example.intelligent_children_platform.indenx.other_model.Youxi;

import java.util.ArrayList;
import java.util.List;
import android.support.v7.app.AppCompatActivity;
public class Amusement_function extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amusement_layout);
       Button youxi=findViewById(R.id.youxi_bt);
       Button yinpin=findViewById(R.id.yinpin_bt);
       Button shipin=findViewById(R.id.shipin_bt);
       youxi.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(Amusement_function.this, Youxi.class);
               startActivity(intent);
           }
       });
       yinpin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(Amusement_function.this, Yinpin.class);
               startActivity(intent);
           }
       });
       shipin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(Amusement_function.this,Shipin.class);
               startActivity(intent);
           }
       });

    }
}
