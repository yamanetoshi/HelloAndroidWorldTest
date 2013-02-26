package com.example.helloandroid.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.helloandroid.*;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity activity;
	private TextView view;
	private String resourceString;

	public MainActivityTest() {
		super(MainActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
        activity = getActivity();
        view = (TextView) activity
                .findViewById(com.example.helloandroid.R.id.textView);
        resourceString = activity
                .getString(com.example.helloandroid.R.string.hello_world);
	}

	public void testText() throws Exception {
		assertNotNull(resourceString, view.getText().toString());
	}
}
