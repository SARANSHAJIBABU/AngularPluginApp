package com.saran.pluginapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TestActivity extends Activity implements OnClickListener{
	
    Button loginButton;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.test);
	    
	    loginButton = (Button) findViewById(R.id.login_button);
	    loginButton.setOnClickListener(this);
	    
	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(this,PluginApp.class);
		startActivity(intent);
	}
}
