class A
{
    private int a,b;
    protected float c,d;
    public int e,f;
    A()
    {
        System.out.println("Inside class A Default constructor");
    }
    A(int a1,int a2)
    {
        this.a = a1;
        this.b = a2;
    }
    int geta()
    {
        return a;
    }
    int getb()
    {
        return b;
    }
}

class B extends A
{
    B()
    {

    }
    B(int a1,int a2,float b1,float b2,int b3,int b4)
    {
        super(a1,a2);
        c = b1;
        d = b2;
        e = b3;
        f = b4;
    }
    void sum()
    {
        System.out.println("In Class B");
        float sum = geta() + getb() + c + d + e + f;
        System.out.println("Sum = " + sum);
    }
}

class C extends B
{
    C(int c1,int c2)
    {
        e = c1;
        f = c2;
    }
    void sum()
    {
        System.out.println("In Class C");
        int sum = e + f;
        System.out.println("Sum = "+ sum);
    }
}

class D extends B
{
    D(float d1,float d2)
    {
        c = d1;
        d = d2;
    }
    void sum()
    {
        System.out.println("In Class D");
        float sum = c + d;
        System.out.println("Sum = "+ sum);
    }
}

class lab2a
{
    public static void main(String args[])
    {

        B obj1 = new B(5,3,(float)(3.0),(float)(5.0),8,3);
        obj1.sum();
        C obj2 = new C(5,6);
        obj2.sum();
        D obj3 = new D((float)3.4,(float)4.5);
        obj3.sum();
    }
}