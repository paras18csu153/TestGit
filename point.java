import java.io.*;
import java.util.*;
import java.lang.Math;
class point{
	private double f1,f2;
	public void set(double x1,double x2){
		f1 = x1; f2 = x2;
	}
	public double[] get(){
		double[] f=  new double[2];
		f[0]=f1;f[1]=f2;
		return f; 
	}
	public double calDist(point p){
		double[] f = new double[2];
		f=p.get();
		return Math.sqrt((f[0]-f1)*(f[0]-f1)+(f[1]-f2)*(f[1]-f2));
	}
}

	
