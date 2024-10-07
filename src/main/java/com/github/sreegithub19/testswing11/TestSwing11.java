package com.github.sreegithub19.testswing11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestSwing11 extends JFrame {

    private Timer timer;
    private int x, y, xDelta = 2, yDelta = 2;
    private JButton startButton, stopButton;
    private AnimatedPanel animatedPanel;

    public TestSwing11() {
        x = y = 100;
        timer = new Timer(10, e -> {
            x += xDelta;
            y += yDelta;

            if (x + "Hello jDeploy".length() * 7 >= animatedPanel.getWidth() || x < 0) xDelta *= -1;
            if (y + 15 >= animatedPanel.getHeight() || y < 0) yDelta *= -1;

            animatedPanel.repaint();
        });

        startButton = new JButton("Start");
        startButton.addActionListener(e -> timer.start());

        stopButton = new JButton("Stop");
        stopButton.addActionListener(e -> timer.stop());

        animatedPanel = new AnimatedPanel();
        animatedPanel.setBackground(Color.YELLOW);
        setLayout(new BorderLayout());
        add(animatedPanel, BorderLayout.CENTER);
        add(startButton, BorderLayout.NORTH);
        add(stopButton, BorderLayout.SOUTH);
    }

    class AnimatedPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString("""
                <h1>Hello jDeploy 8</h1>
                         """, x, y);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TestSwing11 frame = new TestSwing11();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setVisible(true);
        });
    }
}
