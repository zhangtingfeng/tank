package com.mashibing.tank;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T {
	public static void main(String[] args) {
		Frame f=new Frame();
		f.setVisible(true);
		f.setSize(800,600);
		f.setResizable(false);
		f.setTitle("tank Title");
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
	}
	

}
