package org.servalproject.UI;

import org.servalproject.UI.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ServalProjectUI extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
   


        Button btnWizard = (Button) findViewById(R.id.btnWizard);
        btnWizard.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {

				Toast.makeText(getApplicationContext(),
						" You need to make something happen here", Toast.LENGTH_SHORT).show();
			}
		});

        
    } }