package behavioral;

public class FactoryPatternTest
{
    
    static interface Shape
    {
	void draw();
    }
    
    static class Circle implements Shape
    {
	public void draw()
	{
	    System.out.println("Drawing circle..");
	}
    }
    
    static class Rectangle implements Shape
    {
	public void draw()
	{
	    System.out.println("Drawing rectangle..");
	}
    }
    
    static class ShapeFactory
    {
	Shape getShape(String shapeType_)
	{
	    switch(shapeType_)
	    {
	    case "CIRCLE":
		return new Circle();
		
	    case "RECTANGLE":
		return new Rectangle();
		
	    }
	    
	    return new Circle();
	}
    }
    
    public static void main(String[] args)
    {
	ShapeFactory sf = new ShapeFactory();
	Shape circle = sf.getShape("CIRCLE");
	Shape rectangle = sf.getShape("RECTANGLE");
	
	circle.draw();
	rectangle.draw();
    }
    
}
