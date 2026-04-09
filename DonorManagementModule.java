import java.io.*;
import java.util.*;

public class DonorManagementModule{
static Scanner sc=new Scanner(System.in);
static void process(){
System.out.println("Enter name:");
String name=sc.nextLine();
System.out.println("Enter age:");
int age=sc.nextInt();sc.nextLine();
if(age<18){System.out.println("Not eligible");return;}
System.out.println("Enter address:");
String add=sc.nextLine();
System.out.println("Enter phone:");
String ph=sc.nextLine();
System.out.println("Blood group:");
String bg=sc.nextLine();
System.out.println("Days since last donation:");
int d=sc.nextInt();sc.nextLine();
if(d<90){System.out.println("Not eligible");return;}
System.out.println("Any disease? (1.HIV 2.AIDS 3.None):");
int dis=sc.nextInt();sc.nextLine();
if(dis==1||dis==2){System.out.println("Not eligible");return;}
System.out.println("On medicines? (yes/no):");
String med=sc.nextLine();
if(med.equalsIgnoreCase("yes")){
System.out.println("Hours since last dose:");
int h=sc.nextInt();sc.nextLine();
if(h<24){System.out.println("Not eligible");return;}
}
System.out.println("Weight:");
int w=sc.nextInt();sc.nextLine();
System.out.println("Haemoglobin:");
double hb=sc.nextDouble();sc.nextLine();
System.out.println("Food eaten in last 6 hrs? (yes/no):");
String food=sc.nextLine();
if(food.equalsIgnoreCase("no")){System.out.println("Not eligible");return;}
System.out.println("YOU ARE READY TO GIVE BLOOD! COLLECT YOUR CERTIFICATE!");
BloodInventoryModule.add(bg);
save(name,bg);
System.out.println("1 unit of "+bg+" -> 1 Plasma");
System.out.println("1 RBC");
System.out.println("1 Platelet");
}
static void save(String n,String bg){
try{
PrintWriter pw=new PrintWriter(new FileWriter("donors.txt",true));
pw.println(n+" "+bg);
pw.close();
}catch(Exception e){}
}
}
