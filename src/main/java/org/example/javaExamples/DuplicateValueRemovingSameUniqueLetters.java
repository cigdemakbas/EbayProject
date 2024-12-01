package org.example.javaExamples;

public class DuplicateValueRemovingSameUniqueLetters {
    /*
Write a return method that can remove the duplicated values
from String
Ex: removeDup("AAABBBCCC") ==> ABC

     */
       public static String removeDup(String str){
           String unique="";
           for (int i = 0; i < str.length(); i++) {
               if(!unique.contains(""+str.charAt(i)))
                   unique=unique+ str.charAt(i);

           }
           return unique;
       }

    public static void main(String[] args) {
        System.out.println(removeDup("ciggdemm"));
        System.out.println(removeDup("hhhaaalkkeee"));
    }
}
