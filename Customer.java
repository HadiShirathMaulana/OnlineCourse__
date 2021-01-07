/**
 * Project : Online Course
 * @author Hadi Shirath Maulana, Farhan Maulana
 * Date: 6/01/2021
 * Final Arsitektur Perangkat Lunak
 */

public class Customer implements Observer {

    private Subject subject;
    private String username;

    public Customer(Subject subject, String username){
        this.subject = subject;
        this.username = username;
    }

    @Override
    public void update() {
        System.out.println(" Menu Tersedia");
        buyCourse();
    }


    private void buyCourse(){
        System.out.println(" Customer : "+username);
    }

    public void unsubscribe(){
        subject.removeObserver(this);
    }
}