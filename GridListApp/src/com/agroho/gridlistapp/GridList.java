package com.agroho.gridlistapp;



import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

public class GridList extends Activity {
ListView list;
GridView gView;
	String[] day = {"S","S","M","T","W","T","F"};
	String[] date = {"","1","2","3","4","5","6"};
	
	String[] names = {"Rezaul Alam", "Abdul Karim", "Nahid Hasan", "Abdur Rahman"};
	String[] numbers = {"01966879412","01717879412","01678798221","01515212711"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid_list);
CustomListAdapter adapter = new CustomListAdapter(GridList.this, names, numbers);
		
		list=(ListView)findViewById(R.id.listView1);
        list.setAdapter(adapter);
        
CustomGridAdapter GridAdapter = new CustomGridAdapter(GridList.this,day,date);
		
		gView = (GridView)findViewById(R.id.gridView1);
		gView.setAdapter(GridAdapter);
		
	}



}
