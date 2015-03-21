package com.agroho.gridlistapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter <String>{
	String[] numbers;
	String[] names ;
	Activity context;

	public CustomListAdapter(Activity context, String[] names, String[] numbers) {
		
		super(context, R.layout.listmodel, names);
			
		this.context = context;
		this.names = names;
		this.numbers=numbers;
	}
	
	@Override
	public View getView(int position, View view, ViewGroup parent){
		
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView= inflater.inflate(R.layout.listmodel, null, true);
		
		TextView txtTitle = (TextView) rowView.findViewById(R.id.textView1);

		TextView txtTitle2 = (TextView) rowView.findViewById(R.id.textView2);
		
		txtTitle.setText(names[position]);
		txtTitle2.setText(numbers[position]);
		
		return rowView;
		
	}


}
