
package movewithoutgears;
import ch.aplu.robotsim.*;
/**
 *
 * @author User
 */
public class MoveWithoutGears {
      MoveWithoutGears()  
  {
    TurtleRobot robot=new TurtleRobot();
    robot.forward(100);
    robot.left(45);
    robot.forward(200);
    robot.right(90);
    robot.backward(100);
    robot.exit();
   }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MoveWithoutGears  m=new MoveWithoutGears();
        
    }
    
}
