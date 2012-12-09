package com.example.progressbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class ProgressBarActivity extends Activity {

	Button btnStartProgress;
	SeekBar progressBar;
	ProgressBar p;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.progresbar_main);
		progressBar = (SeekBar) findViewById(R.id.progressBar);		
		progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.seekbar));
		

	}
}