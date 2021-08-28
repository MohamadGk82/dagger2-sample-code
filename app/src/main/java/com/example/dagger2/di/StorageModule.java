package com.example.dagger2.di;

import android.content.Context;

import com.example.dagger2.Storage;

import dagger.Module;
import dagger.Provides;

@Module(includes = {ContextModule.class, StorageSpaceModule.class})
public class StorageModule {

    @Provides
    Storage getStorage(Context context, int spaceStorage) {
        return new Storage(context, spaceStorage);
    }

}
