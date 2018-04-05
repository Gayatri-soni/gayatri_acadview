package project1;

import java.io.*; 
import java.util.*;

public class driverclass {
    public static void main(String[] args)throws IOException {
    	//for having an input from user
    	Scanner sc= new Scanner (System.in);
    	System.out.println("enter the path");
    	String path = sc.nextLine();
    	
    	//creating new file
    	File f= new File(path);
   	    sc.close();
   	    String path1="";
   	    String path2="";
   	    
   	    //to separate the different paths
   	    if(f.exists()) {
   	    	FileReader reader = new FileReader(f);
   	    	int c;
   	    	while((c=reader.read())!=10) {
   	    	path1+= (char) c;
   	    	}
   	    	path1 = path1.substring(0,path1.length()-1);
   	    	while((c=reader.read())!= -1) {
   	    	path2+= (char) c;
   	    	}
   	    	reader.close();
   	    }
   	    else {
   		System.out.println("you entered a wrong path");
   	    }
//	   	System.out.println(path1);
//	   	System.out.println(path2);	
	    File fl=new File(path1);
	    //System.out.println(fl.exists());
	    readingpath r = new readingpath();
	    r.ReadList(fl);
	    r.GenerateCsvFile(path2);
    }
}
    
    
   	
    
   	 
   	
  
    


