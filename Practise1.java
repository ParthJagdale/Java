class Student
{
    int rollno;
    String name;
    float fee;

    public Student()
    {
        System.out.println("THis is the default constructor");
        fee=20000;
    }

    public Student(int rollno,String name,float fee)
    {
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;

    }

    void display()
    {
        System.out.println(rollno + name + fee);
    }
}


public class Practise1 {

        public static void main(String args[])
        {
                Student s1= new Student(1, "Parth", 20000);
                Student s2 =new Student();
                System.out.println(s2.fee);
        }
    
    
}
