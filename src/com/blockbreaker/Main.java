package com.blockbreaker;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Block Breaker");

        BlockBreakerPanel panel = new BlockBreakerPanel();

        frame.getContentPane().add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280,800);
        frame.setVisible(true);;
    }
}
