
package komponen;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class gmbrBG extends JPanel{
    
    Image gambar;
    public gmbrBG(){
        gambar = new ImageIcon(getClass( ).getResource("/picture/Asset 7.png")).getImage( );
        
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D)g.create( );
        gd.drawImage(gambar, 0, 0, getWidth(),getHeight(),null);
        gd.dispose();
        

    }
}   
