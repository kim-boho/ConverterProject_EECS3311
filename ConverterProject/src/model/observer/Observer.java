package model.observer;

import model.command.Command;

public abstract class Observer {
	protected Command cmd;
	public abstract void update(double value);
}
