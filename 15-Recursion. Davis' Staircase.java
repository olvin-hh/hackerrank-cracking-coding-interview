import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int getWaysCount(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n == 3) {
            return 4;
        } else if (n == 4) {
            return 7;
        } else if (n == 5) {
            return 13;
        } else {
            return getWaysCount(n - 1) + getWaysCount(n - 2) + getWaysCount(n - 3);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            System.out.println(getWaysCount(n));
        }
    }
}
