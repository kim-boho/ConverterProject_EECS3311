package model;

import java.util.ArrayList;

import model.observer.Observer;



/**
 * This class gets centimeter value from view and notifies the value to observer classes.
 * @author Boho Kim
 * 
 */
public class ValueToConvert {
	private Double centiValue;
	private ArrayList<Observer> observers;
	
	/**
	 * Constructor to create object
	 */
	public ValueToConvert() {
		observers = new ArrayList<>();
	}
	
	/**
	 * This method receive centimeter value to convert and notify to observers.
	 * @param centi centimeter value to convert.
	 */
	public void setValues(double centi) {
		centiValue = centi;
		notifyAllObservers();
	}
	
	/**
	 * This method adds observers to observers list.
	 * @param o observer object.
	 */
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	/**
	 * This method notify received value to observers.
	 */
	public void notifyAllObservers() {
		for(Observer o: observers) {
			o.update(centiValue);
		}
	}
	
}
