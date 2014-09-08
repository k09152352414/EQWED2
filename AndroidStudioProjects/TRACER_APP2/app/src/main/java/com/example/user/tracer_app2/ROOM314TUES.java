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


public class ROOM314TUES extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_room314_tue);

        Button j1 = (Button) findViewById(R.id.button);
        j1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314TUES.this, AVAILABLE.class));
            }
        });

        Button j2 = (Button) findViewById(R.id.button3);
        j2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314TUES.this, AVAILABLE.class));
            }
        });

        Button j3 = (Button) findViewById(R.id.button4);
        j3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314TUES.this, ROOM314TUESSCHED1.class));
            }
        });

        Button j4 = (Button) findViewById(R.id.button5);
        j4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314TUES.this, AVAILABLE.class));
            }
        });

        Button j5 = (Button) findViewById(R.id.button6);
        j5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314TUES.this, AVAILABLE.class));
            }
        });

        Button j6 = (Button) findViewById(R.id.button7);
        j6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314TUES.this, AVAILABLE.class));
            }
        });

        Button j7 = (Button) findViewById(R.id.button8);
        j7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314TUES.this, ROOM314TUESSCHED2.class));
            }
        });

        Button j8 = (Button) findViewById(R.id.button9);
        j8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314TUES.this, ROOM314TUESSCHED3.class));
            }
        });

        Button j9 = (Button) findViewById(R.id.button10);
        j9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314TUES.this, ROOM314TUESSCHED4.class));
            }
        });

        Button j10 = (Button) findViewById(R.id.button11);
        j10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314TUES.this, ROOM314TUESSCHED5.class));
            }
        });

        Button j11 = (Button) findViewById(R.id.button12);
        j11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314TUES.this, AVAILABLE.class));
            }
        });

        Button j12 = (Button) findViewById(R.id.button13);
        j12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314TUES.this, AVAILABLE.class));
            }
        });

        Button j13 = (Button) findViewById(R.id.button2);
        j13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314TUES.this, AVAILABLE.class));
            }
        });

        Button j14 = (Button) findViewById(R.id.button14);
        j14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314TUES.this, AVAILABLE.class));
            }
        });

        Button j15 = (Button) findViewById(R.id.button15);
        j15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314TUES.this, MAIN.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.room314_tue, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_room314_tue, container, false);
            return rootView;
        }
    }
}
