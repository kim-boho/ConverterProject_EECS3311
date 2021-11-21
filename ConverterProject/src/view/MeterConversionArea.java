package view;

import java.awt.Color;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MeterConversionArea extends JTextArea{
	private static final MeterConversionArea meterBox = new MeterConversionArea();
	public void initialSetting() {
		//initial setting
		meterBox.setBounds(301, 2, 200, 200);
		meterBox.setBackground(Color.orange);
		meterBox.setText("0 m");
		meterBox.setEditable(false);
	}
	public MeterConversionArea getMeterBox() {
		return meterBox;
	}
}
