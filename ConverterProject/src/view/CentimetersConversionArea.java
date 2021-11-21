package view;

import java.awt.Color;

import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class CentimetersConversionArea extends JTextArea{
	private static final CentimetersConversionArea centiBox = new CentimetersConversionArea();
	public CentimetersConversionArea() {
		
		//initial setting
		setBounds(200, 204, 200, 200);
		setBackground(Color.yellow);
		setText("0");
	}
}
