

    public class Armstrong {

        // Function to count the number of digits in the number
        static int countDigits(int n) {
            if (n == 0) {
                return 0;
            }
            return 1 + countDigits(n / 10);
        }
    
        // Recursive function to calculate the sum of powered digits
        static int armstrongSum(int n, int digits) {
            if (n == 0) {
                return 0;
            }
            int digit = n % 10;
            return (int) Math.pow(digit, digits) + armstrongSum(n / 10, digits);
        }
    
        // Function to check if the number is an Armstrong number
        static int isArmstrong(int n) {
            int digits = countDigits(n);
            int sum = armstrongSum(n, digits);
            return (sum == n) ? 1 : 0;
        }
    
        public static void main(String[] args) {
            int number = 153;  // Example number
            if (isArmstrong(number) == 1) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }
    }
    

