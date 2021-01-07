/**
 * Project : Online Course
 * @author Hadi Shirath Maulana, Farhan Maulana
 * Date: 6/01/2021
 * Final Arsitektur Perangkat Lunak
 */

public interface Subject {

    void addObserver(Observer o);  
    void removeObserver(Observer o);  
    void notifyObserver();  
}
