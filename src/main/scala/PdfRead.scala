

/*
import com.itextpdf.text.pdf.{PdfReader, PdfStamper, PdfWriter}
import controllers.routes
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream
*/

/**
 * Created by pati80 on 2/5/18.
 */
/*object PdfRead {

  def main(args: Array[String]) {

    val doc = PDDocument.load("/Users/pati80/Desktop/ISO9001.pdf")

    // Define the length of the encryption key.
    // Possible values are 40 or 128 (256 will be available in PDFBox 2.0).
    val keyLength = 128

    val permission1 = new AccessPermission()
    permission1.setCanAssembleDocument(false)
    permission1.setCanExtractContent(false)
    permission1.setCanExtractForAccessibility(true)
    permission1.setCanFillInForm(false)
    permission1.setCanModify(false)
    permission1.setCanModifyAnnotations(false)
    permission1.setCanPrint(false) // Disable printing, everything else is allowed
    permission1.setCanPrintDegraded(false)

    // Owner password (to open the file with all permissions) is "12345"
    // User password (to open the file but with restricted permissions, is empty here)
    val spp = new StandardProtectionPolicy("12345", "", permission1)
    spp.setEncryptionKeyLength(keyLength)
    spp.setPermissions(permission1)
    doc.setAllSecurityToBeRemoved(false)
    doc.protect(spp)

    doc.save("/Users/pati80/Desktop/filename-encrypted.pdf")
    doc.close()
  }*/

  /*def getPdfContent(filename: String, startPage: Int, endPage: Int): String = {
        try {
            val pdf = PDDocument.load(new File(filename))
            val stripper = new PDFTextStripper
            stripper.setStartPage(startPage)
            stripper.setEndPage(endPage)
            stripper.getText(pdf)
        } catch {
            case t: Throwable => s"There was an error trying to read the PDF file. Here's the exception:"
        }
    }
}*/
