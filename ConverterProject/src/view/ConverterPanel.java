package view;

import java.awt.Color;
import javax.swing.JPanel;

import model.ValueToConvert;
import model.observer.FeetObserver;
import model.observer.MeterObserver;

@SuppressWarnings("serial")
public class ConverterPanel extends JPanel{
	
	private CentimetersConversionArea centiBox;
	private FeetConversionArea feetBox;
	private MeterConversionArea meterBox;
	
	private static ValueToConvert model;
	
	public ConverterPanel() {
		super(null);
		super.setBackground(Color.white);
		model = new ValueToConvert();
		model.addObserver(new FeetObserver(model));
		model.addObserver(new MeterObserver(model));
		centiBox = new CentimetersConversionArea();
		meterBox = new MeterConversionArea().getMeterBox();
		feetBox = new FeetConversionArea().getFeetBox();
		meterBox.initialSetting();
		feetBox.initialSetting();
		add(centiBox);
		add(meterBox);
		add(feetBox);
		setVisible(true);
	}
	
	public CentimetersConversionArea getCentiBox() {
		return centiBox;
	}
	
	public ValueToConvert getValueToConvert() {
		return model;
	}
	
	public FeetConversionArea getFeetBox() {
		return feetBox;
	}
	
	public MeterConversionArea getMeterBox() {
		return meterBox;
	}
}
