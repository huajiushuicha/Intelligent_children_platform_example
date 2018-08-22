package com.example.intelligent_children_platform.indenx.detail;
import android.content.Intent;
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
import com.example.intelligent_children_platform.R;
public class Daily_detail extends AppCompatActivity{
    Spinner daily_word_spinner;
    ArrayAdapter<String> adapter;
    //初始数据声明
    private String data[] = {"远离感冒","不爱吃饭","伤耳习惯"};
    private List<Daily_word> dailyList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.daily_layout);
        initPictures();
        Daily_wordAdapter adapter=new  Daily_wordAdapter(Daily_detail.this,R.layout.daily_word_item,dailyList);
        ListView listView = (ListView) findViewById(R.id.daily_listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> mAdapterView, View mView, int mI, long mL) {
                switch (mI) {
                    case 0:
                        Intent intent = new Intent(Daily_detail.this, Avoid_ganmao.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(Daily_detail.this, Love_eating.class);
                        startActivity(intent1);
                        break;
                    case 3:
                        Intent intent2 = new Intent(Daily_detail.this, Protect_ear.class);
                        startActivity(intent2);
                        break;
                }
            }
        });
    }
    public void initPictures(){
        Daily_word ganmao=new Daily_word("小宝贝远离感冒");
        dailyList.add(ganmao);
        Daily_word chifan=new Daily_word("小宝贝爱吃饭");
        dailyList.add(chifan);
        Daily_word huer=new Daily_word("小宝贝护耳朵");
        dailyList.add(huer);
    }
}
