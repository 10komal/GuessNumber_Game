import java.util.*;//JAVA program for the above application
public class GFG
{
 //funtion that implement the number guessing game
public static void guessingNumberGame()
{
 //Scanner class 
 Scanner sc=new Scanner (System.in);
 //Genterate the numbers
 int number=1+(int)(100*Math.random());
 //Given K trials
 int k=5;
 int i,guess;
 System.out.println("A number is choosen"+"between 1 to 100"+"guess the number with in five trials");
 // iterate over k trials
 for(i=0;i<k;i++)
 {
    System.out.println("guess the number:");
    //take input for guessing
    guess=sc.nextInt();
    //if the number is guessed
    if(number==guess)
    {
        System.out.println("Congutulation you guessed the number");
        break;
    }
   else if(number<guess && i!=k-1)
   {
    System.out.println("number is less than the "+guess);
   }
   else if(number>guess && i!=k-1)
   {
    System.out.println("number is greate than the "+guess);
   }
 }
 if(i==k)
 {
    System.out.println("you have exhausted "+"k trials.");
    System.out.println("The number is "+number);
 }
}
public static void main(String args[])
{
    guessingNumberGame();
    
}
}