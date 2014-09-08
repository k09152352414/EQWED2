package com.example.user.tracer_app2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;


public class ICSL1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_icsl1);

        Button n1 = (Button) findViewById(R.id.button);
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1.this, ICSL1MON.class));
            }
        });

        Button n2 = (Button) findViewById(R.id.button2);
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1.this, ICSL1TUES.class));
            }
        });

        Button n3 = (Button) findViewById(R.id.button3);
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1.this, ICSL1WED.class));
            }
        });

        Button n4 = (Button) findViewById(R.id.button4);
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1.this, ICSL1THURS.class));
            }
        });

        Button n5 = (Button) findViewById(R.id.button5);
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1.this, ICSL1FRI.class));
            }
        });

        Button n6 = (Button) findViewById(R.id.button6);
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1.this, ICSL1SAT.class));
            }
        });

        Button n7 = (Button) findViewById(R.id.button7);
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1.this, MAIN.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.icsl1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

        /**
         * A placeholder fragment containing a simple view.
         */
        public static class PlaceholderFragment extends Fragment {

            public PlaceholderFragment() {
            }

            @Override
            public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                     Bundle savedInstanceState) {
                View rootView = inflater.inflate(R.layout.fragment_icsl1, container, false);
                return rootView;
            }
        }
    }


