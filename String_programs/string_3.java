import java.util.*;

public class string_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String s;
        s = "Hello, have a good day";
        char ch[]=new char[20];
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'|| s.charAt(i)=='A'||s.charAt(i)=='e'|| s.charAt(i)=='E'||s.charAt(i)=='i'|| s.charAt(i)=='I'||s.charAt(i)=='o'|| s.charAt(i)=='O'||s.charAt(i)=='U'|| s.charAt(i)=='u')
            {
                ch[j++]=s.charAt(i);
            }
            else
            {
                continue;
            }
        }

        for(int i=0;i<j;i++)
        {
        System.out.print(ch[i]);
        }
    }
}
