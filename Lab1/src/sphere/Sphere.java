package sphere;

import java.text.DecimalFormat;

public class Sphere {
	private double diameter;

	public Sphere(double diameter) {
		this.diameter = diameter;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public double calcArea() {
		return 4 * Math.PI * Math.pow(diameter / 2, 2);
	}

	public double calcVolume() {
		return 4.0 / 3.0 * Math.PI * Math.pow(diameter / 2, 3);
	}

	public String toString() {
		return "Area: " + new DecimalFormat("0.000").format(calcArea()) + "\nVolume: "
				+ new DecimalFormat("0.000").format(calcVolume());
	}

}
