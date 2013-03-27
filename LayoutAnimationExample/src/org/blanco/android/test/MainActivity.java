package org.blanco.android.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;

public class MainActivity extends Activity {

	LinearLayout container = null;
	private static LayoutParams mParams = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
	    ViewGroup.LayoutParams.WRAP_CONTENT);
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		container = (LinearLayout) findViewById(R.id.layout_container);	
	}

	public void btnAddViewClicked(View view){
	  Button btn = new Button(view.getContext());
	  btn.setLayoutParams(mParams); btn.setText("Useless Button");
		container.addView(btn,0);
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
