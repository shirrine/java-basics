package com.java24.hour12;

import java.awt.Point;

/**
 * Inheritance and method overriding
 * 
 * @author Shirrine
 *
 */
public class Point3D extends Point{
	
	public int z;
	
	public Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	
	public void move(int x, int y, int z){
		this.z = z;
		super.move(x, y);
	}
	
	public void translate(int dx, int dy, int dz){
		this.z += dz;
		super.translate(dx, dy);
	}
}
