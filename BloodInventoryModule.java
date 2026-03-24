import java.util.*;import java.io.*;

class BloodInventoryModule{
static HashMap<String,int[]>map=new HashMap<>();
static{String[]g={"A+","A-","B+","B-","O+","O-","AB+","AB-"};
for(String s:g)map.put(s,new int[]{0,0,0});load();}

static void add(String bg){
int[]a=map.get(bg);a[0]++;a[1]++;a[2]++;save();
}

static boolean check(String bg,int t,int u){
return map.get(bg)[t]>=u;
}

static void deduct(String bg,int t,int u){
map.get(bg)[t]-=u;save();
}

static void display(){
for(String k:map.keySet()){
int[]a=map.get(k);
System.out.println(k+" RBC:"+a[0]+" Plasma:"+a[1]+" Platelets:"+a[2]);
}
}

static void save(){
try{
PrintWriter pw=new PrintWriter("inventory.txt");
for(String k:map.keySet()){
int[]a=map.get(k);
pw.println(k+" "+a[0]+" "+a[1]+" "+a[2]);
}
pw.close();
}catch(Exception e){}
}

static void load(){
try{
File f=new File("inventory.txt");
if(!f.exists())return;
Scanner sc=new Scanner(f);
while(sc.hasNext()){
String k=sc.next();
int r=sc.nextInt(),p=sc.nextInt(),pl=sc.nextInt();
map.put(k,new int[]{r,p,pl});
}
}catch(Exception e){}
}
}
