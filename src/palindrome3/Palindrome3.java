/*
 * Evan Robertson
 * February 24 2020
 * Palindrome3.java
 * This program takes any sentence and reverses it to check if the entire sentence
 * is a palindrome
 */

package palindrome3;

import javax.swing.JOptionPane;

/**
 *
 * @author evrob0095
 */
public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palindrome = JOptionPane.showInputDialog("Enter a word to check");
        char[] arr = new char[palindrome.length()];
        for(int i = 0; i < palindrome.length(); i++){
            if (palindrome.charAt(i) != ' ') {
                arr[i] = palindrome.charAt(i);
            } else {
            } 
        }
        System.out.println(arr);
        String newString = "";
        String oldString = "";
        for(int i = 0; i < palindrome.length(); i++){
            newString = arr[i] + newString;
            System.out.println(newString);
            oldString = oldString + arr[i];
            System.out.println(oldString);
        }
        System.out.println(newString);
        System.out.println(oldString);
        if (newString.equals(oldString)) {
            JOptionPane.showMessageDialog(null, "Your word(s): " + palindrome + ", "
                    + "is the same when reversed and is therefore a palindrome");
        }
        else {
            JOptionPane.showMessageDialog(null, "Your word(s): " + palindrome + ", "
                    + "is not the same when reversed and is therefore is not a palindrome");
        }
    }
    
}
