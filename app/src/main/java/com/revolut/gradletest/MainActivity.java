package com.revolut.gradletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.flutterwave.raveandroid.RavePayManager;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.imageView);
        Picasso.get().
                load("http://cdn.journaldev.com/wp-content/uploads/2016/11/android-image-picker-project-structure.png")
                .into(image);

        new RavePayManager(this).setAmount(20.0)
                .setCountry("NGN")
                .setCurrency("NG")
                .setEmail("test@flutterwave.com")
                .setfName("Test")
                .setlName("Flutterwave")
                .setPublicKey("")
                .setEncryptionKey("")
                .setTxRef("A sample test")
                .acceptCardPayments(true)
                .initialize();
    }
}
