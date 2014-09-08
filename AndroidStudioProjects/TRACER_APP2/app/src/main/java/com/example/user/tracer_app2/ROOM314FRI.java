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


public class ROOM314FRI extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_room314_fri);

        Button l1 = (Button) findViewById(R.id.button);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314FRI.this, AVAILABLE.class));
            }
        });

        Button l2 = (Button) findViewById(R.id.button3);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314FRI.this, AVAILABLE.class));
            }
        });

        Button l3 = (Button) findViewById(R.id.button4);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314FRI.this, AVAILABLE.class));
            }
        });

        Button l4 = (Button) findViewById(R.id.button5);
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314FRI.this, AVAILABLE.class));
            }
        });

        Button l5 = (Button) findViewById(R.id.button6);
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314FRI.this, ROOM314FRISCHED1.class));
            }
        });

        Button l6 = (Button) findViewById(R.id.button7);
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314FRI.this, ROOM314FRISCHED2.class));
            }
        });

        Button l7 = (Button) findViewById(R.id.button8);
        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314FRI.this, ROOM314FRISCHED3.class));
            }
        });

        Button l8 = (Button) findViewById(R.id.button9);
        l8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314FRI.this, ROOM314FRISCHED4.class));
            }
        });

        Button l9 = (Button) findViewById(R.id.button10);
        l9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314FRI.this, ROOM314FRISCHED5.class));
            }
        });

        Button l10 = (Button) findViewById(R.id.button11);
        l10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314FRI.this, AVAILABLE.class));
            }
        });

        Button l11 = (Button) findViewById(R.id.button12);
        l11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314FRI.this, ROOM314FRISCHED6.class));
            }
        });

        Button l12 = (Button) findViewById(R.id.button13);
        l12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314FRI.this, ROOM314FRISCHED7.class));
            }
        });

        Button l13 = (Button) findViewById(R.id.button2);
        l13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314FRI.this, AVAILABLE.class));
            }
        });

        Button l14 = (Button) findViewById(R.id.button14);
        l14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314FRI.this, AVAILABLE.class));
            }
        });

        Button l15 = (Button) findViewById(R.id.button15);
        l15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314FRI.this, MAIN.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.room314_fri, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_room314_fri, container, false);
            return rootView;
        }
    }
}
