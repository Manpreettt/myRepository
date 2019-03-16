import java.util.*;
class Employee {
String empid;
String name;
public Employee(String empid, String name) {
this.empid = empid;
this.name = name;
}

public static void main(String args[]) {
Employee emp[] = new Employee[5];
emp[0] = new Employee("01", "a");
emp[1] = new Employee("02", "b");
emp[2] = new Employee("03", "c");
emp[3] = new Employee("04", "d");
emp[4] = new Employee("05", "e");

Scanner s = new Scanner(System.in);
System.out.println("Enter id");
String id = s.next();

for(Employee e:emp) {
if(e.empid.equals(id))
System.out.println(e.name);
}

}
}