import java.util.*;
import java.lang.*;

public class string_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String str;
        str = sc.nextLine();
        int n = str.length();

        int vowel_count = 0;
        int con_count = 0;
        int digit_count = 0;
        int white_count = 0;

        for(int i = 0;i<n;i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||str.charAt(i) == 'u'|| str.charAt(i) == 'A' ||str.charAt(i) == 'E' ||str.charAt(i) == 'I' ||str.charAt(i) == 'O' ||str.charAt(i) == 'U')
            {
                vowel_count+=1;
            }

            if(!(str.charAt(i) == 'a') || !(str.charAt(i) == 'e') || !(str.charAt(i) == 'i')|| !(str.charAt(i) == 'o') || !(str.charAt(i) == 'u')|| !(str.charAt(i) == 'A') || !(str.charAt(i) == 'E') || !(str.charAt(i) == 'I') || !(str.charAt(i) == 'O') || !(str.charAt(i) == 'U'))
            {
                con_count+=1;
            }

            if(Character.isDigit(str.charAt(i)))
            {
                digit_count+=1;
            }
            if(Character.isWhitespace(str.charAt(i)))
            {
                white_count+=1;
            }
        }
        System.out.println(vowel_count);
        System.out.println(con_count);
        System.out.println(digit_count);
        System.out.println(white_count);
    }
}
