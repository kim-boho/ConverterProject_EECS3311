package model.observer;

import model.command.SetMeterCommand;

/**
 * This class observes centimeter value and, when it is updated, commands to set the changed value meter value.
 * @author Boho Kim
 *
 */
public class MeterObserver extends Observer{
	private double meterValue;
	
	@Override
	public void update(double centiValue) {
		// TODO Auto-generated method stub
		meterValue = centiValue/100;
		cmd = new SetMeterCommand();
		cmd.setValue(meterValue);
	}

}
