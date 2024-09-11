public class Switch {
    public static void main(String args[])
    {
        System.out.println("HELLO");

        char a ='d';

switch(a)
{
    case 'x':
    System.out.println("this is the first case");
    break;

    case 'd':
    System.out.println("This is the SEcond case");
    break;

    case 'j':
    System.out.println("This is the Third case ");
    break;

    default:
    System.out.println("This is the Third case "); 
    break;
   
}

int n=7;
int j=1;
while (j<n)
 {
    System.out.println("THis is the number "+j);  
    j++;  
}

int v=1;int l=1;
do{
    System.out.println("This is the first default condition " +l);
    l++;
    v++;
}while (v<=10);
    }

}
