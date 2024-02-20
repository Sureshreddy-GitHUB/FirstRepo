import java.util.Scanner;

interface I1
{
    static void m1(int a)
    {
        System.out.println(a);
    }
    void m2(int aa);
}

interface I2
{
    static void m3(float f)
    {
        System.out.println(f);
    }
    void m4(float ff);
}


abstract class Abs implements I1,I2
{
    static Scanner sc=new Scanner(System.in);
    int m5(int a)
    {
        System.out.println(a);
        return 1;
    }
    abstract void m6();
    Abs(D obj)
    {
        System.out.println(obj);
    }
}
class B extends Abs

{
    B()
    {
        super(new D(Abs.sc.nextInt()));
    }
    public void m2(int aa)
    {
        System.out.println(aa);
    }
    public void m4(float ff)
    {
        System.out.println(ff);
    }
    void m6()
    {
        System.out.println("HELLO");
    }
    
}

class C extends Abs

{
    C()
    {
        super(new D(Abs.sc.nextInt()));
    }
    public void m2(int aa)
    {
        System.out.println(aa);
    }
    public void m4(float ff)
    {
        System.out.println(ff);
    }
    void m6()
    {
        System.out.println("HELLO");
    }
    
}

class D
{
    D(int a)
    {
        System.out.println(a);
    }
    static void m7(int a)
    {
        System.out.println(a);
    }
    void m8()
    {
        System.out.println("M7");
    }
    
}

public class JanMock1Q
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    I1.m1(sc.nextInt());
	    I2.m3(sc.nextFloat());
	    
	    B o=new B();
	    o.m2(sc.nextInt());
	    o.m4(sc.nextFloat());
	    o.m6();
	    
        C c=new C();
	    c.m2(sc.nextInt());
	    c.m4(sc.nextFloat());
	    c.m6();
	    c.m5(sc.nextInt());
	    
	    D d=new D(sc.nextInt());
	    D.m7(sc.nextInt());
	    d.m8();
	    
	}
}
