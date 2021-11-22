package model;

import java.util.ArrayList;

import model.observer.Observer;

public class ValueToConvert {
	private Double centiValue;
	private ArrayList<Observer> observers;
	public ValueToConvert() {
		observers = new ArrayList<>();
	}
	public void setValues(double centi) {
		centiValue = centi;
		notyfyAllObservers();
	}
	public void addObserver(Observer o) {
		observers.add(o);
	}
	public void notyfyAllObservers() {
		for(Observer o: observers) {
			o.update(centiValue);
		}
	}
}
