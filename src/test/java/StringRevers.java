
public class StringRevers {
	public static void main(String[] args) {
//	  String str="My name is Aman";
	  String str = "Manglam";
	  String str1 = "Ram Singh";
//    String [] arr=str.split(" ");
//    int len=arr.length;
//    for(int i=len-1;i>=0;i--) {
//    System.out.print(arr[i]+" ");
//    }
		
//     char c[]=str1.toCharArray();
//     int len=c.length;
//     for(int i=0;i<len;i++) {
//    	 System.out.print(c[i]);
//     }
     
     System.out.println();
     System.out.println();
     
//   Reverse 
     int len1=str1.length();
//     for(int x=len1-1;x>=0;x--) {
//    	 System.out.print(c[x]);
//     }
     
     System.out.println();
     System.out.println();
     
     for(int i=len1-1;i>=0;i--) {
    	 System.out.print(str1.charAt(i)); 
     }

//  Reverse using StringBuilder
//	StringBuilder sb=new StringBuilder(str);
//	System.out.println(sb.reverse());
//	StringBuilder sb1=new StringBuilder(str1);
//	System.out.println(sb1.reverse());

//	StringBuffer sf=new StringBuffer(str);
//	System.out.println(sf.reverse());
//	StringBuffer sf1=new StringBuffer(str1);
//	System.out.println(sf1.reverse());

	}
}
