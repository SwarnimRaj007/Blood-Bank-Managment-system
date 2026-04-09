import java.util.*;

public class UserInterfaceModule{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
BloodInventoryModule.init();
while(true){
System.out.println("1.Donor 2.Blood Receiver 3.Hospital 4.Admin 5.Exit");
int ch=sc.nextInt();sc.nextLine();
if(ch==1)DonorManagementModule.process();
else if(ch==2)BloodRequestModule.process();
else if(ch==3)BloodRequestModule.hospital();
else if(ch==4)BloodRequestModule.admin();
else break;
}
}
}
