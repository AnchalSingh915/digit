import java.util.*;
class number
{
    public static void main(String args[])
    {
        int n=0;
        String w="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number upto 4 digits");
        n=sc.nextInt();
        if(n>=10000)
        System.out.println("please enter a no. upto 4 digits");
        else if(n==0)
        System.out.println("zero");
        else
        System.out.println("you find the number");
        String one[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen",
                     "fourteen","fifteen","sixteen","seventeen","Eighteen","nineteen"};
        String ten[]={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
        if(n>1000)
        w=w+one[n/1000]+" thousand ";
        n=n%1000;
        if(n>100)
        w=w+one[n/100]+" hundred ";
        n=n%100;
        if(n>20)
        w=w+ten[n/10]+" ";
        n=n%10;
        if(n>0)
        w=w+one[n];
        System.out.println("Digit in the no. format"+w);
    }
}