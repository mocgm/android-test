package com.android.chronometer;

import com.android.gitandroidhelloworld.R;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Chronometer;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	private Chronometer chronometer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		chronometer = (Chronometer) findViewById(R.id.chronometer1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void start(View v) {
		chronometer.setBase(SystemClock.elapsedRealtime());
		chronometer.start();		
		Toast.makeText(getApplicationContext(), "Started", Toast.LENGTH_SHORT).show();	
	}
	
	public void stop(View v) {
		chronometer.stop();		
		Toast.makeText(getApplicationContext(), "Stopped", Toast.LENGTH_SHORT).show();	
	}
}
