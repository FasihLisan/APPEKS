
package komponen;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.ScrollPane;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class scrollpane extends ScrollPane{

    /**
     * @return the roundTopLeft
     */
    public int getRoundTopLeft() {
        return roundTopLeft;
    }

    /**
     * @param roundTopLeft the roundTopLeft to set
     */
    public void setRoundTopLeft(int roundTopLeft) {
        this.roundTopLeft = roundTopLeft;
        repaint();
    }

    /**
     * @return the roundqTopRight
     */
    public int getRoundqTopRight() {
        return roundqTopRight;
    }

    /**
     * @param roundqTopRight the roundqTopRight to set
     */
    public void setRoundqTopRight(int roundqTopRight) {
        this.roundqTopRight = roundqTopRight;
        repaint();
    }

    /**
     * @return the roundqBottomRight
     */
    public int getRoundqBottomRight() {
        return roundqBottomRight;
    }

    /**
     * @param roundqBottomRight the roundqBottomRight to set
     */
    public void setRoundqBottomRight(int roundqBottomRight) {
        this.roundqBottomRight = roundqBottomRight;
        repaint();
    }

    /**
     * @return the roundqBottomLeft
     */
    public int getRoundqBottomLeft() {
        return roundqBottomLeft;
    }

    /**
     * @param roundqBottomLeft the roundqBottomLeft to set
     */
    public void setRoundqBottomLeft(int roundqBottomLeft) {
        this.roundqBottomLeft = roundqBottomLeft;
        repaint();
    }
    
    private int roundTopLeft = 0;
    private int roundqTopRight = 0;
    private int roundqBottomRight = 0;
    private int roundqBottomLeft = 0;
    
    public scrollpane(){
        
    }

    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setBackground(getBackground());
        Area area = new Area(createRoundTopLeft());
        if (roundqTopRight > 0){
            area.intersect(new Area(createRoundTopRight()));
        }
        if (roundqBottomLeft > 0){
            area.intersect(new Area(createRoundBottomLeft()));
        }
        if (roundqBottomRight > 0){
            area.intersect(new Area(createRoundBottomRight()));
        }
        g2.fill(area);
        g2.dispose();
        super.paintComponents(grphcs);
    }
    
    private Shape createRoundTopRight(){
        int width = getWidth();
        int height = getHeight();
        int RoundX = Math.min(width, roundqTopRight);
        int ROundY= Math.min(width, roundqTopRight);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width,height, RoundX, ROundY)) ;
        area.add(new Area(new Rectangle2D.Double(0, 0, width - RoundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, ROundY / 2, width, height- ROundY / 2)));
        return area;
    }
    
    private Shape createRoundTopLeft(){
        int width = getWidth();
        int height = getHeight();
        int RoundX = Math.min(width, roundTopLeft);
        int ROundY= Math.min(width, roundTopLeft);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width,height, RoundX, ROundY)) ;
        area.add(new Area(new Rectangle2D.Double(RoundX / 2, 0, width - RoundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, ROundY / 2, width, height- ROundY / 2)));
        return area;
    }
    private Shape createRoundBottomLeft(){
        int width = getWidth();
        int height = getHeight();
        int RoundX = Math.min(width, roundqBottomLeft);
        int ROundY= Math.min(width, roundqBottomLeft);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width,height, RoundX, ROundY)) ;
        area.add(new Area(new Rectangle2D.Double(RoundX / 2, 0, width - RoundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width, height- ROundY / 2)));
        return area;
    }
    private Shape createRoundBottomRight(){
        int width = getWidth();
        int height = getHeight();
        int RoundX = Math.min(width, roundqBottomRight);
        int ROundY= Math.min(width, roundqBottomRight);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width,height, RoundX, ROundY)) ;
        area.add(new Area(new Rectangle2D.Double(0, 0, width - RoundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width, height- ROundY / 2)));
        return area;
    }
}
