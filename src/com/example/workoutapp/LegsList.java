package com.example.workoutapp;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class LegsList extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.legs_list);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.legs_list_entries, R.layout.muscle_list_element);
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
			Intent i = new Intent(Intent.ACTION_VIEW, 
				       Uri.parse("https://www.youtube.com/watch?v=ZcBVwoiPz2A"));
				startActivity(i);
		}
		else if (id == 1)
		{
			Intent i = new Intent(Intent.ACTION_VIEW, 
				       Uri.parse("https://www.youtube.com/watch?v=blcqORha6Uo"));
				startActivity(i);
		}
		else if (id == 2)
		{
			Intent i = new Intent(Intent.ACTION_VIEW, 
				       Uri.parse("https://www.youtube.com/watch?v=OjRjyvnLTgU"));
				startActivity(i);;
		}
		else if (id == 3)
		{
			Intent i = new Intent(Intent.ACTION_VIEW, 
				       Uri.parse("https://www.youtube.com/watch?v=Hhsj3pKT90A"));
				startActivity(i);
		}
		else if (id == 4)
		{
			Intent i = new Intent(Intent.ACTION_VIEW, 
				       Uri.parse("https://www.youtube.com/watch?v=VdGuHOh7vE8"));
				startActivity(i);
		}
		else if (id == 5)
		{
			Intent i = new Intent(Intent.ACTION_VIEW, 
				       Uri.parse("https://www.youtube.com/watch?v=AftaVRDdat0"));
				startActivity(i);;
		}
	}
}
