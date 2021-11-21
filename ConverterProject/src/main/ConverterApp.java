package main;

import javax.swing.JFrame;
import controller.MenubarListener;
import view.ConverterMenuBar;
import view.ConverterPanel;


public class ConverterApp {
	public static void main(String[] args) {
		JFrame converterFrame = new JFrame("Converter");
		ConverterPanel converterPanel = new ConverterPanel();
		MenubarListener menubarListener = new MenubarListener(converterPanel);
		ConverterMenuBar converterMenuBar = new ConverterMenuBar(menubarListener);
		converterFrame.add(converterPanel);
		converterFrame.setJMenuBar(converterMenuBar);
		converterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		converterFrame.setSize(600, 600);
		converterFrame.setLocationRelativeTo(null);
		converterFrame.setResizable(false);
		converterFrame.setVisible(true);
	}
}
