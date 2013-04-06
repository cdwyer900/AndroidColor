package com.mine.colors;

import java.util.Random;

import android.os.Bundle;
import android.provider.CalendarContract.Colors;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	Button buttonRed, buttonBlue, buttonRandom;
	TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        text = (TextView) findViewById (R.id.textView1);
        
        buttonRed = (Button) findViewById (R.id.button1);
        buttonRed.setId(1);
        // do the same for Blue and Random
  
        
        buttonRed.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
	    		 changeColor(v);
   		
	    	 }
        	
        });
 
        
        //set up a listener for blue and random
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void changeColor(View v)
    {
    	Button b = (Button) v;
    	
    	if (b.getId()==1)
    	{
    		text.setBackgroundColor(Color.RED);
        	text.setText("Red");	
    	}
    	else
    		if ((b.getId()==2))
    		{
  
    		}
    		else
    			if ((b.getId()==3))
    			{
    				//random
    				int color;
    				int r, g, bb;
    				String str;
    				
    				Random rand = new Random();
    				//generate random color
    				//build str with r, g, b number of color
    				
    	//			text.setBackgroundColor(color);
    	//			text.setText(String.valueOf(str));
    			}
    	
    	
    	
    }
    
}
