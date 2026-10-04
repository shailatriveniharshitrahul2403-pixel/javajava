import java.util.Scanner;
class Hp{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
         int n=sc.nextInt();
         int temp =m;
         m=n;
         n=temp;
         IO.println(m+"  "+n);
    }
}