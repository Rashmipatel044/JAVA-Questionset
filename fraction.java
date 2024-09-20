public class fraction {

    public static Fraction add(Fraction f1, Fraction f2) {
        int numerator = f1.num * f2.dum + f2.num * f1.dum;
        int denominator = f1.dum * f2.dum;
        return new Fraction(numerator, denominator);
    }

    public static int gcd(int num, int dum) {
        int min = Math.min(num, dum);
        for (int i = min; i >= 1; i--) {
            if (num % i == 0 && dum % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static class Fraction {
        int num;
        int dum;

        public Fraction(int num, int dum) {
            this.num = num;
            this.dum = dum;
            simplify();
        }

        public void simplify() {
            int hcf = gcd(num, dum);
            num /= hcf;
            dum /= hcf;
        }

      
    }

    public static void main(String[] args) {
        Fraction fb1 = new Fraction(7, 21);
        System.out.println("Fraction 1: " + fb1);

        Fraction fb2 = new Fraction(20, 29);
        System.out.println("Fraction 2: " + fb2);

        Fraction fb3 = add(fb1, fb2);
        System.out.println("Sum: " + fb3);
    }
}
