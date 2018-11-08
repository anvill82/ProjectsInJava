package com.blockbreaker;

import java.awt.*;

public class Block extends Rectangle {

    Image pic;

    public Block(int a, int b, int w, int h, String s) {
        x = a;
        y = b;
        height = h;
        width = w;
    }
}
