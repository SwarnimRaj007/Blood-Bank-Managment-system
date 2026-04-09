import java.io.*;
import java.util.*;

public class BloodRequestModule{
static Scanner sc=new Scanner(System.in);
static void process(){
System.out.println("Enter name:");
String name=sc.nextLine();
System.out.println("Enter age:");
int age=sc.nextInt();sc.nextLine();
System.out.println("Enter address:");
String add=sc.nextLine();
System.out.println("Enter phone:");
String ph=sc.nextLine();
System.out.println("What do you want? 1.RBC 2.Platelets 3.Plasma:");
String t=sc.nextLine();
System.out.println("Blood group:");
String bg=sc.nextLine();
if(BloodInventoryModule.check(bg,t,1)){
BloodInventoryModule.reduce(bg,t,1);
save(name,bg,t);
System.out.println("Collect your blood! May God bless you!");
}else System.out.println("Not available");
}
static void hospital(){
System.out.println("1.RBC 2.Platelets 3.Plasma:");
String t=sc.nextLine();
System.out.println("Blood group:");
String bg=sc.nextLine();
System.out.println("Units:");
int u=Integer.parseInt(sc.nextLine());
if(BloodInventoryModule.check(bg,t,u)){
BloodInventoryModule.reduce(bg,t,u);
System.out.println("Issued");
}else System.out.println("Not enough stock");
}
static void admin(){
System.out.println("Enter ID:");
String id=sc.nextLine();
System.out.println("Enter Password:");
String p=sc.nextLine();
if(!(id.equals("admin123")&&p.equals("123456"))){
System.out.println("Invalid");
return;
}
System.out.println("1.Donors 2.Receivers 3.Inventory");
int ch=Integer.parseInt(sc.nextLine());
if(ch==1)show("donors.txt");
else if(ch==2)show("receivers.txt");
else BloodInventoryModule.show();
}
static void save(String n,String bg,String t){
try{
PrintWriter pw=new PrintWriter(new FileWriter("receivers.txt",true));
pw.println(n+" "+bg+" "+t);
pw.close();
}catch(Exception e){}
}
static void show(String f){
try{
BufferedReader br=new BufferedReader(new FileReader(f));
String s;
while((s=br.readLine())!=null)System.out.println(s);
br.close();
}catch(Exception e){}
}
}
