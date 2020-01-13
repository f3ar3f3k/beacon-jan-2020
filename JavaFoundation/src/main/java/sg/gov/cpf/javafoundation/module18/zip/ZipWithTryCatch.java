package sg.gov.cpf.javafoundation.module18.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipWithTryCatch {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = null;
		ZipOutputStream zipOut= null;
		FileInputStream fis = null;
		
		try {
			
			String sourceFile = "C:\\Users\\diana.rose.u.montero\\Desktop\\test1.txt";
			
			fos = new FileOutputStream("compressed.zip");
			
			zipOut =new ZipOutputStream(fos);
			
			File fileToZip = new File(sourceFile);
			fis =new FileInputStream(fileToZip);
			
			ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
			
			zipOut.putNextEntry(zipEntry);
			
			byte[] bytes = new byte[1024];
			
			int length;
			
			while((length=fis.read(bytes)) >=0){
				zipOut.write(bytes,0,length);
			}	
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally {
			//close all output and input streams
			if (zipOut!=null) {
				zipOut.close();
			}
			if (fis!=null) {
				fis.close();	
			}
			if (fos !=null) {
				fos.close();
			}
		}
		

	}

}
