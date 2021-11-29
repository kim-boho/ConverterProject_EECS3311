package model.observer;

import model.command.SetFeetCommand;

/**
 * This class observes centimeter value and, when it is updated, commands to set the changed feet value.
 * @author Boho Kim
 * 
 */
public class FeetObserver extends Observer{
	private double ftValue;
	
	
	@Override
	public void update(double centiValue) {
		// TODO Auto-generated method stub
		ftValue = centiValue/30.48;
		cmd = new SetFeetCommand();
		cmd.setValue(ftValue);
	}
}
