package behavioral;

public class DecoratorPatternTest
{
    
    public static void main(String[] args)
    {
	Shape r1 = new Rectangle();
	
	Shape r1RedDecorated = new RedShapeDecorator(new Rectangle());
	
	Shape r2 = new Circle();
	
	Shape r2GreenDecorated = new GreenShapeDecorator(new Circle());
	
	r1.draw();
	r2.draw();
	r1RedDecorated.draw();
	r2GreenDecorated.draw();
    }
    
    static interface Shape
    {
	void draw();
    }
    
    static class Circle implements Shape
    {
	@Override
	public void draw()
	{
	    System.out.println("Circle is drawn.");
	}
    }
    
    static class Rectangle implements Shape
    {
	@Override
	public void draw()
	{
	    System.out.println("Rectangle is drawn.");
	}
    }
    
    static abstract class ShapeDecorator implements Shape
    {
	Shape decoratedShape;
	
	ShapeDecorator(Shape decoratedShape_)
	{
	    decoratedShape = decoratedShape_;
	}
	
	abstract void decorate();
    }
    
    static class RedShapeDecorator extends ShapeDecorator
    {
	RedShapeDecorator(Shape decorateShape_)
	{
	    super(decorateShape_);
	}
	
	void decorate()
	{
	    System.out.println("Adding red color");
	}
	
	public void draw()
	{
	    decoratedShape.draw();
	    decorate();
	}
    }
    
    static class GreenShapeDecorator extends ShapeDecorator
    {
	GreenShapeDecorator(Shape decorateShape_)
	{
	    super(decorateShape_);
	}
	
	void decorate()
	{
	    System.out.println("Adding green color");
	}
	
	public void draw()
	{
	    decoratedShape.draw();
	    decorate();
	}
    }

}
