package sg.gov.cpf.javafoundation.module18.unzip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Unzip {

	public static void main(String[] args) throws IOException {

		String fileZip ="compressed.zip";
		
		File destDir =new File("unzipTest");
		
		if(!destDir.exists()) {
			destDir.mkdirs();
		}
		
		byte [] buffer = new byte [1024];
		
		ZipInputStream zis = new ZipInputStream(new FileInputStream(fileZip));
		
		ZipEntry zipEntry =zis.getNextEntry();
		
		while(zipEntry!=null) {
			File newFile=newFile(destDir, zipEntry);
			
			FileOutputStream fos = new FileOutputStream(newFile);
		
		int len;
		
		while((len=zis.read(buffer))>0) {
			fos.write(buffer,0,len);
		}
		
		fos.close();
		zipEntry=zis.getNextEntry();
		}
		
		zis.close();

	}
	
	public static File newFile(File destinationDir, ZipEntry zipEntry) throws IOException{
		
		File destFile = new File(destinationDir, zipEntry.getName());
		
		String destDirPath=destinationDir.getCanonicalPath();
		String destFilePath= destFile.getCanonicalPath();
		
		System.out.println(destFilePath + "--" +destDirPath + File.separator);
		
		if (!destFilePath.startsWith(destDirPath + File.separator)) {
			throw new IOException("Entry is ouside the target directory" + zipEntry.getName());
			
		}
		return destFile;
	}

}
