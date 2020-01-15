import java.util.*;
class ex3{
	static String apply_transform(String s){
		char a=s.charAt(0);
		int i;
		if(a=='a' || a=='e' ||a=='i' ||a=='o' ||a=='u'){
			s=s+"way";
		}
		else{
			int vow_yes=-1;
			for(i=0;i<s.length();i++){
				a=s.charAt(i);
				if(a=='a' || a=='e' ||a=='i' ||a=='o' ||a=='u'){
					vow_yes=i;
					break;
				}
			}
			if(vow_yes!=-1){
				String sub=s.substring(vow_yes,s.length()),sub_a=s.substring(0,vow_yes);
				
				s=sub+sub_a+"ay";
			}
			else{
				s=s+"ay";
			}
		}
		return s;
	}
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		String s;
		s=sc.nextLine();
		int i;
		/*char a=s.charAt(0);
		if(a=='a' || a=='e' ||a=='i' ||a=='o' ||a=='u'){
			s=s+"way";
		}
		else{
			int vow_yes=-1;
			for(i=0;i<s.length;i++){
				a=s.charAt(i);
				if(a=='a' || a=='e' ||a=='i' ||a=='o' ||a=='u'){
					vow_yes=i;
					break;
				}
			}
			if(vow_yes!=-1){
				
			}
		}
		System.out.println(s);*/
		String[] arr=s.split(" ",0);
		String ans="";
		for(i=0;i<arr.length;i++){
			//System.out.println(arr[i]);
			//ans=ans+arr[i];
			ans=ans+apply_transform(arr[i])+" ";
		}		
		System.out.println(ans);
	}
}
