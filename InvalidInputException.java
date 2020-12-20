public class InvalidInputException extends Exception{
   /*
   * This is one argument constructor.
   * It will invoke the super class one argument constructor
   * */
   public InvalidInputException(String input){
       super(input);
       System.out.println(input+" is not valid input");
   }

}