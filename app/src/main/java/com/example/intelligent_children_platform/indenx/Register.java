package com.example.intelligent_children_platform.indenx;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.*;
import com.example.intelligent_children_platform.R;
public class Register extends AppCompatActivity {
    //全局变量声明
    EditText user_text,pass_text,again_pass_text;
    String user,pass,again_pass;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //v7包下去除标题栏代码
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //加载布局
        setContentView(R.layout.register_layout);
        //获取组件ID
        Button submit_btu = findViewById(R.id.submit_button);
        user_text = findViewById(R.id.Register_editText);
        pass_text = findViewById(R.id.pass_editText);
        again_pass_text = findViewById(R.id.again_pass_editText);
        //点击事件
        submit_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //得到组件里面的内容
                user = user_text.getText().toString();
                pass = pass_text.getText().toString();
                again_pass = again_pass_text.getText().toString();
                String all = user + " " + pass + " " + again_pass;
                //检查编辑框中的内容
                if(!(user.equals("")) && !(pass.equals(""))){
                    if(pass.equals(again_pass)){
                        Toast.makeText(Register.this,"注册成功",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Register.this,LoginActivity.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(Register.this,"两次密码不相同,请重新输入",Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(Register.this,"请填写完整的注册信息",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}