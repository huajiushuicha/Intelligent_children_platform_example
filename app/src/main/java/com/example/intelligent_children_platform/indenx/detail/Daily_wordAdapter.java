package com.example.intelligent_children_platform.indenx.detail;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.intelligent_children_platform.R;

import java.util.List;
public class Daily_wordAdapter extends ArrayAdapter<Daily_word>{
    private int resourceId;
    public Daily_wordAdapter(Context context, int textViewResourceId, List<Daily_word> object) {
        super(context, textViewResourceId, object);
        resourceId = textViewResourceId;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        Daily_word daily_word=getItem(position);
        View view;
        Daily_wordAdapter.ViewHolder viewHolder;
        if (convertView==null){
            view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder=new Daily_wordAdapter.ViewHolder();
            viewHolder.daily_wordName=(TextView)view.findViewById(R.id.Daily_name);
            view.setTag(viewHolder);
        }else{
            view=convertView;
            viewHolder=(Daily_wordAdapter.ViewHolder)view.getTag();
        }
        viewHolder.daily_wordName.setText(daily_word.getName());
        return view;
    }
    class ViewHolder{
        TextView daily_wordName;
    }
}
