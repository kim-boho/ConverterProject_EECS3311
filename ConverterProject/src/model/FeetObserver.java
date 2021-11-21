package model;

public class FeetObserver extends Observer{
	private double ftValue;
	public FeetObserver(ValueToConvert model) {
		// TODO Auto-generated constructor stub
		super.model = model;
	}
	
	@Override
	public void update(double centiValue) {
		// TODO Auto-generated method stub
		ftValue = centiValue/30.48;
		cmd = new SetFeetCommand();
		cmd.setValue(ftValue);
	}
}
