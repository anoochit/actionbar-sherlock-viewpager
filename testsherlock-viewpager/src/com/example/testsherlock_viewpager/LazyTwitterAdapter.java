package com.example.testsherlock_viewpager;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LazyTwitterAdapter extends BaseAdapter {
	
	private Activity activity;
    private ArrayList<HashMap<String, String>> data;
    
    private static LayoutInflater inflater=null;
    public ImageLoader imageLoader; 
    
    public LazyTwitterAdapter(Activity a, ArrayList<HashMap<String, String>> myArrList) {
        activity = a;
        data=myArrList;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        imageLoader=new ImageLoader(activity.getApplicationContext());
    }

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.activity_column_twitter, null);
 
        TextView text = (TextView)vi.findViewById(R.id.ColTitle);
        ImageView thumb_image=(ImageView)vi.findViewById(R.id.ColImage); // thumb image
 
        text.setText(data.get(position).get("title"));
        String image_url = data.get(position).get("image_url"); 
        imageLoader.DisplayImage(image_url, position, thumb_image);
        return vi;
	}

}
