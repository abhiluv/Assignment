import java.util.Scanner;
public class CompareString
{
    int len1,len2;
    public int my_cmp(String s1, String s2)
    {
        len1 = s1.length();
        len2 = s2.length();
        
        if(len1>len2)
        {
            String temp = s1;
            s1 = s2;
            s2 = temp;            
        }
        
        for(int i=0; i<s1.length(); i++) 
        {
            int x = s1.charAt(i);
            
            if(x>=65 && x<=90) 
            {
                x+=32;
            }
            
            int y = s2.charAt(i);
            
            if(y>=65 && y<=90) 
            {
                y+=32;
            }
            
            if(x-y>0) 
            {
                return 1;
            }
            
            if(x-y<0) 
            {
                return -1;
            }
        } 
        return 0;
    }
    public static void main(String args[])
    {
        CompareString cmp = new CompareString();
        Scanner sc = new Scanner(System.in);
        System.out.print("String1: ");
        String str = sc.nextLine();
        System.out.print("String2: ");
        String str1 = sc.nextLine();  
        int result = cmp.my_cmp(str, str1);     
        if(result==0)
        {
            if(cmp.len1>cmp.len2)
            {
                result = 1;
            }
            else if(cmp.len1<cmp.len2)
            {
                result = -1;
            }
        }  
        System.out.println("\nResult of string is: "+result);
    }
}