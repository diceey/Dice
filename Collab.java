import java.util.*;
Scanner kb = new Scanner(System.in);
boolean flag = true;
while(flag == true)
{
System.out.print("Would you like to the roll the dice (Y/N)");
String choice = kb.nextLine();
if (choice.equalsIgnoreCase("y"))
{
  int dice = (int)(Math.random()*7)
  System.out.println("The number you have rolled is " + dice);
  System.out.println("");
}
else if(!choice.equalsIgnoreCase("n"))
{
  System.out.println("You chose to quit, despacito!");
  flag = false;
}
end if
    }
