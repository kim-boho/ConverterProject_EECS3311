package view;

import java.awt.Color;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class FeetConversionArea extends JTextArea{
	private static final FeetConversionArea feetBox = new FeetConversionArea();
	public void initialSetting() {
		//initial setting
		feetBox.setBounds(99, 2, 200, 200);
		feetBox.setBackground(Color.green);
		feetBox.setText("0 ft");
		feetBox.setEditable(false);
	}
	public FeetConversionArea getFeetBox() {
		return feetBox;
	}
}
