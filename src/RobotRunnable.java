
/**
 * This class is the child class in this example and has the logic
 * to do different actions and when.
 * @author mbe5
 *
 */
public class RobotRunnable {
	
	//a reference to the parent class
	private RobotInterface ri;
	
	/**
	 * Records a reference to the parent class
	 * @param ri_input
	 */
	public RobotRunnable( RobotInterface ri_input )
	{
		ri = ri_input;
	}
	
	/**
	 * This is where the if-statements would go to decide when and what to do.
	 */
	public void Run()
	{
		ri.Turn();
	}
}
