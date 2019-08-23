package com.example.android.cookies;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        ImageView cookieView = (ImageView) findViewById(R.id.android_cookie_image_view);
        cookieView.setImageResource(R.drawable.after_cookie);
        TextView statusView = (TextView) findViewById(R.id.status_text_view);
        statusView.setText("I'm so full");
    }

    /**
     * Called when the cookie should be given.
     */
    public void giveCookie(View view) {
        ImageView cookieView = (ImageView) findViewById(R.id.android_cookie_image_view);
        cookieView.setImageResource(R.drawable.before_cookie);
        TextView statusView = (TextView) findViewById(R.id.status_text_view);
        statusView.setText("I'm so hungry");
    }
}
