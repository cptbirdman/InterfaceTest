
/**
 * This is the main robot class and is the parent class in this example.
 * @author mbe5
 *
 */
public class Robot implements RobotInterface{
	
	private RobotRunnable rr;
	
	public Robot() 
	{
		//we pass a reference to ourselves
		rr = new RobotRunnable( this );
	}
	
	public void Run()
	{
		//run the loop which has the logic to tell us what to do
		//e.g. we are the controlled and robotrunnable is the controller
		rr.Run();
	}

	@Override
	public void Turn() {
		//This turns the robot. Put the actual movement code here.
		System.out.println("turn");
	}
}
