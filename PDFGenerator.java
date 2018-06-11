package Question1;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 * ICTPRG523 Apply Advanced Programming Skills In Another Language
 * Student Name: Man Hou
 * Student ID :10042466
 * Assessment3 Question 2 Section A
 */
public class PDFGenerator {
    File pdfFile = new File("C:\\Users\\PC\\Desktop\\Player.pdf");
    PDDocument document;
    //Constructor
    public PDFGenerator() {
        this.document = new PDDocument();
    }
    
    public void execute(PlayersList pl) throws IOException
    {
        generatePDFFromString(pl);
        showPDFFile();
    }
    //Open PDF file
    private void showPDFFile() throws IOException
    {
        if(pdfFile.exists())
        {
            java.awt.Desktop.getDesktop().open(pdfFile);
        }
    }
    //Add objects into pages, then save.
    private void generatePDFFromString(PlayersList pl) throws IOException
    {
        for(Players player:pl.getPl())
        {
            addPage(player);
        }
        //Document Save
        document.save("C:\\Users\\PC\\Desktop\\Player.pdf");
        //Document Close
        document.close();
    } 
    
    private void addPage(Players player) throws IOException
    {
        PDPage newPage = new PDPage();
        document.addPage(newPage);
        PDPageContentStream contentStream = new PDPageContentStream(document, newPage);
        //Begin the Content stream 
        contentStream.beginText(); 
        //Setting the font to the Content stream  
        contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
        //Setting the leading
        contentStream.setLeading(14);
        //Setting the position for the line 
        contentStream.newLineAtOffset(25, 725);
        contentStream.newLine();
        contentStream.newLine();
        String playerName = "Player > "+ player.getUsername() + ", " + player.getTagname()+ ", " + player.timeStamp();
        contentStream.showText(playerName);
        contentStream.newLine();
        contentStream.newLine();
        String playerAchievements = "Achievements > ";
        contentStream.showText(playerAchievements);
        contentStream.newLine();
        //Output each achievement
        for(Achievement ach : player.getAchievements())
        {
            contentStream.newLine();
            String achievementDetail = "    " + ach.getDescription() 
                    + "    " + Integer.toString(ach.getLevel())
                    + "    " + Integer.toString(ach.getMaximum());
            contentStream.showText(achievementDetail);
            contentStream.newLine();
        }
        //Ending the content stream
        contentStream.endText();
        //Closing the content stream
        contentStream.close();       
    }
}
