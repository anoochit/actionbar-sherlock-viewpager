package com.example.testsherlock_viewpager;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuInflater;

public class FragmentVideo extends SherlockFragment {
	
	Activity activity;
	Context context;

	@Override
	public void onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu,
			MenuInflater inflater) {
		super.onCreateOptionsMenu(menu, inflater);
	}

	@Override
	public SherlockFragmentActivity getSherlockActivity() {
		return super.getSherlockActivity();
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
	}

	@Override
	public void onAttach(Activity a) {
		// sent parent activity to public variable
		activity = a; 
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_video, container, false);
		Log.d("VLOG", "onCreateView");
		return view;
	}
	
	public boolean checkNetworkStatus() {
		ConnectivityManager connectivityManager = (ConnectivityManager) activity.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
		return activeNetworkInfo != null;
	} 

}
