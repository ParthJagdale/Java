class A 
{
    public void displaya()
    {
        System.out.println("This is the class A method");
    }
}

class B extends A{
    public void displayb()
    {
        System.out.println("This is the class B method");
    }
}
public class Vector {
    public static void main(String args[])

    {
            B obj =new B();
            obj.displaya();
            obj.displayb();
    }
    
}
