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
public class SilkDatabase_wordAdapter extends ArrayAdapter<SilkDatabase_word> {
    private int resourceId;
    public SilkDatabase_wordAdapter(Context context, int textViewResourceId, List<SilkDatabase_word> object) {
        super(context, textViewResourceId, object);
        resourceId = textViewResourceId;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        SilkDatabase_word silkdatabase_word=getItem(position);
        View view;
        SilkDatabase_wordAdapter.ViewHolder viewHolder;
        if (convertView==null){
            view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder=new SilkDatabase_wordAdapter.ViewHolder();
            viewHolder.silkdatabase_wordName=(TextView)view.findViewById(R.id.SilkDatabase_name);
            viewHolder.silkdatabase_wordImage=(ImageView)view.findViewById(R.id.SilkDatabase_image);
            view.setTag(viewHolder);
        }else{
            view=convertView;
            viewHolder=(SilkDatabase_wordAdapter.ViewHolder)view.getTag();
        }
        viewHolder.silkdatabase_wordName.setText(silkdatabase_word.getName());
        viewHolder.silkdatabase_wordImage.setImageResource(silkdatabase_word.getImageId());
        return view;
    }
    class ViewHolder{
        TextView silkdatabase_wordName;
        ImageView silkdatabase_wordImage;
    }
}
