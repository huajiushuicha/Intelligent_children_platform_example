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
public class ResetPassword extends AppCompatActivity {
    //全局变量声明
    EditText new_pass_text,again_new_pass_text;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //v7包下去除标题栏代码
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.reset_password);
        //获取组件ID对象
        new_pass_text = findViewById(R.id.new_pass_text);
        again_new_pass_text = findViewById(R.id.again_new_pass_text);
        Button reset_ok_btu = findViewById(R.id.reset_ok_btu);
        //点击事件
        reset_ok_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String new_pass = new_pass_text.getText().toString();
                String again_pass = again_new_pass_text.getText().toString();
                if(!(new_pass.equals("") && again_pass.equals(""))){
                    if(new_pass.equals(again_pass)){
                        Toast.makeText(ResetPassword.this,"更改成功",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(ResetPassword.this,LoginActivity.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(ResetPassword.this,"两次密码不相同,请重新输入",Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(ResetPassword.this,"请填写完整的信息",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}