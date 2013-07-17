/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.me.androiddemo;

import android.app.Activity;
import android.os.Bundle;

import org.library.*;

import android.view.View;
import android.widget.EditText;
import android.widget.Button;

/**
 *
 * @author Spartacus Rex
 */
public class MainActivity extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        // ToDo add your GUI initialization code here
        setContentView(R.layout.main);
	
		String test = libfunc.getMessage();

    }

	public void onHello(View view) {
		EditText edt = (EditText)findViewById(R.id.edt_msg);
		Button btn = (Button)findViewById(R.id.btn_hello);
		btn.setText(edt.getText().toString());
	}

}
