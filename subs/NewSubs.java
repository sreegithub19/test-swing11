import javax.swing.*;
import java.awt.*;

public class HtmlViewer extends JFrame {

    public HtmlViewer() {
        // Set up the JFrame
        setTitle("HTML Viewer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create HTML content as a string
        String htmlContent = "<html>" +
                "<head><title>Sample HTML</title></head>" +
                "<body>" +
                "<h1>Welcome to the HTML Viewer</h1>" +
                "<p>This is a simple example of displaying HTML in a Swing application.</p>" +
                "<ul>" +
                "<li>Item 1</li>" +
                "<li>Item 2</li>" +
                "<li>Item 3</li>" +
                "</ul>" +
                "</body>" +
                "</html>";

        // Create JEditorPane to display HTML
        JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/html");
        editorPane.setText(htmlContent);
        editorPane.setEditable(false);

        // Add the editor pane to a scroll pane
        JScrollPane scrollPane = new JScrollPane(editorPane);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        // Create and display the HTML viewer
        SwingUtilities.invokeLater(() -> {
            HtmlViewer viewer = new HtmlViewer();
            viewer.setVisible(true);
        });
    }
}
