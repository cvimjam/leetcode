package leetcode;
import java.util.List;
import java.util.ArrayList;

public class Permutations_1{

	static List<String> perms;

	void permute(char[] str, int low){
		
		if(low == str.length-1){
			System.out.println(str.toString());
			//perms.add(str.toString());
		}else{
			for(int i=low; i < str.length; i++){
			
			swap(str, 0, i);
			
			permute(str, low+1);

			swap(str, 0, i);

			}	
		}	
	}

	void swap(char[] str, int i, int j){
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}

	public static void main(String[] args){
		
		perms = new ArrayList<String>();

		System.out.println(args[0]);
		System.out.println("============");
		String str = new String("ABCDEF");
		Permutations_1 p = new Permutations_1();
		p.permute(args[0].toCharArray(), 0);
		
		//System.out.println(perms);

		//perms.forEach(s -> System.out.println(s));
		//perms.forEach(System.out.println);
	}
}
