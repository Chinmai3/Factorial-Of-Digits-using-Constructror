import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<Integer>();
        while(sc.hasNextInt())
        {
            al.add(sc.nextInt());
        }
        A a=new A(al);
        System.out.println(a.all);
        
    }
}
class A{
    ArrayList<Integer> al=new ArrayList<Integer>();
    ArrayList<Integer> all=new ArrayList<Integer>();
    A(ArrayList<Integer> al)
    {
        this.al=al;
        int len=al.size();
    for(int i=0;i<len;i++)
    {
        int fact=1;
        int num=(int)(al.get(i));
        while(num>0)
        {
            fact*=num;
            num--;
        }
        all.add(fact);
    }
    }
    
}
