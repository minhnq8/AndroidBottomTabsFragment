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

		// mTabHost = new FragmentTabHost(this);
		// mTabHost.setup(this, getSupportFragmentManager(),
		// R.id.menu_settings);
		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(), R.id.readtablecontent);

		Bundle b = new Bundle();
		b.putString("key", "Simple");
		mTabHost.addTab(mTabHost.newTabSpec("simple").setIndicator("Simple"), FirstFragmentTab.class, b);
		//
		b = new Bundle();
		System.out.print("hello git");
		b.putString("key", "Contacts");
		mTabHost.addTab(mTabHost.newTabSpec("contacts").setIndicator("Contacts"), SecondFragmentTab.class, b);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
