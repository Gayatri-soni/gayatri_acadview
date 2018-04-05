package project1;
import java.io.*;
import java.util.*;

public class readingpath {
	ArrayList<String> list= new ArrayList<String>();
	public void ReadList(File fl)throws IOException{
		try {
			File[] file;
			file=fl.listFiles();
			//reading elements of directory
			
			for(File f: file) {
				if(f.isDirectory()) {
					list.add("name of Directory:" + f.getAbsolutePath().toString());
					ReadList(f);
				}
				else {
					list.add("name of file:" + f.getAbsolutePath().toString());
				}
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}		
	}
	public void GenerateCsvFile(String path2) {
		try {
			FileWriter writer= new FileWriter(path2);
			for(int i=0;i<list.size();i++) {
				writer.append(list.get(i));
				writer.append(",");
				writer.append("\n");
			}
			System.out.println("Csv File is created..."); 
			writer.flush();
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}						
	}
}