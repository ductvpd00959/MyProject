package com.duanandroi;



import android.R;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MenuActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_menu);
		//
		// Khai bÃ¡o cÃ¡c thÃ nh pháº§n
		Resources res = getResources(); // Resource object to get Drawables
		TabHost tabHost = getTabHost(); // The activity TabHost
		TabHost.TabSpec spec; // Resusable TabSpec for each tab

		Intent intent; // Reusable Intent for each tab
		//
		// Táº¡o cÃ¡c tab trong chÆ°Æ¡ng trÃ¬nh
		intent = new Intent().setClass(this, DuLichActivity.class);
		spec = tabHost.newTabSpec("tab1")
				.setIndicator("Du Lich", res.getDrawable(R.drawable.ic_delete))
				.setContent(intent);
		tabHost.addTab(spec);
		tabHost.setCurrentTab(1);
		//
		intent = new Intent().setClass(this, AnUongActivity.class);
		spec = tabHost
				.newTabSpec("tab2")
				.setIndicator("Ăn Uống", res.getDrawable(R.drawable.ic_delete))
				.setContent(intent);
		tabHost.addTab(spec);

		//
		intent = new Intent().setClass(this, MuaSamActivity.class);
		spec = tabHost.newTabSpec("tab3")
				.setIndicator("Mua Sắm", res.getDrawable(R.drawable.ic_delete))
				.setContent(intent);
		tabHost.addTab(spec);
		
	}
}
