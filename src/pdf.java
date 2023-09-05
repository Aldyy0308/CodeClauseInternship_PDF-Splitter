import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class pdf {
	public static void main(String[] args) throws IOException {
		File oldFile = new File("C:\\Users\\addyf\\pdf\\input.pdf");
		PDDocument document = PDDocument.load(oldFile);

		Splitter splitter = new Splitter();

		List<PDDocument> splitPages = splitter.split(document);

		int num = 1;
		for(PDDocument mydoc : splitPages){
			mydoc.save("C:\\Users\\addyf\\pdf\\extract\\split_"+num+".pdf");
			num++;
			mydoc.close();
		}
		System.out.println("PDF files splitted successfully");
	}
}