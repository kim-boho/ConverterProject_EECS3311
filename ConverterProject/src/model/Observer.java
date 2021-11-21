package model;

public abstract class Observer {
	protected ValueToConvert model;
	protected Command cmd;
	public abstract void update(double value);
}
