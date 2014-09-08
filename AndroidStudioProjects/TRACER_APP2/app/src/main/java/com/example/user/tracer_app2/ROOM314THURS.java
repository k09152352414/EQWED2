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


public class ROOM314THURS extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_room314_thur);

        Button k1 = (Button) findViewById(R.id.button);
        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314THURS.this, ROOM314THURSSCHED1.class));
            }
        });

        Button k2 = (Button) findViewById(R.id.button3);
        k2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314THURS.this, ROOM314THURSSCHED2.class));
            }
        });

        Button k3 = (Button) findViewById(R.id.button4);
        k3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314THURS.this, ROOM314THURSSCHED3.class));
            }
        });

        Button k4 = (Button) findViewById(R.id.button5);
        k4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314THURS.this, AVAILABLE.class));
            }
        });

        Button k5 = (Button) findViewById(R.id.button6);
        k5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314THURS.this, AVAILABLE.class));
            }
        });

        Button k6 = (Button) findViewById(R.id.button7);
        k6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314THURS.this, ROOM314THURSSCHED4.class));
            }
        });

        Button k7 = (Button) findViewById(R.id.button8);
        k7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314THURS.this, ROOM314THURSSCHED5.class));
            }
        });

        Button k8 = (Button) findViewById(R.id.button9);
        k8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314THURS.this, AVAILABLE.class));
            }
        });

        Button k9 = (Button) findViewById(R.id.button10);
        k9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314THURS.this, AVAILABLE.class));
            }
        });

        Button k10 = (Button) findViewById(R.id.button11);
        k10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314THURS.this, AVAILABLE.class));
            }
        });

        Button k11 = (Button) findViewById(R.id.button12);
        k11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314THURS.this, AVAILABLE.class));
            }
        });

        Button k12 = (Button) findViewById(R.id.button13);
        k12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314THURS.this, AVAILABLE.class));
            }
        });

        Button k13 = (Button) findViewById(R.id.button2);
        k13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314THURS.this, AVAILABLE.class));
            }
        });

        Button k14 = (Button) findViewById(R.id.button14);
        k14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314THURS.this, AVAILABLE.class));
            }
        });

        Button k15 = (Button) findViewById(R.id.button15);
        k15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314THURS.this, MAIN.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.room314_thur, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_room314_thur, container, false);
            return rootView;
        }
    }
}
