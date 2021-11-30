package view;

import java.awt.Color;
import javax.swing.JPanel;

import model.ValueToConvert;
import model.observer.FeetObserver;
import model.observer.MeterObserver;

/**
 * Thic class creates the main panel for user interface.
 * @author Boho Kim
 * @invariant 
 */
@SuppressWarnings("serial")
public class ConverterPanel extends JPanel{
	
	private CentimetersConversionArea centiBox;
	private FeetConversionArea feetBox;
	private MeterConversionArea meterBox;
	
	private static ValueToConvert model;
	
	/**
	 * Constructor to create main panel consisting of text areas for value.
	 */
	public ConverterPanel() {
		super(null);
		super.setBackground(Color.white);
		model = new ValueToConvert();
		model.addObserver(new FeetObserver());
		model.addObserver(new MeterObserver());
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
	
	/**
	 * This method is getter for text area object to receive centimeter value.
	 * @return CentimetersConversionArea text area object to receive centimeter value.
	 */
	public CentimetersConversionArea getCentiBox() {
		return centiBox;
	}
	
	/**
	 *  This method is getter for ValueToConvert object which is main logic part of application.
	 * @return ValueToConvert object.
	 */
	public ValueToConvert getValueToConvert() {
		return model;
	}
	
	/**
	 * This method is getter for text area object to display feet value.
	 * @return FeetConversionArea text area object to display feet value.
	 */
	public FeetConversionArea getFeetBox() {
		return feetBox;
	}
	
	/**
	 * This method is getter for text area object to display meter value.
	 * @return MeterConversionArea text area object to display meter value.
	 */
	public MeterConversionArea getMeterBox() {
		return meterBox;
	}
}
