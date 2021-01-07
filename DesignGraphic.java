/**
 * Project : Online Course
 * @author Hadi Shirath Maulana, Farhan Maulana
 * Date: 6/01/2021
 * Final Arsitektur Perangkat Lunak
 */

//Extending the Coffee class and implementing it
public class DesignGraphic extends OnlineCourse {
    
  //Instance variabel, menginiliasisi nilai ke String description
  public DesignGraphic() {
    description="Design Graphic";             
  }
  
  /*
   * Method yang berfungsi untuk mengembalikan nilai harga
   * dari kelas kursus DesignGraphic 
   */
  public double cost(){                 
    return 80000;
  }
}
