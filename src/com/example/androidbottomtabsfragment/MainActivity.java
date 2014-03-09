package com.example.androidbottomtabsfragment;

import com.example.androidbottomtabsfragment.fragment.FirstFragmentTab;
import com.example.androidbottomtabsfragment.fragment.SecondFragmentTab;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.Menu;

public class MainActivity extends FragmentActivity {
	public FragmentTabHost mTabHost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.botton_tabs);
		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(), R.id.readtablecontent);

		Bundle b = new Bundle();
		b.putString("key", "FirstTab");
		mTabHost.addTab(mTabHost.newTabSpec("firsttab").setIndicator("FirstTab"), FirstFragmentTab.class, b);

		b = new Bundle();
		b.putString("key", "SecondTab");
		mTabHost.addTab(mTabHost.newTabSpec("secondtab").setIndicator("SecondTab"), SecondFragmentTab.class, b);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true; 
	}

}
