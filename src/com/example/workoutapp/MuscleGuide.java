package com.example.workoutapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MuscleGuide extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.muscle_guide);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.muscle_list_entries, R.layout.muscle_list_element);
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
			startActivity(new Intent(MuscleGuide.this, ChestList.class));
		}
		else if (id == 1)
		{
			startActivity(new Intent(MuscleGuide.this, BackList.class));
		}
		else if (id == 2)
		{
			startActivity(new Intent(MuscleGuide.this, LegsList.class));
		}
		else if (id == 3)
		{
			startActivity(new Intent(MuscleGuide.this, TricepsList.class));
		}
		else if (id == 4)
		{
			startActivity(new Intent(MuscleGuide.this, AbdomenList.class));
		}
		else if (id == 5)
		{
			startActivity(new Intent(MuscleGuide.this, ForearmList.class));
		}
		else if (id == 6)
		{
			startActivity(new Intent(MuscleGuide.this, BicepList.class));
		}
		else if (id == 7)
		{
			startActivity(new Intent(MuscleGuide.this, ButtocksList.class));
		}
		else if (id == 8)
		{
			startActivity(new Intent(MuscleGuide.this, ShouldersList.class));
		}
		
	}
}
