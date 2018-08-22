package com.example.intelligent_children_platform.indenx;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.intelligent_children_platform.R;
public class Verification extends AppCompatActivity {

    //全局变量声明
    String verification_number;
    EditText veri_number_text;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //v7包下去除标题栏代码
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //加载布局
        setContentView(R.layout.verification_layout);
        //获取组件ID对象
        Button get_verification_btu = findViewById(R.id.get_verification_number);
        Button submit_btu = findViewById(R.id.next_btu);
        veri_number_text = findViewById(R.id.verification_number_text);
        //点击事件
        get_verification_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                verification_number = "" + (int)(Math.random()*1000000);
                Toast.makeText(Verification.this, verification_number,Toast.LENGTH_LONG).show();
            }
        });
        submit_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //得到验证码编辑框中内容
                String verification_number2 = veri_number_text.getText().toString();
                //判断验证码是否与用户输入一致
                if(verification_number2.equals(verification_number)){
                    Intent intent = new Intent(Verification.this,Register.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(Verification.this,"验证码错误",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}