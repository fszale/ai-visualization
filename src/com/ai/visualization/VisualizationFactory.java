package com.ai.visualization;

import javax.swing.*;
import java.awt.*;

public class VisualizationFactory {

    public static void showNeurons() {

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(dim.width/2,dim.height/2);
        jFrame.setLocation(dim.width/2-jFrame.getSize().width/2, dim.height/2-jFrame.getSize().height/2);
        jFrame.add(new MapNeurons());
        jFrame.setVisible(true);

    }
}
