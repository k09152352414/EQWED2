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


public class ICSL1THURS extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_icsl1_mon);

        Button q1 = (Button) findViewById(R.id.button);
        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1THURS.this, AVAILABLE.class));
            }
        });

        Button q2 = (Button) findViewById(R.id.button3);
        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1THURS.this, AVAILABLE.class));
            }
        });

        Button q3 = (Button) findViewById(R.id.button4);
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1THURS.this, ICSL1THURSSCHED1.class));
            }
        });

        Button q4 = (Button) findViewById(R.id.button5);
        q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1THURS.this, ICSL1THURSSCHED2.class));
            }
        });

        Button q5 = (Button) findViewById(R.id.button6);
        q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1THURS.this, ICSL1THURSSCHED3.class));
            }
        });

        Button q6 = (Button) findViewById(R.id.button7);
        q6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1THURS.this, AVAILABLE.class));
            }
        });

        Button q7 = (Button) findViewById(R.id.button8);
        q7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1THURS.this, AVAILABLE.class));
            }
        });

        Button q8 = (Button) findViewById(R.id.button9);
        q8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1THURS.this, AVAILABLE.class));
            }
        });

        Button q9 = (Button) findViewById(R.id.button10);
        q9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1THURS.this, AVAILABLE.class));
            }
        });

        Button q10 = (Button) findViewById(R.id.button11);
        q10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1THURS.this, AVAILABLE.class));
            }
        });

        Button q11 = (Button) findViewById(R.id.button12);
        q11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1THURS.this, AVAILABLE.class));
            }
        });

        Button q12 = (Button) findViewById(R.id.button13);
        q12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1THURS.this, AVAILABLE.class));
            }
        });

        Button q13 = (Button) findViewById(R.id.button16);
        q13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1THURS.this, AVAILABLE.class));
            }
        });

        Button q14 = (Button) findViewById(R.id.button14);
        q14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1THURS.this, AVAILABLE.class));
            }
        });

        Button q15 = (Button) findViewById(R.id.button15);
        q15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1THURS.this, MAIN.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.icsl1_thur, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_icsl1_thur, container, false);
            return rootView;
        }
    }
}
