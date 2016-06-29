package com.github.captain_miao.databinding.tutorial.helper;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/**
 * @author YanLu
 * @since 16/6/20
 */
public class DecimalFilter implements TextWatcher {

    public static DecimalFilter create(EditText et){
        return new DecimalFilter(et);
    }

	/**小数点个数 默认是2个*/
	private int defaultPointPosition = 2;

	private EditText et;

	public DecimalFilter(EditText et) {
		this.et = et;
	}



	@Override
	public void beforeTextChanged(CharSequence s, int start, int count, int after) {

	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {

	}

	@Override
	public void afterTextChanged(Editable s) {
		String content = s.toString();

		if(content.equals(""))
		{
			return;
		}


		if(content.contains(".")){

			if(content.startsWith("."))
			{
				et.setText("");
				return;
			}

			int contentLength = content.length();
			int pointPosition = content.indexOf(".");
			int overPosition = contentLength - 1 - pointPosition - defaultPointPosition;
			if(overPosition > 0)
			{
				content = content.substring(0,contentLength - overPosition);
				et.setText(content);
				et.setSelection(content.length());
			}
		}

	}

}
