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


public class ROOM314SAT extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_room314_sat);

        Button m1 = (Button) findViewById(R.id.button);
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314SAT.this, AVAILABLE.class));
            }
        });

        Button m2 = (Button) findViewById(R.id.button3);
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314SAT.this, AVAILABLE.class));
            }
        });

        Button m3 = (Button) findViewById(R.id.button4);
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314SAT.this, AVAILABLE.class));
            }
        });

        Button m4 = (Button) findViewById(R.id.button5);
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314SAT.this, AVAILABLE.class));
            }
        });

        Button m5 = (Button) findViewById(R.id.button6);
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314SAT.this, AVAILABLE.class));
            }
        });

        Button m6 = (Button) findViewById(R.id.button7);
        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314SAT.this, AVAILABLE.class));
            }
        });

        Button m7 = (Button) findViewById(R.id.button8);
        m7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314SAT.this, ROOM314SATSCHED1.class));
            }
        });

        Button m8 = (Button) findViewById(R.id.button9);
        m8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314SAT.this, ROOM314SATSCHED2.class));
            }
        });

        Button m9 = (Button) findViewById(R.id.button10);
        m9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314SAT.this, ROOM314SATSCHED3.class));
            }
        });

        Button m10 = (Button) findViewById(R.id.button11);
        m10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314SAT.this, ROOM314SATSCHED4.class));
            }
        });

        Button m11 = (Button) findViewById(R.id.button12);
        m11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314SAT.this, ROOM314SATSCHED5.class));
            }
        });

        Button m12 = (Button) findViewById(R.id.button13);
        m12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314SAT.this, AVAILABLE.class));
            }
        });

        Button m13 = (Button) findViewById(R.id.button2);
        m13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314SAT.this, AVAILABLE.class));
            }
        });

        Button m14 = (Button) findViewById(R.id.button14);
        m14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314SAT.this, AVAILABLE.class));
            }
        });

        Button m15 = (Button) findViewById(R.id.button15);
        m15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314SAT.this, MAIN.class));
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.room314_sat, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_room314_sat, container, false);
            return rootView;
        }
    }
}
