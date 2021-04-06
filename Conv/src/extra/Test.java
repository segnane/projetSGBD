package extra;
import java.io.File;

//import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Test {

	public static void main(String[] args) throws TesseractException {
		Tesseract tesseract = new Tesseract();
        
  
            tesseract.setDatapath("C:\\Users\\BUSSINESS\\Desktop\\testextration\\tessdata");
  
            // the path of your tess data folder
            // inside the extracted file
            tesseract.setLanguage("bon");
            
      String text          = tesseract.doOCR(new File("C:\\Users\\BUSSINESS\\Desktop\\testextration\\test7.png"));
  
            // path of your image file
            System.out.print(text);
        }
       
	}
