/*
 Problem Statement
You are given a string that may contain duplicate characters. Your task is to write a function that removes all duplicate characters from the string while preserving the order of the first occurrences of each character.
 */
public class removeDuplicates {
 public static void duplicates(String str,int idx, StringBuilder newStr, boolean map[]) {
  if(idx==str.length()){
    System.out.println(newStr);
    return;
  }
  char ch=str.charAt(idx);
  if(map[ch-'a']==true){
    duplicates(str, idx+1, newStr, map);
  }
  else{
    map[ch-'a']=true;
    duplicates(str, idx+1, newStr.append(ch), map);
  }
  
 }
  public static void main(String[] args) {
  String str="appnnacollege";
  duplicates(str, 0, new StringBuilder(""), new boolean[26]);
 } 
}
