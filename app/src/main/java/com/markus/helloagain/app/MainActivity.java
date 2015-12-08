package com.markus.helloagain.app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Integer temp = 0;
    public Integer temp2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        final TextView firstTextView = (TextView) findViewById(R.id.textView);
        final TextView firstText = (TextView) findViewById(R.id.firstText);

        Button firstButton = (Button) findViewById(R.id.firstButton);
        Button secondButton = (Button) findViewById(R.id.button);
        Button clearButton = (Button) findViewById(R.id.buttonClear);

        firstButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                temp = temp + 1;
                firstTextView.setText(Integer.toString(temp));
            }
        });

        secondButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                temp2 = temp2 + 1;
                firstText.setText("You Clicked " + Integer.toString(temp2) + " times");
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                temp = 0;
                temp2 = 0;
                firstText.setText("Clicks Resettet");
                firstTextView.setText("Clicks Resettet");
            }
        });
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
}
