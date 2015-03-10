package itas274.subway;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void randomize (View view){
        int min = 0;
        int max = 99;
        Random r = new Random();
        int[] arrayOne = new int[15];


        arrayOne[0] = r.nextInt(max-min)+min;
        arrayOne[1] = r.nextInt(max-min)+min;
        arrayOne[2] = r.nextInt(max-min)+min;
        arrayOne[3] = r.nextInt(max-min)+min;
        arrayOne[4] = r.nextInt(max-min)+min;
        arrayOne[5] = r.nextInt(max-min)+min;
        arrayOne[6] = r.nextInt(max-min)+min;
        arrayOne[7] = r.nextInt(max-min)+min;
        arrayOne[8] = r.nextInt(max-min)+min;
        arrayOne[9] = r.nextInt(max-min)+min;
        arrayOne[10] = r.nextInt(max-min)+min;
        arrayOne[11] = r.nextInt(max-min)+min;
        arrayOne[12] = r.nextInt(max-min)+min;
        arrayOne[13] = r.nextInt(max-min)+min;
        arrayOne[14] = r.nextInt(max-min)+min;



        String testTotal = "The Random Number is " + arrayOne[1];
        for (int i=0; i<arrayOne.length; i++) {
            String test = "\nThe Next Random Number is " + arrayOne[i];
            testTotal += test;
        }
        TextView textView = (TextView)findViewById(R.id.randomSub);
        textView.setText(testTotal);

    }
}
