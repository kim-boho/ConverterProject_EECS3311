package model.observer;

import model.ValueToConvert;
import model.command.Command;

public abstract class Observer {
	protected ValueToConvert model;
	protected Command cmd;
	public abstract void update(double value);
}
