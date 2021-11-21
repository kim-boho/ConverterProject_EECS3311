package model;

import view.MeterConversionArea;

public class SetMeterCommand implements Command{
	@Override
	public void setValue(double meterValue) {
		// TODO Auto-generated method stub
		MeterConversionArea meterBox = new MeterConversionArea().getMeterBox();
		meterBox.setText(meterValue + " " + "m");
	}

}
