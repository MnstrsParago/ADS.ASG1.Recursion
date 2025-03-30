import java.util.Scanner;

public class Main{

    static int n = 0;
    public static int mn(int[] ar, int ind){ //problem 1
        if (ind == ar.length) return n;
        if (ar[ind-1] < ar[n]) n = ind-1;
        return mn(ar, ind+1);
    } //problem 1

    public static double vr (int [] arr, int ind, double sum, int count){ //problem 2
        if (ind<0) return sum/count;

        sum+= arr[ind];

        return vr(arr, ind-1, sum, count);
    } //problem 2

    public static int pr (int n, int i, int count){ //problem 3
        if (i == 1) return count;

        if (n%i==0) return count+=1;
        return pr(n, i-1, count);
    } //problem 3

    public static int fact(int n){ //problem 4
        if (n<=1) return 1;
        return fact(n-1)*n;
    } //problem 4

    public static int fb(int f){ //prob;em 5
        if (f<2) return f;
        return fb(f-2) + fb(f-1);
    } //problem 5

     //problem 6

     //problem 7

     //problem 8

    public static int fc(int f){ //problem 9
        if (f<2) return 1;
        return fc(f-1)*f;
    } //problem 9

    public static int gcd(int a, int b){ //problem 10
        if (a%b==0) return b;
        return gcd(b,a%b);
    } //problem 10


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int ind = 1;
        for (int i = 0; i<n; i++){
            int tm = sc.nextInt();
            arr[i] = tm;
        }
        int k = sc.nextInt();


        System.out.println(arr[mn(arr, ind)]); //Problem 1
        System.out.println(vr(arr, n-1, 0, n)); //Problem 2
        if (pr(n, n-1, 2) == 2) System.out.println("Prime"); //Problem 3
        else System.out.println("Composite"); //Problem 3
        System.out.println(fact(n)); //Problem 4
        System.out.println(fb(n)); //Problem 5
         //problem 6
         //problem 7
         //problem 8
        System.out.println(fc(n)/(fc(k)*fc(n-k))); //Problem 9
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b)); //Problem 10






    }}