
package l8ac2.L8AC2;


public class Adhoc {
    
    private int numberOfWorkingDays;
private int wage;


public Adhoc(String name, String phone, String address, int allowance, int numberOfWorkingDays, int wage) {
   
    super(name, phone, address, allowance);
this.numberOfWorkingDays = numberOfWorkingDays;
this.wage = wage;
}
{
System.out.println("Name: " + name + "Phone Number: " + phone +"Address: " + address
+ "Allowance: " + allowance + "Number Of Working Days: " + numberOfWorkingDays + "Wage: " + wage);
}
}

