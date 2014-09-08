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


public class ICSL1TUES extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_icsl1_tue);

        Button p1 = (Button) findViewById(R.id.button);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1TUES.this, AVAILABLE.class));
            }
        });

        Button p2 = (Button) findViewById(R.id.button3);
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1TUES.this, ICSL1MONSCHED1.class));
            }
        });

        Button p3 = (Button) findViewById(R.id.button4);
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1TUES.this, ICSL1MONSCHED2.class));
            }
        });

        Button p4 = (Button) findViewById(R.id.button5);
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1TUES.this, AVAILABLE.class));
            }
        });

        Button p5 = (Button) findViewById(R.id.button6);
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1TUES.this, AVAILABLE.class));
            }
        });

        Button p6 = (Button) findViewById(R.id.button7);
        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1TUES.this, ICSL1TUESSCHED1.class));
            }
        });

        Button p7 = (Button) findViewById(R.id.button8);
        p7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1TUES.this, ICSL1TUESSCHED2.class));
            }
        });

        Button p8 = (Button) findViewById(R.id.button9);
        p8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1TUES.this, AVAILABLE.class));
            }
        });

        Button p9 = (Button) findViewById(R.id.button10);
        p9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1TUES.this, AVAILABLE.class));
            }
        });

        Button p10 = (Button) findViewById(R.id.button11);
        p10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1TUES.this, AVAILABLE.class));
            }
        });

        Button p11 = (Button) findViewById(R.id.button12);
        p11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1TUES.this, AVAILABLE.class));
            }
        });

        Button p12 = (Button) findViewById(R.id.button13);
        p12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1TUES.this, AVAILABLE.class));
            }
        });

        Button p13 = (Button) findViewById(R.id.button16);
        p13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1TUES.this, AVAILABLE.class));
            }
        });

        Button p14 = (Button) findViewById(R.id.button14);
        p14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1TUES.this, AVAILABLE.class));
            }
        });

        Button p15 = (Button) findViewById(R.id.button15);
        p15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1TUES.this, MAIN.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.icsl1_tue, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_icsl1_tue, container, false);
            return rootView;
        }
    }
}
