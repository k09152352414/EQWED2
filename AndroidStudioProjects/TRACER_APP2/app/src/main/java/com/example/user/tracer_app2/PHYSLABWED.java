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


public class PHYSLABWED extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_physlabwed);

        Button e1 = (Button) findViewById(R.id.button);
        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABWED.this, AVAILABLE.class));
            }
        });

        Button e2 = (Button) findViewById(R.id.button3);
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABWED.this, AVAILABLE.class));
            }
        });

        Button e3 = (Button) findViewById(R.id.button4);
        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABWED.this, AVAILABLE.class));
            }
        });

        Button e4 = (Button) findViewById(R.id.button5);
        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABWED.this, PHYSLABWEDSCHED1.class));
            }
        });

        Button e5 = (Button) findViewById(R.id.button6);
        e5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABWED.this, PHYSLABWEDSCHED2.class));
            }
        });

        Button e6 = (Button) findViewById(R.id.button7);
        e6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABWED.this, PHYSLABWEDSCHED3.class));
            }
        });

        Button e7 = (Button) findViewById(R.id.button8);
        e7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABWED.this, AVAILABLE.class));
            }
        });

        Button e8 = (Button) findViewById(R.id.button9);
        e8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABWED.this, AVAILABLE.class));
            }
        });

        Button e9 = (Button) findViewById(R.id.button10);
        e9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABWED.this,AVAILABLE.class));
            }
        });

        Button e10 = (Button) findViewById(R.id.button11);
        e10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABWED.this, AVAILABLE.class));
            }
        });

        Button e11 = (Button) findViewById(R.id.button12);
        e11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABWED.this, AVAILABLE.class));
            }
        });

        Button e12 = (Button) findViewById(R.id.button13);
        e12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABWED.this, AVAILABLE.class));
            }
        });

        Button e13 = (Button) findViewById(R.id.button2);
        e13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABWED.this, AVAILABLE.class));
            }
        });

        Button e14 = (Button) findViewById(R.id.button14);
        e14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABWED.this, AVAILABLE.class));
            }
        });

        Button e15 = (Button) findViewById(R.id.button15);
        e15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABWED.this, MAIN.class));
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.physlabwed, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_physlabwed, container, false);
            return rootView;
        }
    }
}
