package model;

public class MeterObserver extends Observer{
	private double meterValue;
	public MeterObserver(ValueToConvert model) {
		// TODO Auto-generated constructor stub
		super.model = model;
	}
	
	@Override
	public void update(double centiValue) {
		// TODO Auto-generated method stub
		meterValue = centiValue/100;
		cmd = new SetMeterCommand();
		cmd.setValue(meterValue);
	}

}
