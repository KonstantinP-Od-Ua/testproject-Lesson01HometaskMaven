package org.kostya.lesson1hometaskmaven;

import com.google.common.base.Stopwatch;

public class SolZveriRecursiveMethod {
	public static int counter=0;
	
   final static String s = "1234567890";
	    public static void permute(String s) {
	    	
	        permute(s.toCharArray(), 0, s.length() - 1);
	        
	    }

	    public static void permute(char[] a, int l, int r) {
	    	
	    	int[] n= new int[s.length()];
		    
	        int i;
	        if (l == r) { 
	        	for (int i3 = 0; i3 < s.length(); i3++) 
	        	   n[i3] = a[i3] - '0';
	        	
	        		
	       if(n[0]*1000+n[1]*100+n[2]*10+n[3]+n[4]*1000+n[5]*100+n[0]*10+n[6]==n[7]*10000+n[4]*1000+n[8]*100+n[9]*10+n[1]){
	        			
	    	   counter++;    
System.out.printf("%d.%d%d%d%d+%d%d%d%d=%d%d%d%d%d%n",counter,n[0],n[1],n[2],n[3],n[4],n[5],n[0],n[6],n[7],n[4],n[8],n[9],n[1]);
	        			
	       }
	        	
	            
	        	
	        } else {
	            for (i = l; i <= r; i++) {
	                swap(a, l, i);
	                permute(a, l+1, r);
	                swap(a, l, i); 
	            }
	        }
	    }

	    public static void swap(char[] a, int i1, int i2) {
	        char tmp = a[i1];
	        a[i1] = a[i2];
	        a[i2] = tmp;
	    }

	    public static void main(String args[]) {
	    	
	    	Stopwatch stopwatch = Stopwatch.createStarted();
	        
	        permute(s);
	        System.out.printf("Solutions number: %d%n",counter);
	        System.out.println("Time used: "+stopwatch);
	    }
	
	}
	
	