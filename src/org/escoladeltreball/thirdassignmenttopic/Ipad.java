/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw39397876
 *
 */
public class Ipad extends Tablet {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public Ipad(String marca, String model, int speed) {
		super(marca, model, speed);
	}
	
	/**
	 * @param marca
	 * @param model
	 */
	public Ipad(String marca, String model) {
		this(marca, model, 50);
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		System.out.println("Smashing iPad to the ground");

	}

}
