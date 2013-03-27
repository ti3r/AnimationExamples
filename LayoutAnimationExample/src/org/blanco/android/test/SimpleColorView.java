package org.blanco.android.test;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;

public class SimpleColorView extends View implements View.OnClickListener {

	private boolean mExpanded = false;
	private static LayoutParams mParams = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,50);
	private static LayoutParams mParamsExtended = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,150);
	
	private static synchronized int getRandomColor(){
		int red = (int) (Math.random() * 128);
		int green = (int) (Math.random() * 128);
		int blue = (int) (Math.random() * 128);
		return 0xff << 24 | red << 16 | green << 8 | blue;
	}
	
	public SimpleColorView(Context context) {
		super(context);
		setLayoutParams(mParams);
		setBackgroundColor(getRandomColor());
		setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if (mExpanded){
			this.setLayoutParams(mParams);
		}else{
			this.setLayoutParams(mParamsExtended);
		}
		mExpanded = !mExpanded;
	}
	
	

}
