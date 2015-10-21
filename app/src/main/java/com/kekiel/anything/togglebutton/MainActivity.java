package com.kekiel.anything.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 *  Part of the Udacity course "How to create <anything> in Android"
 *  https://www.udacity.com/course/how-to-create-anything-in-android--ud802
 *  Section "How do I use ___ in Android"
 *    -> "User Input Controls"
 *      -> "How do I use a Toggle button in Android?"
 *  Blog: http://www.mkyong.com/android/android-togglebutton-example/
 */
public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton1, toggleButton2;
    private Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerButton();

    }

    private void addListenerButton() {
        toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);
        toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);
        btnDisplay = (Button) findViewById(R.id.btnDisplay);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("toggleButton1 :").append(toggleButton1.getText());
                result.append("\ntoggleButton2 :").append(toggleButton2.getText());

                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
