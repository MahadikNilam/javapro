package inheritance;
//define a class emplyoee having members(id,name,department,salary)create a subclass called manager with member bonus.define method accept and display in both classes
public class employee {
    int id;
    String name;
    String dept;
    double salary;
    public void getdata(int id,String name,String dept,double salary)
    {
        this.id=id;
        this.name=" "+name;
        this.dept=" "+dept;
        this.salary=salary;
    }
    public void display()
    {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Department: "+dept);
        System.out.println("Salary: "+salary);
    }
}
class manager extends employee{
    double bonus;
    public void getaccept(double bonus)
    {
       this.bonus=bonus;
    }
    public void displaymanager()
    {
         System.out.println("Bonus: "+bonus);
    }

    public static void main(String args[])
    {
        manager m=new manager();
        m.getdata(100,"nilam","mca",100000);
        m.getaccept(2000000);
        m.display();
        m.displaymanager();
    }
}



