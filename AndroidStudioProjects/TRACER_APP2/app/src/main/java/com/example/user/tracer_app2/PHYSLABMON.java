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


public class PHYSLABMON extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_physlabmon);

        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABMON.this, AVAILABLE.class));
            }
        });

        Button b1 = (Button) findViewById(R.id.button3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABMON.this, AVAILABLE.class));
            }
        });

        Button b2 = (Button) findViewById(R.id.button4);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABMON.this, AVAILABLE.class));
            }
        });

        Button b3 = (Button) findViewById(R.id.button5);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABMON.this, AVAILABLE.class));
            }
        });

        Button b4 = (Button) findViewById(R.id.button6);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABMON.this, AVAILABLE.class));
            }
        });

        Button b5 = (Button) findViewById(R.id.button7);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABMON.this, AVAILABLE.class));
            }
        });

        Button b6 = (Button) findViewById(R.id.button8);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABMON.this, AVAILABLE.class));
            }
        });

        Button b7 = (Button) findViewById(R.id.button9);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABMON.this, AVAILABLE.class));
            }
        });

        Button b8 = (Button) findViewById(R.id.button10);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABMON.this, AVAILABLE.class));
            }
        });

        Button b9 = (Button) findViewById(R.id.button11);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABMON.this, AVAILABLE.class));
            }
        });

        Button b10 = (Button) findViewById(R.id.button12);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABMON.this, AVAILABLE.class));
            }
        });

        Button b11 = (Button) findViewById(R.id.button13);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABMON.this, AVAILABLE.class));
            }
        });

        Button b12 = (Button) findViewById(R.id.button2);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABMON.this, AVAILABLE.class));
            }
        });

        Button b13 = (Button) findViewById(R.id.button14);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABMON.this, AVAILABLE.class));
            }
        });

        Button b14 = (Button) findViewById(R.id.button15);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABMON.this, MAIN.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.physlabmon, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_physlabmon, container, false);
            return rootView;
        }
    }
}
