
/**
 * This class creates the interface which allows the robot to
 * perform different actions like turn or go straight. Only
 * the actions needed by the child class are required.
 * @author mbe5
 *
 */
public interface RobotInterface {
	
	//turn the robot - to be overridden
	public void Turn();
}
