package lab1;

public class MyMath {
    public static int returnSmallest(int x, int y, int z) {
        if (x < y && x < z) {
            return x;
        } else if (y < x && y < z) {
            return y;
        } else if (z < x && z < y) {
            return z;
        } else return -1;
    }

    public static int returnPower(int a, int b) {
        if (b <= 0) {
            return -1;
        }
        int result = a;

        for (int i = 1; i < b; i++) {
            result *= a;
        }//a is multiplied by itself b times
        return result;
    }

    public static int returnSum(int s) {
        if (s < 1) {
            return -1;
        }
        int result = 1; //initialise it to 1

        for (int i = 1; i < s; i++) {
            result += s;
        }//result is added to itself until the loop ends - quite similar to above
        return result;
    }

    public static int returnFactorial(int f) {
        if (f < 0) {
            return -1;
        }

        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isPrime(int p) {
        boolean valid = true;

        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                valid = false;
                break;
            }
        }
        return valid;
    }
}
