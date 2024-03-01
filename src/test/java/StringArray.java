
public class StringArray {
	public static void main(String[] args) {
		String str = "Ram Prasad Maurya Kumar Singh";
		String[] arr = str.split(" ");
		int len = arr.length;
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		for(int i=len-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
		
//		String[] strArr = {"Ram","Prasad","Maurya"};
//	    int len1=strArr.length;
//	    for(int i=len1-1;i>=0;i--) {
//	    	System.out.print(strArr[i]+" ");
//	    }
	}
}
