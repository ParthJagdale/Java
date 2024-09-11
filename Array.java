import java.util.Arrays;
import java.util.Scanner;

class Practise2{


}

public class Array {
    
    public static void main(String arg[])
    {
        Scanner sc =new Scanner(System.in);
         
            String a="Parth";
            String b="Jagdale";
            String c;


            c=a.concat(b);
            System.out.println(c);
            c=a.replace('a','k'); // replace

        int l=a.compareTo(b);
        System.out.println(l);  //compare 

            String s1= "parthnitinjagdale";
            String var=s1.toUpperCase(); //uppercase


            String s2="thisisthe";
            System.out.println(s2.startsWith("this"));  //startsWith

            System.out.println(var);
            System.out.println(c);



            String s3="thisos";
            int index;
            index= s3.indexOf('h');
            System.out.println(index); //this is the index of function


            //Substring
            String s4="substring";
            System.out.println("Substring is ;"+s4.substring(3,5));




            

            int arr[] ={1,2,43,434,22};

            Arrays.sort(arr);


        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
