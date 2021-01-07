/**
 * Project : Online Course
 * @author Hadi Shirath Maulana, Farhan Maulana
 * Date: 6/01/2021
 * Final Arsitektur Perangkat Lunak
 */

//Caramel is decorator so it extends AddOnDecorator and AddOnDecorator extends Coffee
public class CoursePrivateDesign extends Decorator{
    
    /*
     * Menciptakan objek baru dari class OnlineCourse
     */
  OnlineCourse onlineCourse;                        

  public CoursePrivateDesign(OnlineCourse onlineCourse){
    this.onlineCourse=onlineCourse;
  }

  public String getDescription(){
    return onlineCourse.getDescription()+ ", Course_Private_Design";
  }

  /*
   * Method 
   */
  public double cost(){
    return 30000+onlineCourse.cost();            
  }
}
