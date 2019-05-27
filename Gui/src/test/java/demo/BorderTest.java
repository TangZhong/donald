package demo;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by Administrator on 2019/5/27.
 */
public class BorderTest extends JPanel {

    public BorderTest(){

        super(new GridLayout(1,1));

        Border lineBorder = BorderFactory.createLineBorder(Color.black);

        Border margin = BorderFactory.createEmptyBorder(0,10,10,10);

        //tab1
        JPanel panel1 = new JPanel();
        panel1.setBorder(margin);
        panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));

        addCompForBorder(lineBorder,"lable1",panel1);
        addCompForBorder(lineBorder,"lable2",panel1);


        //tab2
        JPanel panel2 = new JPanel();

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("tab1",panel1);
        tabbedPane.addTab("tab2",panel2);
        tabbedPane.setSelectedIndex(0);

        add(tabbedPane);
    }

    void addCompForBorder(Border border,
                          String description,
                          Container container) {
        JPanel comp = new JPanel(new GridLayout(1, 1), false);
        JLabel label = new JLabel(description, JLabel.CENTER);
        comp.add(label);
        comp.setBorder(border);

        container.add(Box.createRigidArea(new Dimension(0, 10)));
        container.add(comp);
    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable(){

            public void run() {
                createAndRefreshUI();   
            }
        });

    }

    private static void createAndRefreshUI() {
        //jframe setup
        JFrame frame = new JFrame("BorderTest Frame title");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //contentPanel setup
        BorderTest contentPanel = new BorderTest();
        contentPanel.setOpaque(true);
        frame.setContentPane(contentPanel);

        //visible
        frame.pack();
        frame.setVisible(true);
    }

}
