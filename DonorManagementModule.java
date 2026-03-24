import java.util.*;import java.io.*;

class DonorManagementModule{
static Scanner sc=new Scanner(System.in);
static void register(){
try{
System.out.print("Name: ");sc.nextLine();String name=sc.nextLine();
System.out.print("Age: ");int age=sc.nextInt();sc.nextLine();
if(age<18){System.out.println("Not eligible");return;}
System.out.print("Address: ");String add=sc.nextLine();
System.out.print("Phone: ");String ph=sc.nextLine();
System.out.print("Blood Group: ");String bg=sc.nextLine();
System.out.print("Days since last donation: ");int d=sc.nextInt();sc.nextLine();
if(d<90){System.out.println("Wait 90 days");return;}
System.out.print("Disease (1.HIV 2.AIDS 3.None): ");int dis=sc.nextInt();sc.nextLine();
if(dis!=3){System.out.println("Not eligible");return;}
System.out.print("Medicines? (yes/no): ");String med=sc.nextLine();
if(med.equalsIgnoreCase("yes")){
System.out.print("Hours: ");int h=sc.nextInt();sc.nextLine();
if(h<24){System.out.println("Not eligible");return;}
}
System.out.print("Weight: ");double w=sc.nextDouble();
System.out.print("Haemoglobin: ");double hb=sc.nextDouble();sc.nextLine();
System.out.print("Food eaten in last 6 hours? (yes/no): ");String f=sc.nextLine();
if(f.equalsIgnoreCase("no")){System.out.println("Not eligible");return;}

BloodSeparatorModule.process(bg);
BloodInventoryModule.add(bg);

PrintWriter pw=new PrintWriter(new FileWriter("donor.txt",true));
pw.println(name+" "+bg);
pw.close();

System.out.println("YOU ARE READY TO DONATE BLOOD!");
System.out.println("1 unit "+bg+" -> RBC, Plasma, Platelets");
}catch(Exception e){}
}
}
