package view;

import java.awt.Color;
import javax.swing.JTextArea;

/**
 * This class is for text area interface to receive centimeter value from user. 
 * @author Boho Kim
 *
 */
@SuppressWarnings("serial")
public class CentimetersConversionArea extends JTextArea{
	
	/**
	 * Constructor to create text area object.
	 */
	public CentimetersConversionArea() {
		//initial setting
		setBounds(200, 204, 200, 200);
		setBackground(Color.yellow);
		setText("0");
	}
	
}
