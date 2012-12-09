package com.example.progressbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class ProgressBarActivity extends Activity {

	Button btnStartProgress;
	SeekBar seekBar;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.progresbar_main);
		seekBar = (SeekBar) findViewById(R.id.seekBar2);
		
		seekBar.setProgressDrawable(getResources().getDrawable(R.drawable.seekbar));
		

	}
}