class recursion1
{
    int count=0;
    void f()
    {
        if(count==3)
        return;
        System.out.println(count);
        count++;
        f();
    }
    public static void main(String args[])
    {
        recursion1 obj=new recursion1();
        obj.f();
    }
}