package com.example.intelligent_children_platform.indenx.detail;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.*;
import com.example.intelligent_children_platform.R;

import java.util.ArrayList;
import java.util.List;

public class TangPoem_detail extends AppCompatActivity {
    //全局变量声明
    Spinner tang_spinner;
    ArrayAdapter<String> adapter;
    //初始数据声明
    private String data[] = {"江南","登鹳雀楼","静夜思","游子吟","春晓","赋得古原草送别"};
    private List<Tang_picture> tang_pictureList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.tangpeom_layout);
        initPictures();
        Tang_pictureAdapter adapter=new Tang_pictureAdapter(TangPoem_detail.this,R.layout.tang_picture_item,tang_pictureList);
        ListView listView=(ListView)findViewById(R.id.TangPoem_listview);
        listView.setAdapter(adapter);
    }
    private void initPictures(){
        Tang_picture chunxiao=new Tang_picture("春晓",R.drawable.chunxiao);
        tang_pictureList.add(chunxiao);
        Tang_picture denghequelou=new Tang_picture("登鹤雀楼",R.drawable.denghequelou);
        tang_pictureList.add(denghequelou);
        Tang_picture fude=new Tang_picture("赋得古原草送别",R.drawable.fude);
        tang_pictureList.add(fude);
        Tang_picture jingyesi=new Tang_picture("静夜思",R.drawable.jingyesi);
        tang_pictureList.add(jingyesi);
        Tang_picture cailian=new Tang_picture("江南",R.drawable.jiangnan );
        tang_pictureList.add(cailian);
        Tang_picture youziyin=new Tang_picture("游子吟",R.drawable.youziyin);
        tang_pictureList.add(youziyin);
    }
}