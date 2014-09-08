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


public class ICSL2TUES extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_icsl2_tue);

        Button v1 = (Button) findViewById(R.id.button);
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2TUES.this, ICSL2TUESRESERVE1.class));
            }
        });

        Button v2 = (Button) findViewById(R.id.button3);
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2TUES.this, AVAILABLE.class));
            }
        });

        Button v3 = (Button) findViewById(R.id.button4);
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2TUES.this, AVAILABLE.class));
            }
        });

        Button v4 = (Button) findViewById(R.id.button5);
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2TUES.this, AVAILABLE.class));
            }
        });

        Button v5 = (Button) findViewById(R.id.button6);
        v5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2TUES.this, ICSL2MONSCHED1.class));
            }
        });

        Button v6 = (Button) findViewById(R.id.button7);
        v6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2TUES.this, ICSL2MONSCHED2.class));
            }
        });

        Button v7 = (Button) findViewById(R.id.button8);
        v7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2TUES.this, ICSL2MONSCHED3.class));
            }
        });

        Button v8 = (Button) findViewById(R.id.button9);
        v8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2TUES.this, ICSL2MONSCHED4.class));
            }
        });

        Button v9 = (Button) findViewById(R.id.button10);
        v9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2TUES.this, ICSL2MONSCHED5.class));
            }
        });

        Button v10 = (Button) findViewById(R.id.button11);
        v10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2TUES.this, ICSL2MONSCHED6.class));
            }
        });

        Button v11 = (Button) findViewById(R.id.button12);
        v11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2TUES.this, AVAILABLE.class));
            }
        });

        Button v12 = (Button) findViewById(R.id.button13);
        v12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2TUES.this, AVAILABLE.class));
            }
        });

        Button v13 = (Button) findViewById(R.id.button16);
        v13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2TUES.this, AVAILABLE.class));
            }
        });

        Button v14 = (Button) findViewById(R.id.button14);
        v14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2TUES.this, AVAILABLE.class));
            }
        });

        Button v15 = (Button) findViewById(R.id.button15);
        v15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ICSL2TUES.this, MAIN.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.icsl2_tue, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_icsl2_tue, container, false);
            return rootView;
        }
    }
}
