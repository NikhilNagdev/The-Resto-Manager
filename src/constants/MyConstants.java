package constants;

import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author Nikhil
 *
 * This is interface is used to the path of the images and
 * the icons used in pages
 */


public interface MyConstants {

    ImageIcon REDTABLE = new ImageIcon("images\\red.png");
    ImageIcon GREENTABLE = new ImageIcon("images\\greenfre.png");
    ImageIcon BLURREDPAGE = new ImageIcon("images\\blur.png");
    ImageIcon LOADER = new ImageIcon("images\\loader.gif");
    ImageIcon USERNAMEICON = new ImageIcon("images\\man-user.png");
    ImageIcon PASSWORDICON = new ImageIcon("images\\lock.png");
    ImageIcon FRAMELOGO = new ImageIcon("images\\hotel.png");
    ImageIcon BACKICONLIGHTGREEN  = new ImageIcon("images\\backGreen.png");
    ImageIcon BACKICONDARKGREEN = new ImageIcon("images\\backDarkGreen.png");
    ImageIcon TRAYICON = new ImageIcon("images\\hotel.png");
    File PDFFILE = new File("Invoice-1.pdf");

}
