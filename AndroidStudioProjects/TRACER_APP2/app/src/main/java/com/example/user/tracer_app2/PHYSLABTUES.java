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


public class PHYSLABTUES extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_physlabtue);

        Button d1 = (Button) findViewById(R.id.button);
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTUES.this, AVAILABLE.class));
            }
        });

        Button d2 = (Button) findViewById(R.id.button3);
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTUES.this, AVAILABLE.class));
            }
        });

        Button d3 = (Button) findViewById(R.id.button4);
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTUES.this, AVAILABLE.class));
            }
        });

        Button d4 = (Button) findViewById(R.id.button5);
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTUES.this, PHYSLABTUESSCHED1.class));
            }
        });

        Button d5 = (Button) findViewById(R.id.button6);
        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTUES.this, PHYSLABTUESSCHED2.class));
            }
        });

        Button d6 = (Button) findViewById(R.id.button7);
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTUES.this, PHYSLABTUESSCHED3.class));
            }
        });

        Button d7 = (Button) findViewById(R.id.button8);
        d7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTUES.this, AVAILABLE.class));
            }
        });

        Button d8 = (Button) findViewById(R.id.button9);
        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTUES.this, AVAILABLE.class));
            }
        });

        Button d9 = (Button) findViewById(R.id.button10);
        d9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTUES.this,AVAILABLE.class));
            }
        });

        Button d10 = (Button) findViewById(R.id.button11);
        d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTUES.this, AVAILABLE.class));
            }
        });

        Button d11 = (Button) findViewById(R.id.button12);
        d11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTUES.this, AVAILABLE.class));
            }
        });

        Button d12 = (Button) findViewById(R.id.button13);
        d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTUES.this, AVAILABLE.class));
            }
        });

        Button d13 = (Button) findViewById(R.id.button2);
        d13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTUES.this, AVAILABLE.class));
            }
        });

        Button d14 = (Button) findViewById(R.id.button14);
        d14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTUES.this, AVAILABLE.class));
            }
        });

        Button d15 = (Button) findViewById(R.id.button15);
        d15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLABTUES.this, MAIN.class));
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.physlabtue, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_physlabtue, container, false);
            return rootView;
        }
    }
}
