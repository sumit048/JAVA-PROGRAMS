import java.io.File;
import java.util.*;
public class Fileop {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the File Name : ");
		String fname = obj.next();
		File f = new File(fname);
		f.setWritable(true);
		System.out.println(f.exists() ? "File Exists " : "File does not Exist");
		System.out.println(f.canWrite() ? "File is Writable " : "File is not Writable");
		System.out.println(f.canRead() ? "File is Readable" : "File is not Readable");
		String filename = f.toString();
		int index = filename.lastIndexOf('.');
		if(index>0) {
			String type = filename.substring(index+1);
			System.out.println("File type is : "+type);
		}
		else
			System.out.println("File does not have type");
		System.out.println("File size : "+f.length()+"Bytes");
		
		}
	}

