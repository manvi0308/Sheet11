import java.util.*;
import java.util.jar.Manifest;
import java.io.*;
import java.lang.reflect.AnnotatedArrayType;

public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.
        // x is the base, n is the power
        // m is the modulo

        if (n == 0) {
            return 1;
        }

        //ToDo Calculate 'X' ^ ('N' / 2) recursively and store it in ans variable.
        long answer = modularExponentiation(x, n / 2, m);

        if (n % 2 == 0) {
            return (int) ((answer * answer) % m);
        }
   
        else {
            return (int) (((answer * answer) % m * x % m) % m);
        }
    }

    public static void main(String[] args) {
        System.out.println(modularExponentiation(10000000, 2, 10000001));
    }
}