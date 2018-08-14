package com.example.dell.todo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button click=(Button)findViewById(R.id.button2);
        click.setOnClickListener(
                new  Button.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(MainActivity.this,
                                TodoPage.class);
                        startActivity(myIntent);
                    }
                }
        );

    }
}
