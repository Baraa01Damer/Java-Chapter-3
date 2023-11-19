package TimeCalculator;

import java.util.Scanner;

public class TimeCalculator
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    int Secs = 0;
    int Mins;
    int Hrs;
    int Days;

    System.out.print("Enter the amount of seconds: ");
    Secs=input.nextInt();

    Days=Secs/86400;
    Secs=Secs%86400;
    Hrs=Secs/3600;
    Secs=Secs%3600;
    Mins=Secs/60;
    Secs=Secs%60;

    System.out.printf("The time is %d Days, %d hours, %d mins, %d secs.\n", Days, Hrs, Mins, Secs);
  }
}