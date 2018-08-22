package com.example.intelligent_children_platform.indenx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.*;
import com.example.intelligent_children_platform.R;

public class LoginActivity extends AppCompatActivity {
    //全局变量声明
    String DefaultUser = "root";
    String DefaultPass = "root";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //v7包下去除标题栏代码：
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //加载布局
        setContentView(R.layout.login_layout);
        //获取组件的ID对象
        TextView AddUser_btu = findViewById(R.id.Register_user_textView);
        TextView ForgotPass_btu = findViewById(R.id.Forgot_pass_textView);
        final TextView LoginUser_text = findViewById(R.id.Login_user);
        final TextView LoginPass_text = findViewById(R.id.Login_pass);
        Button Login_btu = findViewById(R.id.Login_button);
        //用户注册点击事件
        AddUser_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,Verification.class);
                startActivity(intent);
            }
        });
        //忘记密码点击事件
        ForgotPass_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,RetrievePassword.class);
                startActivity(intent);
            }
        });
        //登录点击事件
        Login_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //得到登录界面用户输入的用户名和密码
                String user = LoginUser_text.getText().toString();
                String pass = LoginPass_text.getText().toString();
                //判断用户名和密码
                if(user.equals(DefaultUser) && pass.equals(DefaultPass)){
                    //开启Intent(主界面)活动
                    Intent intent = new Intent(LoginActivity.this,Indenx.class);
                    startActivity(intent);
                }else{

                    Toast.makeText(LoginActivity.this,"用户名和密码不正确，请重新输入",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
