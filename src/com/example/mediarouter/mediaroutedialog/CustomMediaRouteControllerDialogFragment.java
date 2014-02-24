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

package com.example.mediarouter.mediaroutedialog;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.MediaRouteControllerDialog;
import android.support.v7.app.MediaRouteControllerDialogFragment;

/**
 * This class extends {@link MediaRouteControllerDialogFragment}, and provides a
 * user-defined media route controller fragment. It also provides access to
 * {@link CustomMediaRouteControllerDialog}.
 */
public class CustomMediaRouteControllerDialogFragment extends
		MediaRouteControllerDialogFragment {

	private CustomMediaRouteControllerDialog mControllerDialog;

	public CustomMediaRouteControllerDialogFragment() {
		super();
	}

	@Override
	public MediaRouteControllerDialog onCreateControllerDialog(Context context,
			Bundle savedInstanceState) {
		mControllerDialog = new CustomMediaRouteControllerDialog(context);

		// Hide the volume slider.
		mControllerDialog.setVolumeControlEnabled(false);
		return mControllerDialog;
	}

	public CustomMediaRouteControllerDialog getControllerDialog() {
		return mControllerDialog;
	}
}
