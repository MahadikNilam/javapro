package inheritance;
//create a class teacher(t_id,name,designation,salary,subject)ctreate a class student (id,name,c_name,subject)inherited from teacher class write a java program to accept details
//both this classes and display
public class teacher {
    int id;
    String name;
    String designation;
    double salary;
    String subject;
    public void getdata(int id,String name,String designation,double salary,String subject)
    {
        this.id=id;
        this.name=name;
        this.designation=designation;
        this.salary=salary;
        this.subject=subject;
    }
    public void display()
    {
        System.out.println("ID:"+id);
        System.out.println("Name: "+name);
        System.out.println("Designation: "+designation);
        System.out.println("Salary: "+salary);
        System.out.println("Subject: "+subject);
    }
    public class student extends teacher{
        int id;
        String name;
        String c_name;
        String subject;
        public void getaccept(int id,String name,String c_name,String subject)
        {
            this.id=id;
            this.name=name;
            this.c_name=c_name;
            this.subject=subject;

        }
        public void displaystudent()
        {
            System.out.println("ID:"+id);
            System.out.println("Name: "+name);
            System.out.println("C_name: "+c_name);
            System.out.println("Subject: "+subject);
        }
        public static void main(String args[])
        {
            student s = new student();
            s.getdata(101,"nilam","assisant professor",20000,"java");
            s.getaccept(121,"Abc","BCA","python");
            s.display();
            s.displaystudent();
        }
        }
}
