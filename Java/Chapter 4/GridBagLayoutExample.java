import java.awt.*;
import javax.swing.*;

public class GridBagLayoutExample extends JFrame {
    public GridBagLayoutExample() {
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(layout);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx=0; gbc.gridy=0;
        add(new Button("Button One"), gbc);

        gbc.gridx=1; gbc.gridy=0;
        add(new Button("Button Two"), gbc);

        gbc.gridx=0; gbc.gridy=1;
        add(new Button("Button Three"), gbc);

        gbc.gridx=1; gbc.gridy=1;
        add(new Button("Button Four"), gbc);

        gbc.gridx=0; gbc.gridy=2; gbc.gridwidth=2;
        add(new Button("Button Five"), gbc);

        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new GridBagLayoutExample();
    }
}
