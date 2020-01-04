package first;

public class Reverse {
	
	 static String ReverseStr(String str){
		String[] words= str.split(" ");
		String rev1= "";
		for(int i=0;i<words.length;i++){
			String word= words[i];
			String rev2= "";
			for(int j= word.length()-1;j>=0;j--){
				rev2= rev2+ word.charAt(j);
				
			}
			rev1= rev1+rev2+" ";
			
		}
		String newString=new String(rev1);
		return newString;
		
		
	} 
	
	

public static void main(String[] args) {
	String str= new String();
	String Res= ReverseStr("This is the world of Java");
	System.out.println(Res);
}
} 
