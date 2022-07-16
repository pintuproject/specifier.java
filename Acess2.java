class Acess2{
 private int a=12;
private void show()
{
System.out.println(a);
}
}
class b extends Acess2{
public static void main(String args[])
{
b ob=new b();
System.out.println(ob.a);//can not acess because int is private
}
}