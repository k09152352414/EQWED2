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


public class PHYSLABTHURS extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_physlabthur);

        Button f1 = (Button) findViewById(R.id.button);
        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTHURS.this, AVAILABLE.class));
            }
        });

        Button f2 = (Button) findViewById(R.id.button3);
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTHURS.this, AVAILABLE.class));
            }
        });

        Button f3 = (Button) findViewById(R.id.button4);
        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTHURS.this, AVAILABLE.class));
            }
        });

        Button f4 = (Button) findViewById(R.id.button5);
        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTHURS.this, AVAILABLE.class));
            }
        });

        Button f5 = (Button) findViewById(R.id.button6);
        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTHURS.this, AVAILABLE.class));
            }
        });

        Button f6 = (Button) findViewById(R.id.button7);
        f6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTHURS.this, AVAILABLE.class));
            }
        });

        Button f7 = (Button) findViewById(R.id.button8);
        f7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTHURS.this, PHYSLABTHURSSCHED1.class));
            }
        });

        Button f8 = (Button) findViewById(R.id.button9);
        f8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTHURS.this, PHYSLABTHURSSCHED2.class));
            }
        });

        Button f9 = (Button) findViewById(R.id.button10);
        f9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTHURS.this, PHYSLABTHURSSCHED3.class));
            }
        });

        Button f10 = (Button) findViewById(R.id.button11);
        f10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTHURS.this, AVAILABLE.class));
            }
        });

        Button f11 = (Button) findViewById(R.id.button12);
        f11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTHURS.this, AVAILABLE.class));
            }
        });

        Button f12 = (Button) findViewById(R.id.button13);
        f12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTHURS.this, AVAILABLE.class));
            }
        });

        Button f13 = (Button) findViewById(R.id.button2);
        f13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTHURS.this, AVAILABLE.class));
            }
        });

        Button f14 = (Button) findViewById(R.id.button14);
        f14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTHURS.this, AVAILABLE.class));
            }
        });

        Button f15 = (Button) findViewById(R.id.button15);
        f15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTHURS.this, MAIN.class));
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
            View rootView = inflater.inflate(R.layout.fragment_physlabthur, container, false);
            return rootView;
        }
    }
}
