package class3;

import java.awt.*;
import java.awt.event.*;

class SampleAWT extends Frame implements ActionListener {
    private Label lbl;
    private Button btn;

    public SampleAWT() {
        super("AWT Demo Window");

        setLayout(new BorderLayout());

        lbl = new Label("Press the button", Label.CENTER);
        btn = new Button("Click me");

        add(lbl, BorderLayout.NORTH);
        add(btn, BorderLayout.SOUTH);

        btn.addActionListener(this);

        setSize(350, 200);
        setLocationRelativeTo(null);  // Center the window
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        lbl.setText("Button clicked!");
    }

    public static void main(String[] args) {
        new SampleAWT();
    }
}
