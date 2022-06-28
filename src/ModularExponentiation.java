public class ModularExponentiation {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.
        if (n == 0) {
            return 1;
        }

        // Calculate 'X' ^ ('N' / 2) recursively and store it in ans variable.
        long answer = modularExponentiation(x, n / 2, m);

        // If 'N' is even then return the square of answer.
        if (n % 2 == 0) {
            return (int) ((answer * answer) % m);
        }
        // Else return the square of answer multiplied with 'X'.
        else {
            return (int) (((answer * answer) % m * x % m) % m);
        }
    }
}
