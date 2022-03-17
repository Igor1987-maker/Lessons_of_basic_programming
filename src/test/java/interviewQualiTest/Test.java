package interviewQualiTest;

public class Test {

	public static void main(String[] args) {
		
		int [] A = {-1,-3};	
		int res = solution(A);
System.out.println(res);

boolean stringRes = solution1("aabbb");
System.out.println(stringRes);

int i = solution3("111");
System.out.println(i);
	}

	 public static int solution(int[] A) {
	     boolean b = true; 
		 for(int i=1;i<=Integer.MAX_VALUE;i++) {
			 b=true;
			 for(int j=0;j<A.length;j++) {
				 if(i==A[j]) {
					 b=false;
					 break;
				 }
				 
			 }
			 if(b==true) {
				 return i;
			 }
		 }
		 return -1;
	    }
	 public static boolean solution1 (String S) {
	     int firstA = -1; 
	     int firstB = -1;
		 boolean a = false;
		 boolean b = false;
		 for(int i = 0; i<S.length();i++) {
			 if(S.charAt(i)=='a') {
				 a=true;
				 firstA = i;
				 break;
			 }
		 }
		 if(a==false) {
			 return true;
		 }
		 for(int i = 0;i<S.length();i++) {
			 if(S.charAt(i)=='b') {
				 b = true;
				 firstB = i;
				 break;
			 }
		 }
		 if(b==false) {
			 return true;
		 }
		 for(int i = firstB+1;i<S.length();i++ ) {
			 if(S.charAt(i)=='a') {
				 return false;
			 }
		 }
		 return true;
	    }
	
	 
	 public static int solution3(String S) {
		 int decimal = 0;
		 try {
	     decimal = Integer.parseInt(S,2);
		 }
		 catch(Exception e){
			 return 799999;
		 }
				 int count = 0;
		 do {
			 if(decimal%2!=0) {
				 decimal -= 1; 
				 count++;
			 }
			 decimal /=2;
			 if(decimal!=0) {
			 count++;
			 }
		 }while(decimal!=0);
		 
		 
		 
		 return count;
	    }
	
}
