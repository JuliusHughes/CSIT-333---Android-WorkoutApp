package com.example.workoutapp;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class ExerciseList3 extends Activity {

	String exercise;
	int weight, sets, reps;
	SQLiteDatabase db;
	TableRow tableRow;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exercise_list3);
		db = openOrCreateDatabase("Fitness3DB",MODE_PRIVATE, null);
		db.execSQL("CREATE TABLE IF NOT EXISTS Workout3(exercise VARCHAR,weight INTEGER,sets INTEGER, reps INTEGER);");
	}
	
	public void addButton(View view)
	{
		Spinner exerciseTxt = (Spinner) findViewById(R.id.spinExercise3);
		EditText weightTxt = (EditText) findViewById(R.id.editWeight3);
		EditText repsTxt = (EditText) findViewById(R.id.editReps3);
		EditText setsTxt = (EditText) findViewById(R.id.editSets3);
		
		exerciseTxt.setOnItemSelectedListener(new MyOnItemSelectedListener());
		
		exercise = exerciseTxt.getSelectedItem().toString();
		weight = Integer.valueOf(weightTxt.getText().toString());
		sets = Integer.valueOf(setsTxt.getText().toString());
		reps = Integer.valueOf(repsTxt.getText().toString());
		
		db.execSQL("INSERT INTO  Workout3 VALUES('"+exercise+"','"+weight+"','"+sets+"', '"+reps+"');");
		
		
		Toast.makeText(ExerciseList3.this, "Exercise added", Toast.LENGTH_LONG).show();
	}
	
	public void showData(View view)
	{
	    Cursor c = db.rawQuery("SELECT * from Workout3", null);
	    
	    int count= c.getCount();
	    c.moveToFirst();
	    
	    TableLayout tableLayout = new TableLayout(getApplicationContext());
	    tableLayout.setVerticalScrollBarEnabled(true);
	    TableRow tableRow;
	    
	    TextView textView,textView1,textView2,textView3,textView4,textView5, textView6, textView7;
	    tableRow = new TableRow(getApplicationContext());
	    textView=new TextView(getApplicationContext());
	    textView.setText("Exercise");
	    textView.setTextColor(Color.RED);
	  	textView.setTypeface(null, Typeface.BOLD);
	  	textView.setPadding(20, 20, 20, 20);
	  	tableRow.addView(textView);
	  	
	    textView4=new TextView(getApplicationContext());
	  	textView4.setText("Weight");
	  	textView4.setTextColor(Color.RED);
	  	textView4.setTypeface(null, Typeface.BOLD);
	  	 textView4.setPadding(20, 20, 20, 20);
	  	tableRow.addView(textView4);
	  	
	    textView5=new TextView(getApplicationContext());
	  	textView5.setText("Sets");
	  	textView5.setTextColor(Color.RED);
	  	textView5.setTypeface(null, Typeface.BOLD);
	  	textView5.setPadding(20, 20, 20, 20);
	  	tableRow.addView(textView5);
	  	
	  	textView6 = new TextView(getApplicationContext());
	  	textView6.setText("Reps");
	  	textView6.setTextColor(Color.RED);
	  	textView6.setTypeface(null, Typeface.BOLD);
	  	textView6.setPadding(20, 20, 20, 20);
	  	tableRow.addView(textView6);
	  	
	   tableLayout.addView(tableRow);
	     for (Integer j = 0; j < count; j++)
	     {
	         tableRow = new TableRow(getApplicationContext());
	         textView1 = new TextView(getApplicationContext());
	         textView1.setText(c.getString(c.getColumnIndex("exercise")));
	         textView2 = new TextView(getApplicationContext());
	         textView2.setText(c.getString(c.getColumnIndex("weight")));
	         textView3 = new TextView(getApplicationContext());
	         textView3.setText(c.getString(c.getColumnIndex("sets")));
	         textView7 = new TextView(getApplicationContext());
	         textView7.setText(c.getString(c.getColumnIndex("reps")));
	         
	         textView1.setPadding(20, 20, 20, 20);
	         textView2.setPadding(20, 20, 20, 20);
	         textView3.setPadding(20, 20, 20, 20);
	         textView7.setPadding(20, 20, 20, 20);
	         
	         tableRow.addView(textView1);
	         tableRow.addView(textView2);
	         tableRow.addView(textView3);
	         tableRow.addView(textView7);
	         tableLayout.addView(tableRow);
	         c.moveToNext() ;
	     }
	     setContentView(tableLayout);
	     db.close();
	}
	
	
	
}
