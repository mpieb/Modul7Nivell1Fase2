package com.vehicles.project;

import java.util.List;

    public class Car extends Vehicle {

	public Car(String plate, String brand, String color) throws InvalidPlateException {
		super(plate, brand, color);
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception("Nomès dues rodes!");

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception("La roda esquerra no coincideix amb la roda dreta!");

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

	@Override
	public String toString() {
		return "Car [plate=" + plate + ", brand=" + brand +
                        ", color=" + color + ", wheels=" + wheels + "]";
	}

    }

    


