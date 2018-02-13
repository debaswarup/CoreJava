package behavioral;

public class StrategyPatternTest 
{
    public static void main(String[] args)
    {
	Context c = new Context();
	OperationStrategy addStrategy = new AddOperation();
	c.setStrategy(addStrategy);
	c.doExecute(2, 3);
	
	OperationStrategy subtractStrategy = new SubtractOperation();
	c.setStrategy(subtractStrategy);
	c.doExecute(5, 1);
    }
    
    static interface OperationStrategy
    {
	int doOperation(int a, int b);
    }
    
    static class AddOperation implements OperationStrategy 
    {
	@Override
	public int  doOperation(int a, int b)
	{
	    return a+b;
	}
    }
    
    static class SubtractOperation implements OperationStrategy 
    {
	@Override
	public int  doOperation(int a, int b)
	{
	    return a-b;
	}
    }
    
    static class MultiplyOperation implements OperationStrategy 
    {
	@Override
	public int  doOperation(int a, int b)
	{
	    return a*b;
	}
    }
    
    static class Context
    {
	OperationStrategy strategy;
	
	void setStrategy(OperationStrategy strategy_)
	{
	    strategy = strategy_;
	}

	void doExecute(int a, int b)
	{
	    System.out.println(strategy.doOperation(a, b));
	}
    }
}
