package org.blanco.android.test;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {

	LinearLayout container = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		container = (LinearLayout) findViewById(R.id.layout_container);
		LayoutTransition transListener = container.getLayoutTransition();
		//transListener.setAnimator(LayoutTransition.CHANGE_APPEARING, 	new ValueAnimator());
		
	}

	public void btnAddViewClicked(View view){
		container.addView(new SimpleColorView(view.getContext()),0);
	}
	
	public void btnRemoveViewClicked(View view){
		if (container != null && container.getChildCount() > 0){
			container.removeViewAt(
					(int)(Math.random()  * (container.getChildCount())) 
					);
		}else{
			Toast.makeText(view.getContext(), "No views to remove", Toast.LENGTH_LONG).show();
		}
	}
	
}
