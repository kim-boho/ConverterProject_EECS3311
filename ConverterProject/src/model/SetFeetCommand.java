package model;

import view.FeetConversionArea;

public class SetFeetCommand implements Command{
	@Override
	public void setValue(double ftValue) {
		// TODO Auto-generated method stub
		FeetConversionArea feetBox = new FeetConversionArea().getFeetBox();
		feetBox.setText(ftValue + " " + "ft");
	}

}
