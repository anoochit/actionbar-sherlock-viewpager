package com.example.testsherlock_viewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuInflater;

public class FragmentTwitter extends SherlockFragment {
 

	@Override
	public void onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu,
			MenuInflater inflater) { 
		super.onCreateOptionsMenu(menu, inflater);
	} 
	
	@Override
	public SherlockFragmentActivity getSherlockActivity() {
		// TODO Auto-generated method stub
		return super.getSherlockActivity();
	} 
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) { 
		
		View view = inflater.inflate(R.layout.fragment_twitter, container, false);
	 
		
		return view;
	}
 

}
