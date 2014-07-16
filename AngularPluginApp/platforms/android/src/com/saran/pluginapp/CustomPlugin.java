package com.saran.pluginapp;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;

public class CustomPlugin extends CordovaPlugin {

	public static final String ACTION_OPEN_ACTIVITY = "openActivity";

	@Override
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext){
		try {
			if (ACTION_OPEN_ACTIVITY.equals(action)) {
				Intent intent = new Intent(this.cordova.getActivity(),
						TestActivity.class);
				this.cordova.getActivity().startActivity(intent);
				callbackContext.success();
				return true;
			}
			callbackContext.error("Invalid action");
			return false;
		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
			callbackContext.error(e.getMessage());
			return false;
		}
	}
}
