package model.observer;

import model.command.Command;

/**
 * This abstract class a parent class of specific observer class, and is notified to update a centimeter value.
 * @author Boho Kim
 *
 */
public abstract class Observer {
	protected Command cmd;
	
	/**
	 * This method converts the value and updates it using command class.
	 * @param value centimeter value
	 */
	public abstract void update(double centiValue);
}
