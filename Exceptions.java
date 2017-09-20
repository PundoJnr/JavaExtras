/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;
/*An exceptioon is a problem that occurs during program execution, they cause termination of the program.
 Exception handling on the other hand is a mechanism that handles runtime errors to maintain normal application flow.

 An exception can be caught using try catch keywords, this block is placed around the code hat might generate and exception.

 Multiple exceptions - the throw keyword allows you to manually generate exceptions from your methods
 some of the numerous available exception types include, IndexOutOfBoundsException,IllegalArgumentException 
A single try block can contain multiple catch blocks and handle different exceptions differently*/

/**
 *
 * @author Pundo
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static int main(String[] args) {
        /*try{
         int a []= new int [2];
         System.out.println(a[5]);
         }catch (Exception e){
         System.out.println(e);
         }*/
        int a = 0;
        int b = 0;
      //  int div(a,b) throws ArithmeticException
        {
            if (b == 0) {
                throw new ArithmeticException("Division by Zero, Math error!!");
            } else {
                return a / b;
            }
        }
    }

}
