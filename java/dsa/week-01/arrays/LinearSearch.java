import java.util.Scanner;
public class LinearSearch {
    static int search(int[] a,int target)
    {
        for(int i=0;i<a.length;i++)
            {
            if(a[i]==target)
            return i;
            }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={20,30,2,50,9};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the target value");
        int target=sc.nextInt();
        int result=search(a,target);
        if(result==-1)
        {
            System.out.println("not found");
        }
        else
        {
            System.out.println("The value " + target + " is found at index " + result);
        }
    }

}