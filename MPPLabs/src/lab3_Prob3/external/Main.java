package lab3_Prob3.external;

import lab3_Prob3.Composition.Cylinder;

public class Main {
	public static void main(String[] args) {
		Cylinder c = new Cylinder(6,3);
		System.out.println("AreaOfCylinder:" +c.calculateVolumeOfCylinder());
		System.out.println(c.getCircleInfo());
	}
}
