import java.io.*;
import java.util.*;
class Leet_easy_2
{
    public static void main()
    {
        int n,m=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of seats");
        n=sc.nextInt();
        int []seats = new int[n];
        int []students=new int[n];
        System.out.println("Enter the seats");
        for (int i=0;i<n;i++)
        seats[i]=sc.nextInt();
        System.out.println("Enter the students");
        for (int i=0;i<n;i++)
        students[i]=sc.nextInt();
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<n;i++)
        m=m+Math.abs(seats[i]-students[i]);
        System.out.println("minimum number of the moves is:"+m);
    }
}