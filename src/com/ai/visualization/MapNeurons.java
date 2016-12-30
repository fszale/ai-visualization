package com.ai.visualization;

import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.applet.*;

public class MapNeurons extends Applet  {

    Plane planeX = new Plane(new Vector3D(1, 0, 0));
    Plane planeY = new Plane(new Vector3D(0, 1, 0)); // Must be orthogonal plane of planeX

    void drawPoint(Graphics2D g2, Vector3D v) {
        g2.drawLine(0, 0,
                (int) (500 * planeX.getOffset(v)),
                (int) (500 * planeY.getOffset(v)));
    }

    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D) g; //img.createGraphics();
        g2.setColor( Color.orange );
        g2.fillRect( 0, 0, super.getWidth(), super.getHeight() );
        g2.setColor( Color.black );

        drawPoint(g2, new Vector3D(2, 1, 0));
        drawPoint(g2, new Vector3D(0, 2, 0));
        drawPoint(g2, new Vector3D(0, 0, 2));
        drawPoint(g2, new Vector3D(1, 1, 1));
    }

}
