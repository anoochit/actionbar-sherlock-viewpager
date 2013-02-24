package com.example.testsherlock;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.app.ActionBar.Tab;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends SherlockFragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		ActionBar actionbar = getSupportActionBar();
		actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		ActionBar.Tab tabVideo = actionbar.newTab();
		ActionBar.Tab tabLive = actionbar.newTab();
		ActionBar.Tab tabTwitter = actionbar.newTab();
		ActionBar.Tab tabAbout = actionbar.newTab();
		
		tabVideo.setText("Video");
		tabLive.setText("Concert");
		tabTwitter.setText("Twitter");
		tabAbout.setText("About");
		
		tabVideo.setTabListener(new MyTabListener());
		tabLive.setTabListener(new MyTabListener());
		tabTwitter.setTabListener(new MyTabListener());
		tabAbout.setTabListener(new MyTabListener());
		
		actionbar.addTab(tabVideo);
		actionbar.addTab(tabLive);
		actionbar.addTab(tabTwitter);
		actionbar.addTab(tabAbout);		
	}
	
	private class MyTabListener implements ActionBar.TabListener
	{

		@Override
		public void onTabSelected(Tab tab, FragmentTransaction ft) { 
			if (tab.getPosition() == 0) {
				FragmentVideo frag = new FragmentVideo();
				ft.replace(android.R.id.content, frag);
			}
		}

		@Override
		public void onTabUnselected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTabReselected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			
		}
	
	}

}
