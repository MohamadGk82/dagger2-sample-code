package com.example.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2.di.ContextModule;
import com.example.dagger2.di.DaggerStorageComponent;
import com.example.dagger2.di.StorageComponent;
import com.example.dagger2.di.StorageModule;
import com.example.dagger2.di.StorageSpaceModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
//
//    @Inject
//    Mobile mobile;

//    @Inject
//    Camera camera;

    @Inject
    Storage storage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StorageComponent component = DaggerStorageComponent.builder()
                .contextModule(new ContextModule(this))
                .storageSpaceModule(new StorageSpaceModule(15))
                .storageModule(new StorageModule())
                .build();

        component.injectStorage(this);
        storage.showStorageSpace();

//        MobileComponent mobileComponent = DaggerMobileComponent.builder().cameraModule(new CameraModule(this)).build();
//        mobileComponent.injectActivity(this);
//        mobile.run(this);
//        inject value
//        CameraComponent cameraComponent = DaggerCameraComponent.builder()
//                .cameraModule(new CameraModule(this))
//                .messageModule(new MessageModule("ruuuuuun")).build();
//        cameraComponent.injection(this);
//        camera.open();

        /* constructor Injection
        MobileComponent mobileComponent = DaggerMobileComponent.create();
        Mobile mobile = mobileComponent.buildMobile();
        mobile.run(this);
         */
    }
}