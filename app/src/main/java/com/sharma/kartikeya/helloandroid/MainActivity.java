package com.sharma.kartikeya.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_text_color).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Kartikeya", "Change Text Color Button Clicked");
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.text));
            }
        });

        findViewById(R.id.button_view_color).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Kartikeya", "Change View Color Button Clicked");
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorAccent));
            }
        });

        findViewById(R.id.button_text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Grab text that user inputs
                String userText = ((EditText)findViewById(R.id.editText)).getText().toString();

                if (TextUtils.isEmpty(userText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Hello Android!");
                } else {
                    ((TextView) findViewById(R.id.textView)).setText(userText);
                }
                // Put the text into our text view once the 'change text' button is clicked
                Log.i("Kartikeya", "Change Text Button Clicked");
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimaryDark));
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorPrimary));
                ((TextView) findViewById(R.id.textView)).setText("Hello Android!");
            }
        });

    }
}
