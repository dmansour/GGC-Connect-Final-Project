package com.example.ggcdegrees;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Mathematics extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mathematics);
		
		Button AppMath = (Button) findViewById(R.id.appliedMath);
		AppMath.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{	
				String pdfurl = "http://www.ggc.edu/about-ggc/departments/registrar/docs/program-plans/2011-2012/2011-12-math-applied-math.pdf";
				String googleDocsUrl = "http://docs.google.com/viewer?url=" + pdfurl;
				Intent pdf_intent = new Intent(Intent.ACTION_VIEW);
				pdf_intent.setDataAndType(Uri.parse(googleDocsUrl), "text/html");
				startActivity(pdf_intent);
				
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Loading Applied Math Program...", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();
			}
			
		});		
				
		Button PureMath = (Button) findViewById(R.id.pureMath);
		PureMath.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{	
				String pdfurl = "http://www.ggc.edu/about-ggc/departments/registrar/docs/program-plans/2011-2012/2011-12-math-pure-math.pdf";
				String googleDocsUrl = "http://docs.google.com/viewer?url=" + pdfurl;
				Intent pdf_intent = new Intent(Intent.ACTION_VIEW);
				pdf_intent.setDataAndType(Uri.parse(googleDocsUrl), "text/html");
				startActivity(pdf_intent);
				
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Loading Pure Math Program...", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();
			}
			
		});		
		
	Button TeachCert = (Button) findViewById(R.id.teacherCertMath);
	TeachCert.setOnClickListener(new OnClickListener()
	{

		@Override
		public void onClick(View v) 
		{	
			String pdfurl = "http://www.ggc.edu/about-ggc/departments/registrar/docs/program-plans/2011-2012/2011-12-edu-math-teach-cert.pdf";
			String googleDocsUrl = "http://docs.google.com/viewer?url=" + pdfurl;
			Intent pdf_intent = new Intent(Intent.ACTION_VIEW);
			pdf_intent.setDataAndType(Uri.parse(googleDocsUrl), "text/html");
			startActivity(pdf_intent);
			
			Toast toast = Toast.makeText(getApplicationContext(), 
					"Loading Teacher Certification Program...", Toast.LENGTH_LONG);
			toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
			toast.show();
		}
		
	});		

		Button go_back_button = (Button) findViewById(R.id.math_back);
		go_back_button.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				Intent intent = new Intent(Mathematics.this, ScienceTechnology.class);
				Mathematics.this.startActivity(intent);
				
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Taking You Back...", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();
			}
			
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mathematics, menu);
		return true;
	}
}