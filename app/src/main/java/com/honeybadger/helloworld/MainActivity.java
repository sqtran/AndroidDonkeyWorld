package com.honeybadger.helloworld;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ImageView imageView1;
    private TextView mytext;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    public boolean showDonkey() {
        return new Random().nextBoolean();
     }

    public void addListenerOnButton() {
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        mytext = (TextView) findViewById(R.id.mytext);

        button = (Button) findViewById(R.id.btnWinner);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                mytext.setText(String.format("Donkey clicked it %d times",++counter));

                imageView1.setImageResource(showDonkey() ? R.drawable.donkey : R.drawable.ribbon);

            }
        });
    }
}
