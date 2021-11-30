package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.ValueToConvert;
import view.ConverterPanel;


/**
 * This class receives keyboard input from user.
 * @author Boho Kim
 * @invariant 
 */
public class MenubarListener implements ActionListener {
	
	private ConverterPanel converterPanel;
	
	/**
	 * Constructor to create object
	 * @param panel is main project panel
	 */
	public MenubarListener(ConverterPanel panel) {
		converterPanel = panel;
	}
	

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("SAVE")) {
			String inputText = converterPanel.getCentiBox().getText();
			try {
				Double.parseDouble(inputText);
			} catch (Exception ex) {
				converterPanel.getCentiBox().setText("");
				JOptionPane.showMessageDialog(null, "Not numeric input. Try again.");
				return;
			}//If the input is not numeric, throw exception.
			
			if (inputText.charAt(0)=='-') {
				converterPanel.getCentiBox().setText("");
				JOptionPane.showMessageDialog(null, "The value is negative. Try again.");
				return;
				//If the input is negative, throw exception.
				
			} else {
				ValueToConvert model = converterPanel.getValueToConvert();
				model.setValues(Double.parseDouble(inputText));
			}
		}
	}
}
