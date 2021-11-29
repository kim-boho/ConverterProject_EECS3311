package view;

import java.awt.Color;
import javax.swing.JTextArea;

/**
 * This class is for text area interface to display meter value to user. 
 * @author Boho Kim
 *
 */
@SuppressWarnings("serial")
public class MeterConversionArea extends JTextArea{
	private static final MeterConversionArea meterBox = new MeterConversionArea();
	
	/**
	 * Constructor to set meter text area object initially.
	 */
	public void initialSetting() {
		//initial setting
		meterBox.setBounds(301, 2, 200, 200);
		meterBox.setBackground(Color.orange);
		meterBox.setText("0 m");
		meterBox.setEditable(false);
	}
	
	/**
	 * This method is getter for static meter text area object.
	 * @return MeterConversionArea meter text area.
	 */
	public MeterConversionArea getMeterBox() {
		return meterBox;
	}
}
