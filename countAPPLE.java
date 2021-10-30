import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static final int A_IN_APPLE = 1;
    public static final int P_IN_APPLE = 2;
    public static final int L_IN_APPLE = 1;
    public static final int E_IN_APPLE = 1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String labels = in.next();
        int count = 0;
        int aNum = 0;
        int pNum = 0;
        int lNum = 0;
        int eNum = 0;
        
        for (int i = 0; i < labels.length(); i++) {
            if (labels.charAt(i) == 'a') {
                aNum++;
            }
            else if (labels.charAt(i) == 'p') {
                pNum++;
            }
            else if (labels.charAt(i) == 'l') {
                lNum++;
            }
            else if (labels.charAt(i) == 'e') {
                eNum++;
            }
        }
        
        while (aNum >= 1 && pNum >= 2 && lNum >= 1 && eNum >= 1) {
            count++;
            aNum -= 1;
            pNum -= 2;
            lNum -= 1;
            eNum -= 1;
        }
        
        System.out.print(count);
        
    }
}
