package com.view;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	
	Button btnDisplay;
	ImageButton btnAdd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnAdd = (ImageButton) findViewById(R.id.btnAdd);
		btnDisplay = (Button) findViewById(R.id.btnDisplay);
		
		MyLayoutOperation.add(this, btnAdd);
		MyLayoutOperation.display(this, btnDisplay);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
