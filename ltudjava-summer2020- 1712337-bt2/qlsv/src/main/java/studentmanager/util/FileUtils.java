package studentmanager.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class FileUtils {
	public static<T> void saveObject(T t, String fileName){
		String jsonString = new Gson().toJson(t);
    	File file= new File(fileName);
    	if(!file.exists()){
    		try {
				file.createNewFile();
				FileOutputStream fos;
				try {
					fos = new FileOutputStream(file);
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			    	bw.write(jsonString);
			    	bw.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
	}
	
	public static<T> T getObject(Class<T> t, String fileName) {
		String dataString = null;
		try {
		      File myObj = new File(fileName);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        dataString = myReader.nextLine();
		        System.out.println(dataString);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		return new Gson().fromJson(dataString, t);
	}
}
