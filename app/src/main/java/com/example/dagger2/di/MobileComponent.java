package com.example.dagger2.di;

import com.example.dagger2.MainActivity;
import com.example.dagger2.Mobile;

import dagger.Component;

@Component
public interface MobileComponent {
    Mobile buildMobile();
    void injectActivity(MainActivity mainActivity);
}
