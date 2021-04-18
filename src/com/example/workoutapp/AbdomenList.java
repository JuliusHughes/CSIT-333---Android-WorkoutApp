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

public class AbdomenList extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.abdomen_list);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.abdomen_list_entries, R.layout.muscle_list_element);
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
				       Uri.parse("https://www.youtube.com/watch?v=oADJa1vgdZQ"));
				startActivity(i);
		}
		else if (id == 1)
		{
			Intent i = new Intent(Intent.ACTION_VIEW, 
				       Uri.parse("https://www.youtube.com/watch?v=QhGU5cmNZds"));
				startActivity(i);
		}
		else if (id == 2)
		{
			Intent i = new Intent(Intent.ACTION_VIEW, 
				       Uri.parse("https://www.youtube.com/watch?v=YtJZcoaMHsY"));
				startActivity(i);;
		}
		else if (id == 3)
		{
			Intent i = new Intent(Intent.ACTION_VIEW, 
				       Uri.parse("https://www.youtube.com/watch?v=oZOCx1Wdgu4"));
				startActivity(i);
		}
		else if (id == 4)
		{
			Intent i = new Intent(Intent.ACTION_VIEW, 
				       Uri.parse("https://www.youtube.com/watch?v=pDTHSnoGoEc"));
				startActivity(i);
		}
	}
}
