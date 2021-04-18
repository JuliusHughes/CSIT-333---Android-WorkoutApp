package com.example.workoutapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		muscleListButton();
		workoutListButton();
		goalsListButton();
	}
	
	private void muscleListButton()
	{
		Button elist = (Button) findViewById(R.id.btnGuide);
		elist.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent(MainActivity.this, MuscleGuide.class));
				
			}
		});
		
	}
	
	private void workoutListButton()
	{
		Button wlist = (Button) findViewById(R.id.btnWorkout);
		wlist.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent(MainActivity.this, WorkoutList.class));
				
			}
		});
	}
	
	private void goalsListButton()
	{
		Button glist = (Button) findViewById(R.id.btnGoals);
		glist.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent(MainActivity.this, GoalsList.class));
				
			}
		});
	}
}
