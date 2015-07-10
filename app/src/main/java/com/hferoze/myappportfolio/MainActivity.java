/*
 * Copyright (C) 2015 Hassan Feroze
 */

package com.hferoze.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    private Button mBtnSpotifyStreamer;
    private Button mBtnScoresApp;
    private Button mBtnLibraryApp;
    private Button mBtnBuildItBigger;
    private Button mBtnXYZReader;
    private Button mBtnCapstoneApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instantiate All Buttons
        mBtnSpotifyStreamer = (Button)findViewById(R.id.mBtnSpotifyStreamer);
        mBtnScoresApp = (Button)findViewById(R.id.mBtnScoresApp);
        mBtnLibraryApp = (Button)findViewById(R.id.mBtnLibraryApp);
        mBtnBuildItBigger =(Button)findViewById(R.id.mBtnBuildItBigger);
        mBtnXYZReader = (Button)findViewById(R.id.mBtnXYZReader);
        mBtnCapstoneApp = (Button) findViewById(R.id.mBtnCapstoneApp);

        //Implement OnClickListeners for all the buttons
        mBtnSpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button with launch my "+mBtnSpotifyStreamer.getText() + " app!");

            }
        });

        mBtnScoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button with launch my "+mBtnScoresApp.getText() + " app!");

            }
        });

        mBtnLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button with launch my "+mBtnLibraryApp.getText() + " app!");

            }
        });

        mBtnBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button with launch my "+mBtnBuildItBigger.getText() + " app!");

            }
        });

        mBtnXYZReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button with launch my "+mBtnXYZReader.getText() + " app!");

            }
        });

        mBtnCapstoneApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button with launch my "+mBtnCapstoneApp.getText() + " app!");
            }
        });

    }

    /**
     * Shows a toast message with text from character sequence c
     */

    public void showToast(CharSequence c) {
        //Inflate a layout
        LayoutInflater inflater = getLayoutInflater();

        //Invoke toast_layout and LinearLayout toast_layout_root
        View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.toast_layout_root));

        //Invoke TextView toastText
        TextView text = (TextView) layout.findViewById(R.id.toastText);
        text.setText(c);

        //Instantiate toast and show
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 30);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
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
}
