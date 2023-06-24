import CatalogManagement.*;
import dao.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CatalogDisplay extends JFrame {
    private JPanel catalogPanel;

    CatalogDAO catalogDAO = new CatalogDAO();

    public CatalogDisplay() {
        setTitle("Catalog Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        catalogPanel = new JPanel(new GridLayout(catalogDAO.getAllCatalogs().size(), 1, 10, 10));

        JPanel buttonPanel = new JPanel(new FlowLayout());

        for (Catalog catalog : catalogDAO.getAllCatalogs()) {
            for (Field field : catalog.getFieldsList()) {
                for (Theme theme : field.getThemeList()) {
                    for (Topic topic : theme.getTopicList()) {
                        for (Course course : topic.getCourseList()) {
                            JPanel coursePanel = new JPanel(new BorderLayout());
                            coursePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                            JLabel nameLabel = new JLabel(course.getName());
                            nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
                            coursePanel.add(nameLabel, BorderLayout.NORTH);

                            JTextArea contentArea = new JTextArea(course.getContent());
                            contentArea.setEditable(false);
                            JScrollPane scrollPane = new JScrollPane(contentArea);
                            coursePanel.add(scrollPane, BorderLayout.CENTER);

                            JLabel priceLabel = new JLabel("Price: $" + course.getPrice());
                            coursePanel.add(priceLabel, BorderLayout.SOUTH);

                            catalogPanel.add(coursePanel);
                        }
                    }
                }
            }

        }

        JScrollPane catalogScrollPane = new JScrollPane(catalogPanel);
        add(catalogScrollPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CatalogDisplay());
    }
}
