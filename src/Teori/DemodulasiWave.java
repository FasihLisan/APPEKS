/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teori;



import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author FASIH
 */
public class DemodulasiWave extends JPanel{
    
    Image gambar;
    public DemodulasiWave(){
        gambar = new ImageIcon(getClass( ).getResource("/assets/sinyal_penerima.png")).getImage( );
        
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D)g.create( );
        gd.drawImage(gambar, 0, 0, getWidth(),getHeight(),null);
        gd.dispose();
        

    }
}   
