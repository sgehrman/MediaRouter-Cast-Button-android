/*
 * Copyright (C) 2014 Google Inc. All Rights Reserved. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */

package com.example.mediarouter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Sample app to demonstrate the various uses of Media Router to discover
 * devices.
 * 
 * @see http://developer.android.com/guide/topics/media/mediarouter.html
 */
public class MainActivity extends Activity {

	private static final String TAG = MainActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Display buttons to launch other activities for MediaRouter use cases
		Button button = (Button) findViewById(R.id.media_router_discovery);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.d(TAG, "MediaRouterDiscoveryActivity");
				startActivity(MediaRouterDiscoveryActivity.class);
			}
		});

		button = (Button) findViewById(R.id.media_router_button);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.d(TAG, "MediaRouterButtonActivity");
				startActivity(MediaRouterButtonActivity.class);
			}
		});

		button = (Button) findViewById(R.id.media_router_action_bar_button);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.d(TAG, "MediaRouterActionBarButtonActivity");
				startActivity(MediaRouterActionBarButtonActivity.class);
			}
		});

		button = (Button) findViewById(R.id.media_router_custom_dialog_button);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.d(TAG, "MediaRouterCustomDialogActivity");
				startActivity(MediaRouterCustomDialogActivity.class);
			}
		});
	}

	private void startActivity(Class<?> classType) {
		startActivity(new Intent(MainActivity.this, classType));
	}

}
