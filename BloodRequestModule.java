import java.util.*;import java.io.*;

class BloodRequestModule{
static Scanner sc=new Scanner(System.in);
static void request(){
try{
System.out.print("Name: ");sc.nextLine();String name=sc.nextLine();
System.out.print("Blood Group: ");String bg=sc.nextLine();
System.out.println("1.RBC 2.Plasma 3.Platelets");
int type=sc.nextInt();

if(SearchCompatibilityModule.check(bg,type-1,1)){
BloodIssueModule.issue(bg,type-1,1);
PrintWriter pw=new PrintWriter(new FileWriter("needy.txt",true));
pw.println(name+" "+bg);
pw.close();
System.out.println("Collect your blood! Stay safe!");
}else System.out.println("Not available");
}catch(Exception e){}
}
}
