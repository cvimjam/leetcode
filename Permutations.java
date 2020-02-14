package leetcode;
public class Permutations {

	private void permute(String str, int left, int right){

		if(left == right){
			System.out.println(str);
		}else{
			for(int i=left; i<= right; i++){
				str = swap(str, left, i);
				this.permute(str, left+1, right);
				str = swap(str, left, i);
			}		
		}

	}

	private String swap(String str, int left, int right){
		char temp;
		char[] array = str.toCharArray();
		temp = array[left];
		array[left]= array[right];
		array[right]=temp;
		return String.valueOf(array);
	}

	public static void main(String[] args){

		String input = "ABCD";
		int size = input.length();

		Permutations p = new Permutations();
		p.permute(input, 0, size-1);	
	}

}
