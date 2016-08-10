 interface Shape 
 {	
	public String LABLE="Shape";
	
	void draw();
	double getArea();
 }
  
   class Circle implements Shape 
   {

	private double radius;

	public Circle(double r)
        {
	      this.radius = r;
	}
	
	//@Override
	public void draw() 
        {
   	      System.out.println("Drawing Circle");
	}
	
	//@Override
	public double getArea()
        {
	      return Math.PI*this.radius*this.radius;
	}

	public double getRadius()
        {
	      return this.radius;
	}
   }  

  
 class Rectangle implements Shape 
  {
	private double width;
	private double height;
	
	public Rectangle(double w, double h)
        {
		this.width=w;
		this.height=h;
	}

	//@Override
	public void draw() 
        {
	      System.out.println("Drawing Rectangle");
	}

	//@Override
	public double getArea() 
        {
	      return this.height*this.width;
	}

  }
 


public class Session6Assignment3
{
    public static void main(String [] args) 
    {
          Shape shape = new Circle(10);		
	  shape.draw();
	  System.out.println("Area="+shape.getArea());
		
	  //switching from one implementation to another easily
	  shape = new Rectangle(10,10);
	  shape.draw();
	  System.out.println("Area="+shape.getArea());
   }
}