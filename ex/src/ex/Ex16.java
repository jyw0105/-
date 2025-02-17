package ex;

import ex1.Vehicle;
import ex1.DieselEngine;
import ex1.ElectricMotor;
import ex1.Engine;
import ex1.GasolineEngine;

public class Ex16 {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		
		Engine gasolineEngine = new GasolineEngine(2025);
		Engine dieselEngine = new DieselEngine(2024);
		Engine electricMotor = new ElectricMotor(2023);
		
		vehicle.setModelName("가솔린차");
		vehicle.setYear(2025);
		vehicle.printCatalogue(gasolineEngine);
		
		vehicle.setModelName("디젤차");
		vehicle.setYear(2024);
		vehicle.printCatalogue(dieselEngine);
		
		vehicle.setModelName("전기차");
		vehicle.setYear(2023);
		vehicle.printCatalogue(electricMotor);
	}
}
