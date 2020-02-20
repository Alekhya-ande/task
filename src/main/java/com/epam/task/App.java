package com.epam.task;
import java.lang.Math;
import com.epam.task.Default;

public class App 
{
	double s,a,c;
	double simple(double p,double r ,double t) {
		 return a=p*(1+r*t);
	}
	double compound(double p,double r,double t) {
		 s=(p*r*t)/100;
		return c=p*Math.pow(1.0+r/100.0,t);
	}
	int construction(int choice) {
		switch (choice) {
		case 1: Standard s=new Standard();
		       s.standard();
			break;
		case 2:AboveStandard as=new AboveStandard();
				as.standard();
			break;
		case 3:HighStandard hs=new HighStandard();
		hs.standard();
			break;
		case 4:AutomatedHome ah=new AutomatedHome();
			ah.standard();
			break;
		default:Default d=new Default();
				d.standard();
			
		}
		return 0;
	}
}
