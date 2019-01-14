import java.io.*;
import java.util.Scanner;

public class HelloTestJava {

    static void reverseEachWordOfString(String inputString){
        //Solution 1
        String[] words = inputString.split(" ");
        String reverseString = "";

        for (int i = 0; i < words.length; i++){
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--){
                reverseWord = reverseWord + word.charAt(j);
            }
            if(!reverseString.equals("")){
               reverseString = reverseString + " ";
            }
            reverseString = reverseString + reverseWord;
        }
        System.out.println(inputString);
        System.out.println(reverseString);
    }

    static void reverseEachWordStringBuffer(String inputString){
        //Solution 2
        String[] temp;
        StringBuffer reverseString = new StringBuffer("");
        StringBuffer reverseWord;
        String delimiter = " ";

        temp = inputString.split(delimiter);
        for(int i=0;i<=temp.length-1;i++){
            reverseWord = new StringBuffer(temp[i]).reverse();
            reverseString.append(reverseWord);
            reverseString.append(" ");
        }

        System.out.println("String:" + inputString);
        System.out.println("Reverse String:" + reverseString);
    }

    static void reverseCompleteString(){
        //Solution 3
        StringBuffer buffer = new StringBuffer("Game Plan");
        buffer.reverse();
        System.out.println(buffer);
    }

    static void reverseSentence(){
        String str[] = "He is the one".split(" ");
        String finalStr="";
        for(int i = str.length-1; i>= 0 ;i--){
            finalStr += str[i]+" ";
        }
        System.out.println(finalStr);
    }

    public static void main(String[] args){
        System.out.println("----reverseEachWordOfString----");
        reverseEachWordOfString("I am string not reversed");
        System.out.println("----reverseEachWordStringBuffer--");
        reverseEachWordStringBuffer("Reverse Me");
        System.out.println("----reverseCompleteString----");
        reverseCompleteString();
        System.out.println("----reverseSentence-----");
        reverseSentence();
    }
}

