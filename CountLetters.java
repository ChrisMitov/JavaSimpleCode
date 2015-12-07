import java.util.Arrays;

public class CountLetters {

	public static void main(String[] args) {
		String str = "aabbccssaaiimmssikakskaksoqwklwdnc njkzxcjasdjnaskylasdwoiwdqiofejnbtrewqvnioznxasmeapalsdfjfjk";
		int[] arr  = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 'a' && c<= 'z'){
				arr[c-'a']++;
			}
		}
		int maxSum = 0;
		for (int i = 0; i < arr.length; i++) {
			char c = (char) (i+'a');
			System.out.println(c+ " : "+arr[i]);
			if(maxSum < arr[i]){
				maxSum = arr[i];
			}
		}
		System.out.println("Максималната сума е: "+ maxSum);
	}
}
