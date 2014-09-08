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


public class PHYSLABFRI extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_physlabfri);

        Button g1 = (Button) findViewById(R.id.button);
        g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABFRI.this, AVAILABLE.class));
            }
        });

        Button g2 = (Button) findViewById(R.id.button3);
        g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABFRI.this, AVAILABLE.class));
            }
        });

        Button g3 = (Button) findViewById(R.id.button4);
        g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABFRI.this, AVAILABLE.class));
            }
        });

        Button g4 = (Button) findViewById(R.id.button5);
        g4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABFRI.this, AVAILABLE.class));
            }
        });

        Button g5 = (Button) findViewById(R.id.button6);
        g5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABFRI.this, AVAILABLE.class));
            }
        });

        Button g6 = (Button) findViewById(R.id.button7);
        g6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABFRI.this, AVAILABLE.class));
            }
        });

        Button g7 = (Button) findViewById(R.id.button8);
        g7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABFRI.this, AVAILABLE.class));
            }
        });

        Button g8 = (Button) findViewById(R.id.button9);
        g8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABFRI.this, PHYSLABFRISCHED1.class));
            }
        });

        Button g9 = (Button) findViewById(R.id.button10);
        g9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABFRI.this, PHYSLABFRISCHED2.class));
            }
        });

        Button g10 = (Button) findViewById(R.id.button11);
        g10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABFRI.this, PHYSLABFRISCHED3.class));
            }
        });

        Button g11 = (Button) findViewById(R.id.button12);
        g11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABFRI.this, AVAILABLE.class));
            }
        });

        Button g12 = (Button) findViewById(R.id.button13);
        g12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABFRI.this, AVAILABLE.class));
            }
        });

        Button g13 = (Button) findViewById(R.id.button2);
        g13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABFRI.this, AVAILABLE.class));
            }
        });

        Button g14 = (Button) findViewById(R.id.button14);
        g14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABFRI.this, AVAILABLE.class));
            }
        });

        Button g15 = (Button) findViewById(R.id.button15);
        g15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABFRI.this, MAIN.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.physlabfri, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_physlabfri, container, false);
            return rootView;
        }
    }
}
