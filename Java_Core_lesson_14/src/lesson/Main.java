package lesson;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Main {
 public static void main(String[] args) throws IOException {

	 /*
	 File file = new File("C:\\some\\text.txt");
	 file.mkdirs();*/
	 
	 /* file.createNewFile();*/
	 
	 //file.delete();
	 
	// FileOutputStream fos = new FileOutputStream("text.txt",true);
	/* for (int i = 0; i < 1025; i++) {
		 fos.write(i);
	}*/
	 
//	 fos.write("anton\n".getBytes());
//	 fos.close();
	 
//	 FileWriter fileWriter = new FileWriter("text.txt",true); //для запису з дописом
//	 fileWriter.write("hello\n");
//	 fileWriter.flush();
//	 fileWriter.close();
//	 
	 
//	 FileInputStream fis = new FileInputStream("text.txt");
//	 
//	 int c;
//	 while((c=fis.read())!=-1){
//		 System.out.print((char)c+" ");
//	 }
	 
//	---------------
	 /*FileWriter one = new FileWriter("copy.txt",true);
	 one.write("str\n");
	 one.flush();
	 
	 
	 FileWriter two= new FileWriter("paste.txt",true);
	 if(two.equals(null)){
		 two.write(one.write());
	 }*/
	 
	 
	/* 
	 File copy = new File("copy. txt");
	 File paste = new File("paste. txt");
	 
	 copy.createNewFile();
	 paste.createNewFile();
	 
	 FileOutputStream fileOutputStream = new FileOutputStream(copy);
	 FileInputStream fileInputStream = new FileInputStream(paste);

	 int k ;
	 
	 while((k= fileInputStream.read())!=-1){
		 fileOutputStream.write(k);
	 }
	 fileInputStream.close();
	 fileOutputStream.close();
	 */
	 
	 
/*	 File file = new File("text.txt");
	 file.createNewFile();
	 
	 
	 FileReader fileReader = new FileReader("text.txt");
	 
	 BufferedReader bufferedReader = new BufferedReader(fileReader);
	 
	 System.out.println(bufferedReader.readLine());
	 
	 String line = "" ;
	  while ((line = bufferedReader.readLine())!= null){
		  System.out.println(line);
	  }
	 
	*/
	 
	 String url = "https://helpx.adobe.com/ru/illustrator/using/image-trace/_jcr_content/main-pars/image_0.img.png/image_trace_cs6.png";
	 BufferedImage img = ImageIO.read(new URL(url));
	 
	 String filename = "lion.png";
	 File file = new File(filename);
	 if (!file.exists()){
		 file.createNewFile();
	 }
	 ImageIO.write(img, "png", file);
	 

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
