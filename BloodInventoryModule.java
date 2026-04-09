import java.io.*;
import java.util.*;

public class BloodInventoryModule{
static HashMap<String,Integer>rbc=new HashMap<>();
static HashMap<String,Integer>plasma=new HashMap<>();
static HashMap<String,Integer>platelets=new HashMap<>();
static String[]groups={"A+","A-","B+","B-","O+","O-","AB+","AB-"};
static void init(){
for(String g:groups){
rbc.put(g,0);
plasma.put(g,0);
platelets.put(g,0);
}
load();
}
static void add(String g){
rbc.put(g,rbc.get(g)+1);
plasma.put(g,plasma.get(g)+1);
platelets.put(g,platelets.get(g)+1);
save();
}
static boolean check(String g,String t,int u){
if(t.equals("1"))return rbc.get(g)>=u;
if(t.equals("2"))return platelets.get(g)>=u;
return plasma.get(g)>=u;
}
static void reduce(String g,String t,int u){
if(t.equals("1"))rbc.put(g,rbc.get(g)-u);
else if(t.equals("2"))platelets.put(g,platelets.get(g)-u);
else plasma.put(g,plasma.get(g)-u);
save();
}
static void show(){
for(String g:groups){
System.out.println("RBC "+g+" "+rbc.get(g));
System.out.println("Plasma "+g+" "+plasma.get(g));
System.out.println("Platelets "+g+" "+platelets.get(g));
}
}
static void save(){
try{
PrintWriter pw=new PrintWriter(new FileWriter("inventory.txt"));
for(String g:groups){
pw.println(g+" "+rbc.get(g)+" "+plasma.get(g)+" "+platelets.get(g));
}
pw.close();
}catch(Exception e){}
}
static void load(){
try{
BufferedReader br=new BufferedReader(new FileReader("inventory.txt"));
String s;
while((s=br.readLine())!=null){
String[]p=s.split(" ");
rbc.put(p[0],Integer.parseInt(p[1]));
plasma.put(p[0],Integer.parseInt(p[2]));
platelets.put(p[0],Integer.parseInt(p[3]));
}
br.close();
}catch(Exception e){}
}
}
