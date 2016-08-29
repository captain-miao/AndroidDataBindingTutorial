package com.github.captain_miao.databinding.tutorial.helper;

import android.databinding.BindingAdapter;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * @author YanLu
 * @since 16/4/27
 */
public class ViewVisibleBindingAdapter {

    @BindingAdapter("isGone")
    public static void setIsGone(View view, boolean hide){
      view.setVisibility(hide ? View.GONE : View.VISIBLE);
    }

    @BindingAdapter("isInvisible")
    public static void setIsInvisible(View view, boolean hide){
      view.setVisibility(hide ? View.INVISIBLE : View.VISIBLE);
    }

    @BindingAdapter({"textFlags"})
    public static void setTextViewFlag(TextView textView, int flags) {
        textView.getPaint().setFlags(flags);
    }

    @BindingAdapter({"editTextSelection"})
    public static void setEditTextSelection(EditText editText, String text) {
        if(!TextUtils.isEmpty(text)) {
            try {
                editText.setSelection(Math.max(0, text.length()));
            } catch (Exception e){

            }
        } else {
            //editText.setSelection(0);
        }
    }


    @BindingAdapter("android:paddingLeft")
    public static void setPaddingLeft(View view, int oldPadding, int newPadding) {
        if (oldPadding != newPadding) {
            view.setPadding(newPadding,
                    view.getPaddingTop(),
                    view.getPaddingRight(),
                    view.getPaddingBottom());
        }
    }
}
