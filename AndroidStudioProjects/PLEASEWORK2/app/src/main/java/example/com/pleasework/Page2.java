package example.com.pleasework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Page2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_page2);

        Button yourButton = (Button) findViewById(R.id.im1);
        yourButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Page2.this, Page3a.class));
            }
        });

        Button yourButton1 = (Button) findViewById(R.id.im2);
        yourButton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Page2.this, Page3b.class));
            }
        });

        Button yourButton2 = (Button) findViewById(R.id.im3);
        yourButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Page2.this, Page3c.class));
            }
        });

        Button yourButton3 = (Button) findViewById(R.id.im4);
        yourButton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Page2.this, Page3d.class));
            }
        });

        Button yourButton4 = (Button) findViewById(R.id.im5);
        yourButton4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Page2.this, Pagee.class));
            }
        });

        Button yourButton5 = (Button) findViewById(R.id.im6);
        yourButton5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Page2.this, Pagef.class));
            }
        });

        Button yourButton6 = (Button) findViewById(R.id.im7);
        yourButton6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Page2.this, Pageg.class));
            }
        });

        Button yourButton7 = (Button) findViewById(R.id.im8);
        yourButton7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Page2.this, Pageh.class));
            }
        });

        Button yourButton8 = (Button) findViewById(R.id.im9);
        yourButton8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Page2.this, Main.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.page2, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_page2, container, false);
            return rootView;
        }
    }
}
