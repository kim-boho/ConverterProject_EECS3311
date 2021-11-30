package model.observer;

import model.command.SetFeetCommand;

/**
 * This class observes centimeter value and, when it is updated, commands to set the changed feet value.
 * @author Boho Kim
 * @invariant ftValue >= 0.
 */
public class FeetObserver extends Observer{
	private double ftValue;
	
	/**
	 * {@inheritDoc}
	 * @pre centiValue >= 0.
	 */
	@Override
	public void update(double centiValue) {
		// TODO Auto-generated method stub
		ftValue = centiValue/30.48;
		cmd = new SetFeetCommand();
		cmd.setValue(ftValue);
	}
}
