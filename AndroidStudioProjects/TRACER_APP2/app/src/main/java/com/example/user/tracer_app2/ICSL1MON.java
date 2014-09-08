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


public class ICSL1MON extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_icsl1_mon);

        Button o1 = (Button) findViewById(R.id.button);
        o1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1MON.this, AVAILABLE.class));
            }
        });

        Button o2 = (Button) findViewById(R.id.button3);
        o2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1MON.this, ICSL1MONSCHED1.class));
            }
        });

        Button o3 = (Button) findViewById(R.id.button4);
        o3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1MON.this, ICSL1MONSCHED2.class));
            }
        });

        Button o4 = (Button) findViewById(R.id.button5);
        o4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1MON.this, AVAILABLE.class));
            }
        });

        Button o5 = (Button) findViewById(R.id.button6);
        o5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1MON.this, AVAILABLE.class));
            }
        });

        Button o6 = (Button) findViewById(R.id.button7);
        o6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1MON.this, AVAILABLE.class));
            }
        });

        Button o7 = (Button) findViewById(R.id.button8);
        o7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1MON.this, AVAILABLE.class));
            }
        });

        Button o8 = (Button) findViewById(R.id.button9);
        o8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1MON.this, AVAILABLE.class));
            }
        });

        Button o9 = (Button) findViewById(R.id.button10);
        o9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1MON.this, AVAILABLE.class));
            }
        });

        Button o10 = (Button) findViewById(R.id.button11);
        o10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1MON.this, AVAILABLE.class));
            }
        });

        Button o11 = (Button) findViewById(R.id.button12);
        o11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1MON.this, AVAILABLE.class));
            }
        });

        Button o12 = (Button) findViewById(R.id.button13);
        o12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1MON.this, AVAILABLE.class));
            }
        });

        Button o13 = (Button) findViewById(R.id.button16);
        o13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1MON.this, AVAILABLE.class));
            }
        });

        Button o14 = (Button) findViewById(R.id.button14);
        o14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1MON.this, AVAILABLE.class));
            }
        });

        Button o15 = (Button) findViewById(R.id.button15);
        o15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1MON.this, MAIN.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.icsl1_mon, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_icsl1_mon, container, false);
            return rootView;
        }
    }
}
