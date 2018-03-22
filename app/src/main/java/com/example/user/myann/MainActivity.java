package com.example.user.myann;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickTry(View view) {
        Intent intent = new Intent(this, IntentActivity.class);
        startActivity(intent);
    }

    public void onClickTry1(View view) {
        moveTaskToBack(true);
        finish();;
        System.exit(0);

    }




}
