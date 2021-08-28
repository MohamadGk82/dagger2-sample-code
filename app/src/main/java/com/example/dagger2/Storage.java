package com.example.dagger2;

import android.content.Context;
import android.widget.Toast;

public class Storage {
    private Context context;
    private int space;

    public Storage(Context context, int space) {
        this.context = context;
        this.space = space;
    }

    public void showStorageSpace() {
        Toast.makeText(context, space + " Gigabyte", Toast.LENGTH_SHORT).show();
    }
}
