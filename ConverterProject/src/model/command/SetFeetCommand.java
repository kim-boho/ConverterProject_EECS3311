package model.command;

import view.FeetConversionArea;

/**
 * This class commands to set value which is changed to feet on feet conversion area in panel.
 * @author Boho Kim
 * 
 */
public class SetFeetCommand implements Command{
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setValue(double ftValue) {
		// TODO Auto-generated method stub
		FeetConversionArea feetBox = new FeetConversionArea().getFeetBox();
		feetBox.setText(ftValue + " " + "ft");
	}

}
