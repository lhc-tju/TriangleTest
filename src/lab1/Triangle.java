/* LinHanchuan 3014218124 2017.3.10*/
package lab1;


public class Triangle {

	//a function to tell the kind of triangle.
	/* -1:not a triangle
	  1:equilateral 
	  2:isosceles
	  3:scalene
	*/
	public int getTriangleKind(int a,int b,int c){
		
		if(a<=0 || b <= 0 || c<=0)
			return -1; 
		
		if(a+b <= c || a+c<=b || b+c <=a )
			return -1;
		
		if(a == b && b == c)
			return 1;
		if(a == b || b == c || a == c)
			return 2;
		
		return 3;
	}
	
	public static void main(String args[]){
		Triangle triangle = new Triangle();
		
		System.out.print(triangle.getTriangleKind(3, 4, 5));
		System.out.print(triangle.getTriangleKind(5, 4, 5));
		System.out.print(triangle.getTriangleKind(9, 4, 5));
	}
	
}
