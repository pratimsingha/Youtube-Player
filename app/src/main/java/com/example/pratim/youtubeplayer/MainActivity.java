package com.example.pratim.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener
{

    private Button btn_playSingle;
    private Button btn_playStandalone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_playSingle = (Button)findViewById(R.id.btn_playSingle);     //link variable btn_playSingle with the  button btn_playSingle
        btn_playStandalone = (Button)findViewById(R.id.btn_standalone); //link variable btn_playStandalone with the  button btn_standalone
        btn_playSingle.setOnClickListener(this);
        btn_playStandalone.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //This method will be called when the setOnClickListener method will be provoked.
    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch(view.getId()){
            case R.id.btn_playSingle:   //Click on "Play a Single Video"; YoutubeActivity class will be called
                intent = new Intent(MainActivity.this,YoutubeActivity.class);
                break;
            case R.id.btn_standalone:   //Click on "Standalone Sub Menu"; StandaloneActivity class will be called
                intent = new Intent(MainActivity.this,StandaloneActivity.class);
                break;
            default:
        }
        if(intent != null){
            startActivity(intent);
        }
    }
}
