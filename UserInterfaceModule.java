import java.util.*;

class UserInterfaceModule{
static Scanner sc=new Scanner(System.in);
static int menu(){
System.out.println("1.Donor");
System.out.println("2.Blood Needer");
System.out.println("3.Hospital");
System.out.println("4.Admin");
System.out.print("Enter choice: ");
return sc.nextInt();
}
}
