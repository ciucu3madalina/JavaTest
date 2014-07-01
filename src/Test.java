import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;
public class Test {

	/**
	 * @param args
	 */
	
	static ArrayList<Integer> list1 = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File ("file_name");
		FileReader rd = new FileReader(f);
		File g = new File("out_file");
		FileWriter wr = new FileWriter(g); 
		BufferedReader br = new BufferedReader(rd);
		BufferedWriter bw = new BufferedWriter(wr);
		try{
			String line = br.readLine();
			while(line != null && line.length() != 0){
				System.out.println(line);
				bw.write(line);
				bw.newLine();
				line = br.readLine();
			}
		}catch(IOException m){
			System.out.println("exceptie");
			
		}
		
		
		Random r = new Random();
		for (int i = 0; i<5; i++){
			int x = r.nextInt(10); 
			i++;
			list1.add(x);
		}
		
		Iterator it = list1.iterator();
		
		while (it.hasNext()){
			System.out.println(it.next());
		}
		
		for(Integer x:list1){
			System.out.println(x);
		}
		bw.close();
	}

}
