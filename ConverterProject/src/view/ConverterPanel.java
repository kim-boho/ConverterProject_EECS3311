package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import model.ValueToConvert;

@SuppressWarnings("serial")
public class ConverterPanel extends JPanel{
	
	private CentimetersConversionArea centiBox;
	private FeetConversionArea feetBox;
	private MeterConversionArea meterBox;
	
	public ConverterPanel() {
		super(null);
		super.setBackground(Color.white);
		centiBox = new CentimetersConversionArea();
		meterBox = new MeterConversionArea();
		feetBox = new FeetConversionArea();
		add(centiBox);
		add(meterBox);
		add(feetBox);
		setVisible(true);
	}
	
	public CentimetersConversionArea getCentiBox() {
		return centiBox;
	}
}
