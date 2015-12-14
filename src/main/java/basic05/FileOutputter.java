package basic05;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputter implements Outputter {
	private String filePath;
	
	public FileOutputter(){
		System.out.println("FileOutputter 생성됨");
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public void output(String msg) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer = new FileWriter(filePath);
		writer.write(msg);
		writer.close();
	}

}
