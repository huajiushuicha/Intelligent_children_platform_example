package com.example.intelligent_children_platform.indenx.function;
import android.content.Intent;
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
import com.example.intelligent_children_platform.indenx.other_model.Jingdong_detail;
import com.example.intelligent_children_platform.indenx.other_model.Taobao_detail;

import java.util.ArrayList;
import java.util.List;
import android.support.v7.app.AppCompatActivity;
public class Shopping_function extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopping_layout);
        ImageView imageViewj=(ImageView)findViewById(R.id.jingdong_iv);
        ImageView imageViewt=(ImageView)findViewById(R.id.taobao_iv);
        imageViewj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Shopping_function.this, Jingdong_detail.class);
                startActivity(intent);
            }
        });
        imageViewt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Shopping_function.this, Taobao_detail.class);
                startActivity(intent);
            }
        });
    }
}
