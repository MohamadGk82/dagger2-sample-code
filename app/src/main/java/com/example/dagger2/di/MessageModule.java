package com.example.dagger2.di;

import dagger.Module;
import dagger.Provides;

@Module
public class MessageModule {
    private String message;

    public MessageModule(String message) {
        this.message = message;
    }

    @Provides
    String setMessage() {
        return message;
    }
}
