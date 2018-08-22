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
public class English_pictureAdapter extends ArrayAdapter<English_picture>{
    private int resourceId;
    public English_pictureAdapter(Context context, int textViewResourceId, List<English_picture> object) {
            super(context, textViewResourceId, object);
            resourceId = textViewResourceId;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        English_picture english_picture=getItem(position);
        View view;
        English_pictureAdapter.ViewHolder viewHolder;
        if (convertView==null){
            view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder=new English_pictureAdapter.ViewHolder();
            viewHolder.english_pictureImage=(ImageView)view.findViewById(R.id.English_image);
            viewHolder.english_pictureName=(TextView)view.findViewById(R.id.English_name);
            view.setTag(viewHolder);
        }else{
            view=convertView;
            viewHolder=(English_pictureAdapter.ViewHolder)view.getTag();
        }
        viewHolder.english_pictureImage.setImageResource(english_picture.getImageId());
        viewHolder.english_pictureName.setText(english_picture.getName());
        return view;
    }
    class ViewHolder{
        ImageView english_pictureImage;
        TextView english_pictureName;
    }
}
