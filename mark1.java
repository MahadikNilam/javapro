//package inheritance;
//write a java program to implement single inheritance
 class implement_singleinheritance {
    int id;
    String name;
    String c_name;
    public void getdata(int id,String name,String c_name)
    {
        this.id=id;
        this.name=name;
        this.c_name=c_name;
    }
    public void display()
    {
       System.out.println("S_id: "+id);
       System.out.println("Name: "+name);
       System.out.println("c_name: "+c_name);
    }
}
public class mark1 extends implement_singleinheritance
{
    int m1,m2,m3;
    public void getmark(int m1,int m2,int m3)
    {
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    public void displaymark()
    {
       int total; 
       total=m1+m2+m3;
        System.out.println("TotaL_Mark: "+total);
    }
    public static void main(String args[])
    {
        mark1 m=new mark1();
        m.getdata(101,"Nilam","Bca");
        m.getmark(97,89,92);
        m.display();
        m.displaymark();
    }
}
