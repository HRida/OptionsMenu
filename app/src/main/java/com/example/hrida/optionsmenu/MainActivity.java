package com.example.hrida.optionsmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //Inflate the menu; this adds items to the actionbar if it is present
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        //Handle action bar item clicks here. The action bar will
        //automatically handle clicks on the Home/Up button, so long
        ImageView img= (ImageView) findViewById(R.id.bgImage);
        //Handle item selection
        switch (item.getItemId()){

            case R.id.A:
                //write code to execute when clicked on this option
                img.setImageResource(R.drawable.image_a);
                return true;
            case R.id.B:
                //write code to execute when clicked on this option
                img.setImageResource(R.drawable.image_b);
                return true;
            case R.id.C:
                //write code to execute when clicked on this option
                img.setImageResource(R.drawable.image_c);
                return true;
            case R.id.D:
                //write code to execute when clicked on this option
                img.setImageResource(R.drawable.image_d);
                return true;
            case R.id.E:
                //write code to execute when clicked on this option
                img.setImageResource(R.drawable.image_e);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
