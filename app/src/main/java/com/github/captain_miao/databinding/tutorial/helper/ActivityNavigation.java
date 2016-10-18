package com.github.captain_miao.databinding.tutorial.helper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

public class ActivityNavigation {

	public static ActivityNavigation from(final Context context) {
		return new ActivityNavigation(context);
	}


    private ActivityNavigation(final Context context) {
   		mContext = context;
   		mIntent = new Intent(Intent.ACTION_VIEW);
   	}

	public ActivityNavigation withExtras(final Bundle extras) {
		if(extras == null) {
            return this;
        }

		mIntent.putExtras(extras);
		return this;
	}

	public ActivityNavigation withFlags(final int flags) {
		mIntent.addFlags(flags);
		return this;
	}

    /**
     * @param request_code should >= 0, or no result will be returned to source activity.
     *
     * */
   	public ActivityNavigation forResult(final int request_code) {
   		if (! (mContext instanceof Activity)) throw new IllegalStateException("Only valid from Activity, but from " + mContext);
   		mRequestCode = request_code;
   		return this;
   	}

    public boolean toUri(final String uri) {

        if (TextUtils.isEmpty(uri))
            return false;

        return toUri(Uri.parse(uri));
    }


    public boolean toUri(final Uri uri) {
        final Intent intent = mIntent.setData(uri);
        Log.d(TAG, uri.toString());
        if (isIntentSafe(intent)) {
                if (mRequestCode >= 0) {
                    ((Activity) mContext).startActivityForResult(intent, mRequestCode);
                } else {
                    mContext.startActivity(intent);
                }
                return true;
        } else {
            // 不合法的Url 也做个尝试
            try {
                if (mRequestCode >= 0) {
                    ((Activity) mContext).startActivityForResult(intent, mRequestCode);
                } else {
                    mContext.startActivity(intent);
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    /**
     * this method is from the official guide:
     * http://developer.android.com/training/basics/intents/sending.html#StartActivity
     * */
    private boolean isIntentSafe(Intent intent) {
        return !mContext.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }


	private final Context mContext;
	private final Intent mIntent;
    private int mRequestCode = -1;

	private static final String TAG = "ActivityNavigation";
}
