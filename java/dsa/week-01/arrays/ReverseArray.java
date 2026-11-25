public class ReverseArray {
    static void reverse(int[] a)
    {
        int left=0;
        int right=a.length-1;
        while(left<right)
        {
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        System.out.println("\n The reversed array is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] a={20,10,2,15};
        System.out.println("The original Array is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        reverse(a);
    }
}