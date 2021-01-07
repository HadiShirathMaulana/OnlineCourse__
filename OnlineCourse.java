/**
 * Project : Online Course
 * @author Hadi Shirath Maulana, Farhan Maulana
 * Date: 6/01/2021
 */

/*
 * Implementasi class menggunakan dua method yaitu
 * getDescription() and cost()
 */
public abstract class OnlineCourse{
  String description="Unknown Class Online Course";

  /*
   * Method ini akan berguna untuk
   * mendeskripsikan keadaan 
   * @return String description
   */
  public String getDescription(){     
    return description;
  }
  
  /*
   * Method yang berfungsi untuk menghitung biaya
   * disetiap sesuatu yang dipesan
   */
  public abstract double cost();  
  
  
}