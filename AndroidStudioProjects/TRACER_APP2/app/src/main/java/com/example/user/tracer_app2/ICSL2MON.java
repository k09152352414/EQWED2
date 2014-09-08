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


public class ICSL2MON extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_icsl2_mon);

        Button u1 = (Button) findViewById(R.id.button);
        u1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2MON.this, RESERVED.class));
            }
        });

        Button u2 = (Button) findViewById(R.id.button3);
        u2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2MON.this, AVAILABLE.class));
            }
        });

        Button u3 = (Button) findViewById(R.id.button4);
        u3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2MON.this, AVAILABLE.class));
            }
        });

        Button u4 = (Button) findViewById(R.id.button5);
        u4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2MON.this, AVAILABLE.class));
            }
        });

        Button u5 = (Button) findViewById(R.id.button6);
        u5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2MON.this, ICSL2MONSCHED1.class));
            }
        });

        Button u6 = (Button) findViewById(R.id.button7);
        u6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2MON.this, ICSL2MONSCHED2.class));
            }
        });

        Button u7 = (Button) findViewById(R.id.button8);
        u7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2MON.this, ICSL2MONSCHED3.class));
            }
        });

        Button u8 = (Button) findViewById(R.id.button9);
        u8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2MON.this, ICSL2MONSCHED4.class));
            }
        });

        Button u9 = (Button) findViewById(R.id.button10);
        u9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2MON.this, ICSL2MONSCHED5.class));
            }
        });

        Button u10 = (Button) findViewById(R.id.button11);
        u10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2MON.this, ICSL2MONSCHED6.class));
            }
        });

        Button u11 = (Button) findViewById(R.id.button12);
        u11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2MON.this, AVAILABLE.class));
            }
        });

        Button u12 = (Button) findViewById(R.id.button13);
        u12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2MON.this, AVAILABLE.class));
            }
        });

        Button u13 = (Button) findViewById(R.id.button16);
        u13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2MON.this, AVAILABLE.class));
            }
        });

        Button u14 = (Button) findViewById(R.id.button14);
        u14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2MON.this, AVAILABLE.class));
            }
        });

        Button u15 = (Button) findViewById(R.id.button15);
        u15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2MON.this, MAIN.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.icsl2_mon, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_icsl2_mon, container, false);
            return rootView;
        }
    }
}
