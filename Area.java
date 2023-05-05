class Area{
public static void main(String args[]){
Area.area(10,10);
Area.area(5);

}
public static double area(int b,int h){
	double areaoftriangle=0.5*b*h;
	System.out.println("Area of triangle"+areaoftriangle);
	return areaoftriangle; 
}
public static double area(double r){
double areaofcircle=3.14*r*r;
System.out.println("Area of circle "+areaofcircle);
return areaofcircle;
}
}
