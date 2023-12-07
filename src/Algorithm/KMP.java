package Algorithm;
import java.util.*;

public class KMP {
    private static void searchpat(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int lps[] =computeLps(pattern);
        int i = 0;
        int j = 0;
        while(i<n)
        {
            if(pattern.charAt(j)==text.charAt(i))
            {
                i++;
                j++;
            }
            if(j==m){
                System.out.println("pattern found at index"+(i-j));
                j = lps[j-1];
            }
            else if(i<n&& pattern.charAt(j)!= text.charAt(i))
            {
                if(j!= 0)
                {
                    j = lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
    }

    private static int[] computeLps(String pattern) {
        int m = pattern.length();
        int len = 0;
        int[] lps = new int[m];
        lps[0] =0;
        for(int i = 1; i<m;)
        {
            if(pattern.charAt(i)==pattern.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len != 0)
                {
                    len = lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }

    private static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        searchpat(text,pattern);
    }

}
