import java.util.*;

public class string_4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str_words = str.split(" ");
        for (int i = 0; i < str_words.length; i++) 
        {
            if ((str_words[i].length() % 2) != 0)
            {
                StringBuilder reverser = new StringBuilder(str_words[i]);
                str_words[i] = reverser.reverse().toString();
            }
        }
        System.out.println(String.join(" ", str_words));
    }
}
