import java.util.*;

public class string_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();

        int n = str.length();
        int count=0;
        for(int i = 0;i<n;i++)
        {
            if(str.charAt(i) == ' ')
                count+=1;
        }

        System.out.println(count+1);
        System.out.println(str.toUpperCase());
    }
}

