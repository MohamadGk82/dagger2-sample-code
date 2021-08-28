package com.example.dagger2.di;

import dagger.Module;
import dagger.Provides;

@Module
public class StorageSpaceModule {
    private int spaceStorage;

    public StorageSpaceModule(int spaceStorage) {
        this.spaceStorage = spaceStorage;
    }

    @Provides
    int getSpaceStorage() {
        return spaceStorage;
    }
}
