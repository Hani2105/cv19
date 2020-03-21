/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author hanac
 */
public class fopanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Victim v : MainForm.Victims) {
            if (!v.isBeteg() && !v.isHalott()) {
                g.setColor(Color.GREEN);
            } else if (v.isBeteg() && !v.isHalott()) {
                g.setColor(Color.RED);
            } else if (v.isHalott()) {

                g.setColor(Color.BLACK);
            }

            g.fillOval(v.x, v.y, 25, 25);
            if (!v.getNevem().equals("")) {
                g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
                g.drawString(v.getNevem(), v.x + 25, v.y);
            }

        }

    }

}
