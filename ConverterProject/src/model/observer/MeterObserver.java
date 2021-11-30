package model.observer;

import model.command.SetMeterCommand;

/**
 * This class observes centimeter value and, when it is updated, commands to set the changed value meter value.
 * @author Boho Kim
 * @invariant meterValue >= 0.
 *
 */
public class MeterObserver extends Observer{
	private double meterValue;
	
	/**
	 * {@inheritDoc}
	 * @pre centiValue >= 0.
	 */
	@Override
	public void update(double centiValue) {
		// TODO Auto-generated method stub
		meterValue = centiValue/100;
		cmd = new SetMeterCommand();
		cmd.setValue(meterValue);
	}

}
