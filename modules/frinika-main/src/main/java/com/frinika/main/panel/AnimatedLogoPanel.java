/*
 * http://www.frinika.com
 * 
 * This file is part of Frinika.
 * 
 * Frinika is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.

 * Frinika is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with Frinika; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package com.frinika.main.panel;

import com.frinika.gui.util.WindowUtils;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.Timer;
import java.util.TimerTask;
import javax.annotation.Nonnull;
import javax.swing.ImageIcon;

/**
 * Panel for animated logo.
 *
 * @author hajdam
 */
public class AnimatedLogoPanel extends javax.swing.JPanel {

    private ImageIcon labelImage;
    private final ImageIcon lightImage;
    private final ImageIcon cloudImage;
    private ImageIcon overscanImage;

    private final Point cloud1Position;
    private final Point cloud2Position;
    private final Point lightPosition;
    private final Point overscanPosition;

    private BufferedImage animationBuffer;
    private final ImageObserver observer = (Image img, int infoflags, int x1, int y1, int width1, int height1) -> true;

    private boolean firstTimeOpened = false;
    private final Timer timer = new Timer();

    // Cached values
    private int labelWidth = 0;
    private int cloudWidth = 0;
    private int lightWidth = 0;

    public AnimatedLogoPanel() {
        boolean darkMode = WindowUtils.isDarkMode();
        String postfix = darkMode ? "-dark" : "";
        labelImage = new javax.swing.ImageIcon(getClass().getResource("/com/frinika/main/resources/logo/frinika-studio" + postfix + ".png"));
        lightImage = new javax.swing.ImageIcon(getClass().getResource("/com/frinika/main/resources/logo/frinika_light_gradient.png"));
        cloudImage = new javax.swing.ImageIcon(getClass().getResource("/com/frinika/main/resources/logo/frinika_score.png"));
        overscanImage = new javax.swing.ImageIcon(getClass().getResource("/com/frinika/main/resources/logo/frinika-studio_overscan" + postfix + ".png"));

        cloudWidth = cloudImage.getIconWidth();
        labelWidth = labelImage.getIconWidth();
        lightWidth = lightImage.getIconWidth();

        cloud1Position = new Point(0, 75);
        cloud2Position = new Point(cloudWidth, 75);
        lightPosition = new Point(0, 0);
        overscanPosition = new Point(0, 0);

        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents

    private void init() {
        boolean darkMode = WindowUtils.isDarkMode();
        setBackground(darkMode ? Color.BLACK : Color.WHITE);
        setMinimumSize(new Dimension(lightWidth, 203));
        setPreferredSize(new Dimension(lightWidth, 203));

        startAnimationThread();
    }

    /**
     * Test method for this panel.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        WindowUtils.invokeDialog(new AnimatedLogoPanel());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void invalidate() {
        animationBuffer = null;
        updateBuffer();
        super.invalidate();
    }

    @Override
    protected void paintComponent(@Nonnull Graphics g) {
        if (animationBuffer != null) {
            g.drawImage(animationBuffer, 0, 0, this);
        }
    }

    protected void updateBuffer() {
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0) {
            if (animationBuffer == null) {
                animationBuffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
                Graphics2D g = animationBuffer.createGraphics();

                int panelWidth = width;
                int startPoint = (panelWidth - labelWidth) / 2;
                g.setColor(getBackground());
                g.fillRect(0, 0, width, height);
                g.drawImage(labelImage.getImage(), startPoint, 0, observer);
                g.drawImage(cloudImage.getImage(), startPoint + cloud1Position.x, cloud1Position.y, observer);
                g.drawImage(cloudImage.getImage(), startPoint + cloud2Position.x, cloud2Position.y, observer);
                g.drawImage(lightImage.getImage(), startPoint + lightPosition.x, lightPosition.y, observer);
                g.drawImage(overscanImage.getImage(), startPoint + overscanPosition.x, overscanPosition.y, observer);
                g.fillRect(0, 0, startPoint, height);
                g.fillRect(startPoint + labelWidth, 0, width - startPoint + labelWidth, height);
                g.dispose();
            }
        }
    }

    private void animate() {
        cloud1Position.x--;
        if (cloud1Position.x < -cloudWidth) {
            cloud1Position.x = cloudWidth;
        }

        cloud2Position.x--;
        if (cloud2Position.x < -cloudWidth) {
            cloud2Position.x = cloudWidth;
        }

        lightPosition.x += 3;
        if (lightPosition.x > labelWidth) {
            lightPosition.x = -lightWidth;
        }

        invalidate();
        repaint();
    }

    private void startAnimationThread() {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (isVisible()) {
                    animate();
                }
            }
        }, 0, 70);
    }

    private void stopAnimationThread() {
        timer.cancel();
    }

    public void switchLookAndFeel() {
        boolean darkMode = WindowUtils.isDarkMode();
        setBackground(darkMode ? Color.BLACK : Color.WHITE);

        String postfix = darkMode ? "-dark" : "";
        labelImage = new javax.swing.ImageIcon(getClass().getResource("/com/frinika/main/resources/logo/frinika-studio" + postfix + ".png"));
        overscanImage = new javax.swing.ImageIcon(getClass().getResource("/com/frinika/main/resources/logo/frinika-studio_overscan" + postfix + ".png"));
        invalidate();
    }

    @Nonnull
    public WindowListener getWindowListener() {
        return new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                stopAnimationThread();
            }

            @Override
            public void windowOpened(WindowEvent e) {
                if (!firstTimeOpened) {
                    firstTimeOpened = true;
                } else {
                    startAnimationThread();
                }
            }
        };
    }
}
