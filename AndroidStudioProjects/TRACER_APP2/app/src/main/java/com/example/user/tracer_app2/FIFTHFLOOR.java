package com.example.user.tracer_app2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FIFTHFLOOR extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_fifthfloor);

        Button my18 = (Button) findViewById(R.id.button);
        my18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FIFTHFLOOR.this, ROOM50.class));
            }
        });

        Button my19 = (Button) findViewById(R.id.button2);
        my19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FIFTHFLOOR.this, ROOM52.class));
            }
        });

        Button my20 = (Button) findViewById(R.id.button3);
        my20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FIFTHFLOOR.this, ROOM53.class));
            }
        });

        Button my21 = (Button) findViewById(R.id.button4);
        my21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FIFTHFLOOR.this, ROOM54.class));
            }
        });

        Button my22 = (Button) findViewById(R.id.button5);
        my22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FIFTHFLOOR.this, ROOM55.class));
            }
        });

        Button my23 = (Button) findViewById(R.id.button6);
        my23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FIFTHFLOOR.this, ROOM56.class));
            }
        });

        Button my24 = (Button) findViewById(R.id.button7);
        my24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FIFTHFLOOR.this, ROOM57.class));
            }
        });

        Button my25 = (Button) findViewById(R.id.button8);
        my25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FIFTHFLOOR.this, ROOM58.class));
            }
        });

        Button my26 = (Button) findViewById(R.id.button9);
        my26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FIFTHFLOOR.this, MAIN.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.fifthfloor, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_fifthfloor, container, false);
            return rootView;
        }
    }
}
