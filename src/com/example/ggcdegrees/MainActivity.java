package com.example.ggcdegrees;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Button that starts the application and lets the user choose their school
		
		Button start = (Button) findViewById(R.id.button1_id);
		start.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				Intent intent = new Intent(MainActivity.this, Schools.class);
				MainActivity.this.startActivity(intent);
				
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Choose your desired school...", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();
			}
			
		});
		
		// Button that will exit the application to the main GGC-Connect application
		
		Button exit = (Button) findViewById(R.id.button2_id);
		exit.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Leaving Application...", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();		
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
