//--------------------- Build A Droid ---------------

public class Droid{
String name;
int batteryLevel=100;

public Droid(String droidName){
  name = droidName;
}

public String toString(){
  return  "Hello, I’m the droid: " + name + "!";
}

public void performTask(String task){
  System.out.println(name +" is performing task: " + task);
  batteryLevel = batteryLevel - 10;
}

public void energyReport(){
  System.out.println("Courent Batery Level: " + batteryLevel);
}

public static void main (String[] args){
  Droid codey = new Droid("Codey");
  System.out.println(codey);
  codey.performTask("dancing");
  codey.energyReport();
  codey.performTask("levitating");
  codey.energyReport();

}

}