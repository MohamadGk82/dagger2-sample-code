package com.example.dagger2.di;

import com.example.dagger2.MainActivity;

import dagger.Component;

@Component(modules = StorageModule.class)
public interface StorageComponent {

    void injectStorage(MainActivity mainActivity);

}
