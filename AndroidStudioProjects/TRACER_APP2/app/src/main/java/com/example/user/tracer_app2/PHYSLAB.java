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


public class PHYSLAB extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_physlab);

        Button a1 = (Button) findViewById(R.id.button);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLAB.this, PHYSLABMON.class));
            }
        });

        Button a2 = (Button) findViewById(R.id.button2);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLAB.this, PHYSLABTUES.class));
            }
        });

        Button a3 = (Button) findViewById(R.id.button3);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLAB.this, PHYSLABWED.class));
            }
        });

        Button a4 = (Button) findViewById(R.id.button4);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLAB.this, PHYSLABTHURS.class));
            }
        });

        Button a5 = (Button) findViewById(R.id.button5);
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLAB.this, PHYSLABFRI.class));
            }
        });

        Button a6 = (Button) findViewById(R.id.button6);
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLAB.this, PHYSLABSAT.class));
            }
        });

        Button a7 = (Button) findViewById(R.id.button7);
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PHYSLAB.this, MAIN.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.physlab, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_physlab, container, false);
            return rootView;
        }
    }
}
