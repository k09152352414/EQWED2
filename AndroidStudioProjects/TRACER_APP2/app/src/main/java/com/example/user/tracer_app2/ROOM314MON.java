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


public class ROOM314MON extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_room314_mon);

        Button i1 = (Button) findViewById(R.id.button);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314MON.this, ROOM314MONSCHED1.class));
            }
        });

        Button i2 = (Button) findViewById(R.id.button3);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314MON.this, ROOM314MONSCHED2.class));
            }
        });

        Button i3 = (Button) findViewById(R.id.button4);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314MON.this, ROOM314MONSCHED3.class));
            }
        });

        Button i4 = (Button) findViewById(R.id.button5);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314MON.this, ROOM314MONSCHED4.class));
            }
        });

        Button i5 = (Button) findViewById(R.id.button6);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314MON.this, ROOM314MONSCHED5.class));
            }
        });

        Button i6 = (Button) findViewById(R.id.button7);
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314MON.this, ROOM314MONSCHED6.class));
            }
        });

        Button i7 = (Button) findViewById(R.id.button8);
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314MON.this, ROOM314MONSCHED7.class));
            }
        });

        Button i8 = (Button) findViewById(R.id.button9);
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314MON.this, ROOM314MONSCHED8.class));
            }
        });

        Button i9 = (Button) findViewById(R.id.button10);
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314MON.this, ROOM314MONSCHED9.class));
            }
        });

        Button i10 = (Button) findViewById(R.id.button11);
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314MON.this, ROOM314MONSCHED10.class));
            }
        });

        Button i11 = (Button) findViewById(R.id.button12);
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314MON.this, AVAILABLE.class));
            }
        });

        Button i12 = (Button) findViewById(R.id.button13);
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314MON.this, AVAILABLE.class));
            }
        });

        Button i13 = (Button) findViewById(R.id.button16);
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314MON.this, AVAILABLE.class));
            }
        });

        Button i14 = (Button) findViewById(R.id.button14);
        i14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314MON.this, AVAILABLE.class));
            }
        });

        Button i15 = (Button) findViewById(R.id.button15);
        i15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ROOM314MON.this, MAIN.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.room314_mon, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_room314_mon, container, false);
            return rootView;
        }
    }
}
