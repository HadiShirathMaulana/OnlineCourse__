/**
 * Project : Online Course
 * @author Hadi Shirath Maulana, Farhan Maulana
 * Date: 6/01/2021
 * Final Arsitektur Perangkat Lunak
 */

import java.util.ArrayList;


public class Course implements Subject {
    private boolean inStock = true;
    private ArrayList<Observer> customers;

    public Course (Boolean inStock) {
        this.inStock = inStock;
        customers = new ArrayList<Observer>();
    }

    public boolean isInStock(){
        return  inStock;
    }

    public void setInStock(boolean inStock){
        this.inStock = inStock;
        if(isInStock()){
            notifyObserver();
        }
    }

    @Override
    public void addObserver(Observer o) {
        customers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        customers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(int i=0; i< customers.size(); i++){
            customers.get(i).update();
        }
    }
}
