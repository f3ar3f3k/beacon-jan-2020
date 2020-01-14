package sg.gov.cpf.javafoundation.module18.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipTryResources {

	public static void main(String[] args) {

		String sourceFile = "C:\\Users\\diana.rose.u.montero\\Desktop\\test1.txt";
		File fileToZip = new File(sourceFile);
		try (FileOutputStream fos = new FileOutputStream("compressed.zip");
				ZipOutputStream zipOut = new ZipOutputStream(fos);
				FileInputStream fis = new FileInputStream(fileToZip);

		) {

			ZipEntry zipEntry = new ZipEntry(fileToZip.getName());

			zipOut.putNextEntry(zipEntry);

			byte[] bytes = new byte[1024];

			int length;

			while ((length = fis.read(bytes)) >= 0) {
				zipOut.write(bytes, 0, length);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
