package com.github.captain_miao.databinding.tutorial.helper;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

/**
 * Cross-Platform Navigation (based on URI)
 *
 * <p><b>Instance should NEVER be kept, due to possible memory-leak to context.</b></p>
 *
 *  @author Oasis
 */
public class Nav {

	/** @param context use current Activity if possible */
	public static Nav from(final Context context) {
		return new Nav(context);
	}


    private Nav(final Context context) {
   		mContext = context;
   		mIntent = new Intent(Intent.ACTION_VIEW);
   	}

	/** Extras to be put into activity intent. */
	public Nav withExtras(final Bundle extras) {
		if(extras == null) {
            return this;
        }

		mIntent.putExtras(extras);
		return this;
	}

	/** Flags to be added to activity intent */
	public Nav withFlags(final int flags) {
		mIntent.addFlags(flags);
		return this;
	}

	/** Start UI component associated with the specific URI.
	 * @return true if successful, or false if no UI component matches the URI
	 */
    public boolean toUri(final String uri) {

        if (TextUtils.isEmpty(uri))
            return false;

        return toUri(Uri.parse(uri));
    }


	/** Start activity associated with the specific URI. */
	/** it may return false, when target activity didn't finded, the caller should handler this case */
    public boolean toUri(final Uri uri) {
        final Intent intent = mIntent.setData(uri);
        Log.d(TAG, uri.toString());
        try {
            mContext.startActivity(intent);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }



	private final Context mContext;
	private final Intent mIntent;

	private static final String TAG = "Nav";
}
