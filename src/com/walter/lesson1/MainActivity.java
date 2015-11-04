package com.walter.lesson1;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
 
    public void test(View v)
    {
      Toast.makeText(this, "Works", Toast.LENGTH_SHORT).show();	
    }
    //show the current date when you click on the other button
    public void tarehe(View v)
    {      //Date class from java.util
      Date now =new  Date();
      SimpleDateFormat ft =new SimpleDateFormat("yyyy/MM/dd E");
      String leo = ft.format(now);
      Toast.makeText(this, leo, Toast.LENGTH_SHORT).show();
    } 
    
    
    
    
    
}
