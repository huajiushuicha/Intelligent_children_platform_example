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

public class Tang_pictureAdapter extends ArrayAdapter<Tang_picture> {
    private int resourceId;
    public Tang_pictureAdapter(Context context, int textViewResourceId, List<Tang_picture> object){
        super(context,textViewResourceId,object);
        resourceId=textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Tang_picture tang_picture=getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView==null){
            view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.tang_pictureImage=(ImageView)view.findViewById(R.id.TangPoem_image);
            viewHolder.tang_pictureName=(TextView)view.findViewById(R.id.TangPoem_name);
            view.setTag(viewHolder);
        }else{
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();
        }
        viewHolder.tang_pictureImage.setImageResource(tang_picture.getImageId());
        viewHolder.tang_pictureName.setText(tang_picture.getName());
        return view;
    }
    class ViewHolder{
        ImageView tang_pictureImage;
        TextView tang_pictureName;
    }
}
