
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class goodieDilemma {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		File file=new File("G:\\FSWD\\Java programs\\Highpeak1\\src\\input.txt");//input file location
		BufferedReader bf = new BufferedReader(new FileReader(file));
		String[] tempArray = null;
		String[][] a=new String[11][2];
		String[][] b=new String[11][2];
		int[] c=new int[10];
		int p,q=0,k=0;
			String st;
			  while ((st = bf.readLine()) != null) {
				  tempArray = st.split(":");//Splitting input into two part
				  for(int i=0;i<tempArray.length;i++) {
					  for(int j=k;j<k+1;j++) {
						  a[j][i]=tempArray[i];
						  b[j][i]=tempArray[i];
					  }
				  }
				  k++;
			  }
			  int n=Integer.parseInt(a[0][1]);  
			  for(int i=0;i<b.length-1;i++) {
				  
				  c[i]=Integer.parseInt(a[i+1][1]); //storing string value to integer array variable
			  }
			  Arrays.sort(c); //Sorting
			  int min=999999999; 
			  for(int i=c.length-1;i>=n-1;i--) { // Calculation of minimum difference
				  if(min>c[i]-c[i-1-n+2]) {
					  min=c[i]-c[i-1-n+2];
					  p=i;
					  q=i-1-n+2;
				  }
				  
			  }
			  
			  PrintStream o = new PrintStream(new File("G:\\FSWD\\Java programs\\Highpeak1\\src\\output.txt"));// output file location
			    // Displaying output in file
		        System.setOut(o);
		        System.out.println("The goodies selected for distribution are:"+"\n");
			  
		        for(int i=0;i<n;i++) {
		        	for(k=1;k<a.length;k++) {
						 if(Integer.parseInt(a[k][1])==c[q]) {
							  System.out.println(a[k][0]+": "+c[q]);
						 } 
					}
		        	q++;
		        }
		        System.out.println("And the difference between the chosen goodie with highest price and the lowest price is "+min);	   	
	}

}
