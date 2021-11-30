package model.command;

import view.MeterConversionArea;

/**
 * This class commands to set value which is changed to meter on meter conversion area in panel.
 * @author Boho Kim
 * 
 */
public class SetMeterCommand implements Command{
	
	/**
	 * {@inheritDoc}
	 * @pre meterValue >= 0.
	 */
	@Override
	public void setValue(double meterValue) {
		// TODO Auto-generated method stub
		MeterConversionArea meterBox = new MeterConversionArea().getMeterBox();
		meterBox.setText(meterValue + " " + "m");
	}

}
