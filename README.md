public class test{
public static void main(String[] args){
Scanner read= new Scanner(System.in);
String str= read.nextLine();
String reverse= "";
for(int i= str.length()-1; i>=0; i--){
reverse= reverse + str.charAt(i);
}
System.out.println("Reverse of the given string is " +reverse);
int x,y,count1,count2;
for(i=0;i<arr.length-1;i++){
if(str[i]='a'||str[i]='A'||str[i]='E'||str[i]='e'||str[i]='I'||str[i]='i'||str[i]='O'||str[i]='o'||str[i]='U'||str[i]='u'){
x=count1++;
}
else{
y=count2++;
}
system.out.println("the given string contains" + v +"vowels and" + c +"consonents");
}
}
}



Algorithm-
To reverse the string
1. calculate for the string length.
   Take the last character of the string and concatenate it to a new string(String2).
   Repeat the above two steps and each time concatenate it to the string String2.
   Repeat all these steps using a while loop with a condition stating 'if the string length becomes 0 come out of the loop'.
   Finally display the String2 using a print statement as the reverse of the given string.
    
To count the number of vowels and consonants
2. place an if-else block, check for every character and if it matches with any of 'a', 'e', 'i', 'o', 'u' increment the count1 otherwise increment count2
   Give the vowel and consonant count through their respective counters in print statment.
   (consider count1 for vowel count and count2 for consonant count)
