import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class tennis {

	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		
		try(BufferedReader br = new BufferedReader(new FileReader("bin/input.txt"))){
		
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			
			while(line != null){
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
				
			}
			String tennis = sb.toString();
			
			System.out.println(tennis);
			
		}
	}

}
