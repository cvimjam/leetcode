package leetcode;
public class Substrings{

    void subStrings(String str){

        for(int len=1; len <= str.length(); len++){

            for(int i=0; i <= str.length()-len; i++){

                System.out.println(str.substring(i, i+len));

            }

        }

    }


	public static void main(String[] args){
		Substrings p = new Substrings();
		p.subStrings(args[0]);	
    }

}