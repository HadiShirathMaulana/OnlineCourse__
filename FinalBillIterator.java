/**
 * Project : Online Course
 * @author Hadi Shirath Maulana, Farhan Maulana
 * Date: 6/01/2021
 * Final Arsitektur Perangkat Lunak
 */

public class FinalBillIterator implements Iterator
{
    int pos=0;
    public Main main;

    FinalBillIterator()
    {
        main=new Main();

    }

    public boolean hasNext()
    {
        if(pos<main.FinalBill.size())
        {
            return true;
        }
        return false;
    }

    public Object next()
    {
        if(this.hasNext())
        {
          return main.FinalBill.get(pos++);
        }
        return null;
    }

    public void remove()
    {
        if(pos<0)
        {
        System.out.println("Illegal pos");
        }
        try
        {
        if(this.next()!=null)
        {
                System.out.println("In remove");
                Main.FinalBill.remove(pos);
        }
        }
        catch(Exception e)
        {
            //Handle exception
        }
    }
}
