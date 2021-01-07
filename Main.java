/**
 * Project : Online Course
 * @author Hadi Shirath Maulana, Farhan Maulana
 * Date: 6/01/2021
 * Final Arsitektur Perangkat Lunak
 */

import java.util.ArrayList;

public class Main implements Intermediate{

  public static ArrayList<OnlineCourse> FinalBill=new ArrayList<>();
  
  public Main(){
  }
  public Iterator getIterator()
    {
          return new FinalBillIterator();
    }

  void addToList(OnlineCourse onlineCourse)
  {
      FinalBill.add(onlineCourse);
  }

  void orderQuantity()
  {
      System.out.println("\n Order "+FinalBill.size()+" Online Course");
  }
    
  void clear()
  {
      FinalBill.clear();
  }

  public static void main(String[] args) {

    //Decorator Pattern
    OnlineCourse onlineCourse=new DesignGraphic();
    //System.out.println(onlineCourse.getDescription()+"\n"+onlineCourse.cost()+" Rupiah");
    
    OnlineCourse onlineCourse1 =new Programming();
    onlineCourse1=new CoursePrivateDesign (onlineCourse1);
    onlineCourse1=new CoursePrivateLeadership (onlineCourse1);
    onlineCourse1=new CoursePrivateDesign(onlineCourse1);
    
    //System.out.println(onlineCourse1.getDescription()+"\n"+onlineCourse1.cost()+" Rupiah");
    
    OnlineCourse onlineCourse2 =new Programming();
    onlineCourse2=new CoursePrivateDesign(onlineCourse2);
    onlineCourse2=new CoursePrivateProgramming(onlineCourse2);
    onlineCourse2=new CoursePrivateLeadership(onlineCourse2);
    //System.out.println(onlineCourse2.getDescription()+"\n"+onlineCourse2.cost()+" Rupiah");

    Main it=new Main();

    it.addToList(onlineCourse2);
    it.addToList(onlineCourse1);
    it.addToList(onlineCourse);
    
    //Observer Pattern 
    Course course = new Course (true);
    Customer customer1 = new Customer(course, "Hadi Shirath");
    course.addObserver(customer1);
    Customer customer2 = new Customer(course, "Farhan Maulana");
    course.addObserver(customer2);
    course.setInStock(true);
    
    it.orderQuantity();
    System.out.println("-------------------------\n Name");
    
    //Iterator Pattern
    Iterator iterator=it.getIterator();
    int total = 0;
    int i = 1;
    while(iterator.hasNext())
    {
        //System.out.println("\n Variety of coffee provided by us are");
        OnlineCourse onlineCourseit=(OnlineCourse)iterator.next();
        System.out.println(" "+i+". "+onlineCourseit.getDescription()+" (Rp. "+onlineCourseit.cost()+")");
        ++i;
        total += onlineCourseit.cost();
    }
    
    System.out.println("\n Total   : Rp. "+total+" \n-------------------------\n Removing elements..");
    while(iterator.hasNext())
    {
        iterator.remove();
    }
    System.out.println(" Done..");

    
  }
}
