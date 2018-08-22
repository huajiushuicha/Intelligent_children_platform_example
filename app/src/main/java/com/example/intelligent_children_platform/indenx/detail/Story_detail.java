package com.example.intelligent_children_platform.indenx.detail;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.*;
import com.example.intelligent_children_platform.R;
import com.example.intelligent_children_platform.indenx.function.Education_function;

import java.util.ArrayList;
import java.util.List;
public class Story_detail extends AppCompatActivity {
    //全局变量声明
    Spinner story_picture_spinner;
    ArrayAdapter<String> adapter;
    //初始数据声明
    private String data[] = {"守株待兔","买椟还珠","司马光救小朋友"};
    private List<Story_picture> story_pictureList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.story_layout);
        initPictures();
        Story_pictureAdapter adapter = new Story_pictureAdapter(Story_detail.this, R.layout.story_picture_item, story_pictureList);
        ListView listView = (ListView) findViewById(R.id.Story_listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> mAdapterView, View mView, int mI, long mL) {
                switch (mI){
                    case 0:
                        Intent intent=new Intent(Story_detail.this,Shouzhudaitu_detail.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1=new Intent(Story_detail.this,Maiduhuanzhu_detail.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2=new Intent(Story_detail.this,Simaguang_detail.class);
                        startActivity(intent2);
                        break;

                }

            }
        });
        }

            private void initPictures() {
                Story_picture shouzhudaitu = new Story_picture("shouzhudaitu", R.drawable.shouzhudaitu);
                story_pictureList.add(shouzhudaitu);
                Story_picture maiduhuanzhu = new Story_picture("maiduhuanzhu", R.drawable.maiduhuanzhu);
                story_pictureList.add(maiduhuanzhu);
                Story_picture simaguangjiuxiaopengyou = new Story_picture("simaguangjiuxiaopengyou", R.drawable.simaguan);
                story_pictureList.add(simaguangjiuxiaopengyou);
            }

    }
