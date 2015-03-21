package com.agroho.gridlistapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomGridAdapter extends BaseAdapter {
	
	Context context;
	String[] day;
	String[] date;
	
	
	public CustomGridAdapter(Context context, String[] day, String[] date){
		this.context = context;
		this.day = day;
		this.date = date;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return day.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View GridView;
		
		 if (convertView == null) {
			 GridView = new View(context);
		
		 
		 GridView = inflater.inflate(R.layout.gridmodel, null);
		 TextView gridTxt1 = (TextView)GridView.findViewById(R.id.textView1);
		 TextView gridTxt2 = (TextView)GridView.findViewById(R.id.textView2);
		 gridTxt1.setText(day[position]);
		 gridTxt2.setText(date[position]);
	} else {
        GridView = (View) convertView;
      }
		 return GridView;
	}

}
