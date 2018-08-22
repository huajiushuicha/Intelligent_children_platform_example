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
public class Story_pictureAdapter extends ArrayAdapter<Story_picture> {
    private int resourceId;
    public Story_pictureAdapter(Context context,int textViewResourceId,List<Story_picture>object){
        super(context,textViewResourceId,object);
        resourceId=textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Story_picture story_picture=getItem(position);
        View view;
        Story_pictureAdapter.ViewHolder viewHolder;
        if (convertView==null){
            view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder=new Story_pictureAdapter.ViewHolder();
            viewHolder.story_pictureImage=(ImageView)view.findViewById(R.id.Story_image);
            viewHolder.story_pictureName=(TextView)view.findViewById(R.id.Story_name);
            view.setTag(viewHolder);
        }else{
            view=convertView;
            viewHolder=( Story_pictureAdapter.ViewHolder)view.getTag();
        }
        viewHolder.story_pictureImage.setImageResource(story_picture.getImageId());
        viewHolder.story_pictureName.setText(story_picture.getName());
        return view;
    }
    class ViewHolder{
        ImageView story_pictureImage;
        TextView story_pictureName;
    }
}