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
import com.example.intelligent_children_platform.indenx.function.Education_function;
import com.example.intelligent_children_platform.indenx.other_model.Pc;
import com.example.intelligent_children_platform.indenx.other_model.Tom;
import com.example.intelligent_children_platform.indenx.other_model.Youjiao;
import java.util.ArrayList;
import java.util.List;
public class Exchange_function extends AppCompatActivity {
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exchange_layout);
        Button youjiao=(Button)findViewById(R.id.youjiaowang_bt);
        Button pc=(Button)findViewById(R.id.taipingyang_bt);
        Button zhongguoertong=(Button)findViewById(R.id.zhongguoertong_bt);
        Button send=(Button)findViewById(R.id.send_bt);
        editText=(EditText)findViewById(R.id.input_et);
        youjiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Exchange_function.this, Youjiao.class);
                startActivity(intent);
            }
        });
        pc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Exchange_function.this,Pc.class);
            }
        });
        zhongguoertong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Exchange_function.this,Tom.class);
            }
        });
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText=editText.getText().toString();
                Toast.makeText(Exchange_function.this,inputText,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
