import java.util.*;
class number
{
    public static void main(String args[])
    {
        int num=0;
        String words="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        if(num>10000)
        System.out.println("please enter a no. upto 4 digits");
        else if(num==0)
        System.out.println("zero");
        else
        System.out.println("you find the number");
        String one[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen",
                     "Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String ten[]={"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
        
        if(num>1000)
        {
        words=words+one[num/1000]+" Thousand ";
        num=num%1000;
        }
        if(num>100)
        {
          words=words+one[num/100]+" Hundred ";
          num=num%100;
        }
        if(num>=20)
        {
        words=words+ten[num/10]+" ";
        num=num%10;
        }
        if(num>0)
        words=words+one[num];
        System.out.println("Digit in the no. format  "+words);
    }
}  

            
