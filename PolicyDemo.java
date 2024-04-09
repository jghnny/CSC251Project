import java.util.Scanner;

public class PolicyDemo 
{   
   public static void main(String[] args)
   {
      //declare variables
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      Scanner keyboard = new Scanner(System.in);
   
      //prompt the user to enter information about the Policy 
      int policiesNum = 0;
      int smokerNum = 0;
      int nonSmokerNum = 0;
    do{
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextLine();
            
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      
      if smokingStatus.equalsIgnoresCase("smoker")
      {
         smokerNum++;
      } 
      else
      {
         nonSmokerNum++;
      }
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
      
      //create a Policy object
      PolicyHolder policyHolder = new PolicyHolder(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      Policy policy = new policy(price);
      
      //put a blank line before the output
      System.out.println();
      
      //display information about the Policy
      /*System.out.println("Policy Number: " + policyHolder.getPolicyNumber());
      System.out.println("Provider Name: " + policyHolder.getProviderName());
      System.out.println("Policyholder's First Name: " + policyHolder.getFirstName());
      System.out.println("Policyholder's Last Name: " + policyHolder.getLastName());
      System.out.println("Policyholder's Age: " + policyHolder.getAge());
      System.out.println("Policyholder's Smoking Status: " + policyHolder.getSmokingStatus());
      System.out.println("Policyholder's Height: " + policyHolder.getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policyHolder.getWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", policyHolder.getBMI());
      System.out.printf("Policy Price: $%.2f\n", policy.getPrice());
      System.out.print("\nDo you wish to enter information for another account? (Y/N): ");*/
      System.out.println(policyHolder);
      answer = keyboard.nextLine();
      policies++;
      }while (answer.equalsIgnoreCase("Y"));
      System.out.println("\n" + "There were " + policies + " policy objects created.");
      System.out.println("\n" + "The number of policies with a smoker is: " + smokerNum);
      System.out.println("\n" + "The number of policies with a non-smoker is: " + nonSmokerNum);      
   }
}