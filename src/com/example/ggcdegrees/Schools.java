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

public class Schools extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_schools);
		
		Button business_button = (Button) findViewById(R.id.school_business);
		business_button.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				Intent intent = new Intent(Schools.this, Business.class);
				Schools.this.startActivity(intent);
				
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Loading School of Business Majors...", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();
			}
			
		});
		
		Button education_button = (Button) findViewById(R.id.school_education);
		education_button.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				Intent intent = new Intent(Schools.this, Education.class);
				Schools.this.startActivity(intent);
				
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Loading School of Education Majors...", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();
			}
			
		});
		
		Button health_science_button = (Button) findViewById(R.id.school_health);
		health_science_button.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				Intent intent = new Intent(Schools.this, HealthScience.class);
				Schools.this.startActivity(intent);
				
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Loading School of Health Sciences Majors...", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();
			}
			
		});
		
		Button liberal_arts_button = (Button) findViewById(R.id.school_liberalarts);
		liberal_arts_button.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				Intent intent = new Intent(Schools.this, LiberalArts.class);
				Schools.this.startActivity(intent);
				
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Loading School of Liberal Arts Majors...", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();
			}
			
		});
		
		Button science_technology_button = (Button) findViewById(R.id.school_sciencetech);
		science_technology_button.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				Intent intent = new Intent(Schools.this, ScienceTechnology.class);
				Schools.this.startActivity(intent);
				
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Loading School of Science and Technology Majors...", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();
			}
			
		});
		
		Button go_back_button = (Button) findViewById(R.id.schools_back);
		go_back_button.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				Intent intent = new Intent(Schools.this, MainActivity.class);
				Schools.this.startActivity(intent);
				
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Taking you back...", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.schools, menu);
		return true;
	}

}
