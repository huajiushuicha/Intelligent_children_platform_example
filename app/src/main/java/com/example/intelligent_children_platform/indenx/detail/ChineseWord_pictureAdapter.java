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

public class ChineseWord_pictureAdapter extends ArrayAdapter<ChineseWord_picture> {
    private int resourceId;
    public ChineseWord_pictureAdapter(Context context, int textViewResourceId, List<ChineseWord_picture> object){
        super(context,textViewResourceId,object);
        resourceId=textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ChineseWord_picture chineseword_picture=getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView==null){
            view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.chineseword_pictureImage=(ImageView)view.findViewById(R.id.ChineseWord_image);
            viewHolder.chineseword_pictureName=(TextView)view.findViewById(R.id.ChineseWord_name);
            view.setTag(viewHolder);
        }else{
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();
        }
        viewHolder.chineseword_pictureImage.setImageResource(chineseword_picture.getImageId());
        viewHolder.chineseword_pictureName.setText(chineseword_picture.getName());
        return view;
    }
    class ViewHolder{
        ImageView chineseword_pictureImage;
        TextView chineseword_pictureName;
    }
}
