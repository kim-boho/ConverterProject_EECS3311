package model.command;

/**
 * This interface is implemented by specific command classes to receive commands.
 * @author Boho Kim
 * 
 */
public interface Command {
	
	/**
	 * This method receives value and set it on panel.
	 * @param value
	 * @pre value >= 0
	 */
	public void setValue(double value);
}
