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


public class ICSL1SAT extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_icsl1_sat);

        Button s1 = (Button) findViewById(R.id.button);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1SAT.this, AVAILABLE.class));
            }
        });

        Button s2 = (Button) findViewById(R.id.button3);
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1SAT.this, ICSL1SATSCHED1.class));
            }
        });

        Button s3 = (Button) findViewById(R.id.button4);
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1SAT.this, AVAILABLE.class));
            }
        });

        Button s4 = (Button) findViewById(R.id.button5);
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1SAT.this, AVAILABLE.class));
            }
        });

        Button s5 = (Button) findViewById(R.id.button6);
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1SAT.this, AVAILABLE.class));
            }
        });

        Button s6 = (Button) findViewById(R.id.button7);
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1SAT.this, AVAILABLE.class));
            }
        });

        Button s7 = (Button) findViewById(R.id.button8);
        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1SAT.this, ICSL1SATSCHED2.class));
            }
        });

        Button s8 = (Button) findViewById(R.id.button9);
        s8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1SAT.this, AVAILABLE.class));
            }
        });

        Button s9 = (Button) findViewById(R.id.button10);
        s9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1SAT.this, AVAILABLE.class));
            }
        });

        Button s10 = (Button) findViewById(R.id.button11);
        s10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1SAT.this, AVAILABLE.class));
            }
        });

        Button s11 = (Button) findViewById(R.id.button12);
        s11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1SAT.this, ICSL1SATSCHED3.class));
            }
        });

        Button s12 = (Button) findViewById(R.id.button13);
        s12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1SAT.this, ICSL1SATSCHED4.class));
        }
        });

        Button s13 = (Button) findViewById(R.id.button16);
        s13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1SAT.this, ICSL1SATSCHED5.class));
            }
        });

        Button s14 = (Button) findViewById(R.id.button14);
        s14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1SAT.this, ICSL1SATSCHED6.class));
            }
        });

        Button s15 = (Button) findViewById(R.id.button15);
        s15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1SAT.this, MAIN.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.icsl1_sat, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_icsl1_sat, container, false);
            return rootView;
        }
    }
}
