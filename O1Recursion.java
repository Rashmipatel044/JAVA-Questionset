
import java.net.Socket;
import java.util.Scanner;

public class O1Recursion {

    static void printIncreasing(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
    }

    static void printDecreasing(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecreasing(n - 1);

    }

    static int factorial(int n) {
        // Base case
        if (n == 0) {
            return 1;
        }
        // self work and smaller problem

        return n * factorial(n - 1);
    }

    static int fibonacci(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return n;
        }

        // Smaller problem
        int a = fibonacci(n - 2), b = fibonacci(n - 1);

        // self work
        return a + b;

    }

    static int digitsum(int n) {
        // Base case
        if (n >= 0 && n <= 9) {
            return n;
        }
        // Sub problem
        int ans = 0;
        ans += digitsum(n / 10) + n % 10;
        return ans;
    }

    static int digitcount(int n) {
        // base case
        int count = 1;
        if (n >= 0 && n <= 9)
            return 1;
        // sub problem

        count = 1 + digitcount(n / 10);

        // Self work

        return count;

    }

    static int power(int p, int q) {
        // Base case
        if (q == 0)
            return 1;
        // Sub problem
        int ans = 1;
        ans *= power(p, q - 1);

        // Self work
        ans = ans * p;
        return ans;
    }

    static int powerbetterapproch(int p, int q) {
        if (q == 0) {
            return 1;
        }
        int smallpow = powerbetterapproch(p, q / 2);
        if (q % 2 == 0) {

            return smallpow * smallpow;
        } else {

            return p * smallpow * smallpow;
        }

    }

    static void happynumber(int n) {
        // ERROR IN BASE CASE
        if (n == 0) {
            return;
        }
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n = n / 10;
        }
        if (sum == 1) {
            System.out.println("Happy");
            return;
        } else {
            n = sum;
            happynumber(n);
        }

    }

    static void kmultiplesofn(int n, int k){
        // Base case
        if(k==1){
            System.out.println(n);
          return ;  
        }
        // Sub problem
        kmultiplesofn(n, k-1);
        System.out.println(n*k);
        
        // Self work
    }
static int sum_of_n_with_alternet_sign(int n){
    // base case
    if(n==0)
    return 0;

    // sub problem
int ans=sum_of_n_with_alternet_sign(n-1);
// self work
    if(n%2==0){
        return -n+ans;
   }
    else
    return n+ans;
    
}

static int gcd_bruteforce(int n, int m){
    int min= Math.min(n,m);
      for(int i=min;i>=1;i--){
        if(n%i==0 &&m%i==0){
            return i;
        }
      }
      return 1;
}
// LONG DIVISION METHOD
static int igcd(int x, int y){
     while(x%y!=0){
       int rem= x%y;
          x=y;
         y=rem;
     }
     return y;
}
//  EUCLID'S ALGORITHM
// gcd(x,y)=gcd(y,x%y)
// gcd(x,0)=x

static int gcd_optimised(int x, int y){
// base case
if(y==0){
    return x;
}

// sub problem
return gcd_optimised(y,x%y);
// self work
}
// ERROR
 static int Armstrong_or_not(int A){
    int n= A;
    
    int digits= digitcount(n);
    int digitsum=power(n%10, digits);
    if(n>=0&&n<=9){
         System.out.println("Armstron");
          return 1;}
    Armstrong_or_not(n/10); 
    
    if(digitsum==A){
        return 1;
    
    }else 
    return 0;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // printIncreasing(n);
        // printDecreasing(n);
        // System.out.println(factorial(n));

        // for(int i=0;i<=n;i++){
        // System.out.println(fibonacci(i));}
        // System.out.println(digitcount(n));
        // System.out.println(power(2, n));
        // System.out.println(powerbetterapproch(2, n));
//   kmultiplesofn(2, n);
        // happynumber(n);
        // System.out.println(sum_of_n_with_alternet_sign(n));
        // System.out.println(gcd_bruteforce(15, 45));
        System.out.println(gcd_optimised(15, 45));
        System.out.println(Armstrong_or_not(153));
    }
}
