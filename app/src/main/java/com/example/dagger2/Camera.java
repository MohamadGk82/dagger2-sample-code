package com.example.dagger2;

import android.content.Context;
import android.widget.Toast;

public class Camera {

    private Context context;
    private String message;

    public Camera(Context context, String message) {
        this.context = context;
        this.message = message;
    }

    public void open() {
        Toast.makeText(context, "camera is run!" + message, Toast.LENGTH_SHORT).show();
    }

    public void close() {
        Toast.makeText(context, "camera is close!" + message, Toast.LENGTH_SHORT).show();
    }

}
