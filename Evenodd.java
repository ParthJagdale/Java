import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int arr[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<5;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println("THis is the even number :" +arr[i]);
            }
            else{
                System.err.println("This is the odd number :" + arr[i]);
            }
        }
        
    }
    
}
