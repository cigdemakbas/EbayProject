package org.example.javaExamples.okPackage;

import java.util.Arrays;
import java.util.TreeSet;

public class AnagramTwoStrings {
    // isAnagram("listen", "silent")     -> true
    // isAnagram("triangle", "integral") -> true
    // isAnagram("abc", "bca")           -> true
    // isAnagram("abc", "ccb")           -> false
    // isAnagram("aaa", "aaab")          -> false
  public boolean isAnagram(String str, String str1){
      // convert both String to char[]
      char[] arrStr= str.toCharArray();
      char[] arrStr1=str1.toCharArray();

      // sort both char[] arrays
      Arrays.sort(arrStr);
      Arrays.sort(arrStr1);

      return Arrays.equals(arrStr1,arrStr);
  }

    public static void main(String[] args) {
        AnagramTwoStrings m= new AnagramTwoStrings();
        System.out.println(m.isAnagram("abc","bca"));
        System.out.println(m.isAnagram("hdk","jkd"));
        System.out.println(m.isAnagram("triangle","integral"));
        System.out.println(m.same("demin","medin"));
    }

    // Solution 2:

    public boolean same(String str1, String str2){
      str1= new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
      str2= new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
      return str1.equals(str2);
    }
}
