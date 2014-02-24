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

import android.support.v7.app.MediaRouteControllerDialogFragment;
import android.support.v7.app.MediaRouteDialogFactory;

/**
 * This class extends {@link MediaRouteDialogFactory}, and provides a custom
 * implementation of {@link MediaRouteControllerDialogFragment}. It provides
 * access to {@link CustomMediaRouteControllerDialog}.
 */
public class CustomMediaRouteDialogFactory extends MediaRouteDialogFactory {

	private static final CustomMediaRouteDialogFactory sDefault = new CustomMediaRouteDialogFactory();

	/**
	 * Creates a new SampleMediaRouteDialogFactory.
	 */
	public CustomMediaRouteDialogFactory() {
		super();
	}

	/**
	 * Returns a default SampleMediaRouteDialogFactory.
	 */
	public static CustomMediaRouteDialogFactory getDefault() {
		return sDefault;
	}

	@Override
	public CustomMediaRouteControllerDialogFragment onCreateControllerDialogFragment() {
		return new CustomMediaRouteControllerDialogFragment();
	}

}
