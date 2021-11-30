package view;

import java.awt.Color;
import javax.swing.JTextArea;

/**
 * This class is for text area interface to display feet value to user. 
 * @author Boho Kim
 * @invariant feetBox is never null.
 *
 */
@SuppressWarnings("serial")
public class FeetConversionArea extends JTextArea{
	private static final FeetConversionArea feetBox = new FeetConversionArea();
	
	/**
	 * Constructor to set feet text area object initially.
	 */
	public void initialSetting() {
		//initial setting
		feetBox.setBounds(99, 2, 200, 200);
		feetBox.setBackground(Color.green);
		feetBox.setText("0 ft");
		feetBox.setEditable(false);
	}
	
	/**
	 * This method is getter for static feet text area object.
	 * @return FeetConversionArea feet text area.
	 * @post return object is not null.
	 */
	public FeetConversionArea getFeetBox() {
		return feetBox;
	}
}
