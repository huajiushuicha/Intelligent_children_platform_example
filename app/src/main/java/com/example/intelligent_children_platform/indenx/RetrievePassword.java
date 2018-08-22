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
public class RetrievePassword extends AppCompatActivity {

    //全局变量声明
    String verification_number;
    EditText new_veri_text;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //v7包下去除标题栏代码
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.retrieve_password);
        //获取组件ID对象
        Button getVeri_btu = findViewById(R.id.new_get_veri_number_btu);
        Button ok_btu = findViewById(R.id.reset_btu);
        new_veri_text = findViewById(R.id.new_veri_text);
        //点击事件
        getVeri_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                verification_number = "" + (int)(Math.random()*1000000);
                Toast.makeText(RetrievePassword.this,verification_number,Toast.LENGTH_LONG).show();
            }
        });
        ok_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input_number =  new_veri_text.getText().toString();
                if(!(input_number.equals(""))){
                    if(input_number.equals(verification_number)){
                        Intent intent = new Intent(RetrievePassword.this,ResetPassword.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(RetrievePassword.this,"您输入的验证码不正确",Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(RetrievePassword.this,"请输入验证码",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}