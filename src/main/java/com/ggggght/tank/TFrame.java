package com.ggggght.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TFrame {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setVisible(true);
		f.setSize(300,300);
		f.setResizable(false);
		f.setTitle("tank war");
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
