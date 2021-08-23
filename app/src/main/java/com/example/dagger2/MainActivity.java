package com.example.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2.di.DaggerMobileComponent;
import com.example.dagger2.di.MobileComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        

        /* constructor Injection
        MobileComponent mobileComponent = DaggerMobileComponent.create();
        Mobile mobile = mobileComponent.buildMobile();
        mobile.run(this);
         */
    }
}