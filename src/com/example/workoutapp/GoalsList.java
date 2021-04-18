package com.example.workoutapp;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class GoalsList extends Activity {
	
	String goal;
	SQLiteDatabase db;
	TableRow tableRow;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.goals_list);
		db = openOrCreateDatabase("GoalsDB",MODE_PRIVATE, null);
		db.execSQL("CREATE TABLE IF NOT EXISTS FitGoals4(goal TEXT);");
	}
	
	public void addButton(View view)
	{
		EditText goalsTxt = (EditText) findViewById(R.id.editGoal);
		
		goal = goalsTxt.getText().toString();
		
		db.execSQL("INSERT INTO  FitGoals4 VALUES('"+goal+"');");
		
		Toast.makeText(GoalsList.this, "Goal added", Toast.LENGTH_LONG).show();
	}
	
	public void showData(View view)
	{
	    Cursor c = db.rawQuery("SELECT * from FitGoals4", null);
	    
	    int count= c.getCount();
	    c.moveToFirst();
	    
	    TableLayout tableLayout = new TableLayout(getApplicationContext());
	    tableLayout.setVerticalScrollBarEnabled(true);
	    TableRow tableRow;
	    
	    TextView textView,textView1;
	    tableRow = new TableRow(getApplicationContext());
	    textView=new TextView(getApplicationContext());
	    textView.setText("Goals");
	    textView.setTextColor(Color.RED);
	  	textView.setTypeface(null, Typeface.BOLD);
	  	textView.setPadding(20, 20, 20, 20);
	  	tableRow.addView(textView);
	  	
	  	
	     tableLayout.addView(tableRow);
	     for (Integer j = 0; j < count; j++)
	     {
	         tableRow = new TableRow(getApplicationContext());
	         textView1 = new TextView(getApplicationContext());
	         textView1.setText(c.getString(c.getColumnIndex("goal")));
	         
	         textView1.setPadding(20, 20, 20, 20);
	         
	         tableRow.addView(textView1);
	         tableLayout.addView(tableRow);
	         c.moveToNext() ;
	     }
	     setContentView(tableLayout);
	     db.close();
	}
}
