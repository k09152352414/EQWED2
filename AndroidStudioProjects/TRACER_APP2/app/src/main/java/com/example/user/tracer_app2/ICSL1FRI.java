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


public class ICSL1FRI extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_icsl1_fri);

        Button r1 = (Button) findViewById(R.id.button);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1FRI.this, AVAILABLE.class));
            }
        });

        Button r2 = (Button) findViewById(R.id.button3);
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1FRI.this, AVAILABLE.class));
            }
        });

        Button r3 = (Button) findViewById(R.id.button4);
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1FRI.this, AVAILABLE.class));
            }
        });

        Button r4 = (Button) findViewById(R.id.button5);
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1FRI.this, AVAILABLE.class));
            }
        });

        Button r5 = (Button) findViewById(R.id.button6);
        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1FRI.this, AVAILABLE.class));
            }
        });

        Button r6 = (Button) findViewById(R.id.button7);
        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1FRI.this, AVAILABLE.class));
            }
        });

        Button r7 = (Button) findViewById(R.id.button8);
        r7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1FRI.this, ICSL1FRISCHED1.class));
            }
        });

        Button r8 = (Button) findViewById(R.id.button9);
        r8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1FRI.this, ICSL1FRISCHED2.class));
            }
        });

        Button r9 = (Button) findViewById(R.id.button10);
        r9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1FRI.this, AVAILABLE.class));
            }
        });

        Button r10 = (Button) findViewById(R.id.button11);
        r10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1FRI.this, AVAILABLE.class));
            }
        });

        Button r11 = (Button) findViewById(R.id.button12);
        r11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1FRI.this, AVAILABLE.class));
            }
        });

        Button r12 = (Button) findViewById(R.id.button13);
        r12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1FRI.this, AVAILABLE.class));
            }
        });

        Button r13 = (Button) findViewById(R.id.button16);
        r13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1FRI.this, AVAILABLE.class));
            }
        });

        Button r14 = (Button) findViewById(R.id.button14);
        r14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1FRI.this, AVAILABLE.class));
            }
        });

        Button r15 = (Button) findViewById(R.id.button15);
        r15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL1FRI.this, MAIN.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.icsl1_fri, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_icsl1_fri, container, false);
            return rootView;
        }
    }
}
