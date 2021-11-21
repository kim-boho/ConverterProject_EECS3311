package view;

import java.awt.Color;

import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class FeetConversionArea extends JTextArea{
	private static final FeetConversionArea feetBox = new FeetConversionArea();
	public FeetConversionArea() {
		
		//initial setting
		setBounds(99, 2, 200, 200);
		setBackground(Color.green);
		setText("0 ft");
		setEditable(false);
	}
}
