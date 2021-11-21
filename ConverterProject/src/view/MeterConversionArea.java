package view;

import java.awt.Color;

import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MeterConversionArea extends JTextArea{
	private static final MeterConversionArea meterBox = new MeterConversionArea();
	public MeterConversionArea() {
		
		//initial setting
		setBounds(301, 2, 200, 200);
		setBackground(Color.orange);
		setText("0 m");
		setEditable(false);
	}
}
