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


public class PHYSLABSAT extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_physlabfri);

        Button h1 = (Button) findViewById(R.id.button);
        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABSAT.this, AVAILABLE.class));
            }
        });

        Button h2 = (Button) findViewById(R.id.button3);
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABSAT.this, AVAILABLE.class));
            }
        });

        Button h3 = (Button) findViewById(R.id.button4);
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABSAT.this, AVAILABLE.class));
            }
        });

        Button h4 = (Button) findViewById(R.id.button5);
        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABSAT.this, AVAILABLE.class));
            }
        });

        Button h5 = (Button) findViewById(R.id.button6);
        h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABSAT.this, AVAILABLE.class));
            }
        });

        Button h6 = (Button) findViewById(R.id.button7);
        h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABSAT.this, AVAILABLE.class));
            }
        });

        Button h7 = (Button) findViewById(R.id.button8);
        h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABSAT.this, AVAILABLE.class));
            }
        });

        Button h8 = (Button) findViewById(R.id.button9);
        h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABSAT.this, AVAILABLE.class));
            }
        });

        Button h9 = (Button) findViewById(R.id.button10);
        h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABSAT.this, AVAILABLE.class));
            }
        });

        Button h10 = (Button) findViewById(R.id.button11);
        h10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABSAT.this, AVAILABLE.class));
            }
        });

        Button h11 = (Button) findViewById(R.id.button12);
        h11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABSAT.this, AVAILABLE.class));
            }
        });

        Button h12 = (Button) findViewById(R.id.button13);
        h12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABSAT.this, AVAILABLE.class));
            }
        });

        Button h13 = (Button) findViewById(R.id.button2);
        h13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABSAT.this, AVAILABLE.class));
            }
        });

        Button h14 = (Button) findViewById(R.id.button14);
        h14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABSAT.this, AVAILABLE.class));
            }
        });

        Button h15 = (Button) findViewById(R.id.button15);
        h15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABSAT.this, MAIN.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.physlabsat, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_physlabsat, container, false);
            return rootView;
        }
    }
}
