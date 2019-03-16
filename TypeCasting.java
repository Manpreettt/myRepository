//Write a program to declare all primitive data types with all possible types of initialization and also check implicit and explicit type casting by assigning them to each other.

class TypeCasting {
public static void main(String args[]) {

//implicit
byte b = 100;
short s = b;
System.out.println(s);
//explicit 
byte b2 = (byte)s;
System.out.println(b2);

//implicit
short s1 = 250;
int i = s1;
System.out.println(i);
//explicit 
short s2 = (short)i;
System.out.println(s2);

//implicit
int i1 = 250000;
long l = i1;
System.out.println(l);
//explicit 
int i2 = (int)l;
System.out.println(i2);

//implicit
long l1 = 250000000l;
float f = l1;
System.out.println(f);
//explicit 
long l2 = (long)f;
System.out.println(l2);

//implicit
float f1 = 255555555.00025038752f;
double d = f1;
System.out.println(d);
//explicit 
float f2 = (float)d;
System.out.println(f2);

//implicit
int a = 10;
char c = 'c';
int sum = a + c;
System.out.println(sum);
//explicit
char c1 = (char) (a + c);
System.out.println(c1);

}
}