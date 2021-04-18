package com.example.workoutapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class WorkoutList extends ListActivity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.workout_list);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.workout_list, R.layout.muscle_list_element);
		setListAdapter(adapter);
	}
	
	@Override
	public void onListItemClick(ListView listView, View clickedView, int position, long id)
	{
		super.onListItemClick(listView, clickedView, position, id);
		TextView tv = (TextView) clickedView;
		String clickText = tv.getText() + " was clicked!";
		Toast.makeText(getBaseContext(), clickText, Toast.LENGTH_SHORT).show();
		
		if (id == 0)
		{
			startActivity(new Intent(WorkoutList.this, ExerciseList.class));
		}
		else if (id == 1)
		{
			startActivity(new Intent(WorkoutList.this, ExerciseList2.class));
		}
		else if (id == 2)
		{
			startActivity(new Intent(WorkoutList.this, ExerciseList3.class));
		}
		else if (id == 3)
		{
			startActivity(new Intent(WorkoutList.this, ExerciseList.class));
		}
		else if (id == 4)
		{
			startActivity(new Intent(WorkoutList.this, ExerciseList.class));
		}
		
	}
	
}
