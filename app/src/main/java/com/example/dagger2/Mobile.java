package com.example.dagger2;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

public class Mobile {
    private Screen screen;
    private Board board;
    private Camera camera;

    @Inject
    public Mobile(Screen screen, Board board, Camera camera) {
        this.screen = screen;
        this.board = board;
        this.camera = camera;
    }

    public void run(Context context) {
        Toast.makeText(context, "mobile is ready", Toast.LENGTH_SHORT).show();
    }

}
