package com.example.testsherlock_viewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuInflater;

public class FragmentAbout extends SherlockFragment {
 

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
		
		View view = inflater.inflate(R.layout.fragment_about, container, false);
		TextView txt = (TextView) view.findViewById(R.id.textView1);
		txt.setText("xxx"); 
		
		return view;
	}
 

}
