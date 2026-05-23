import javax.swing.*;
import java.awt.*;

public class MaxFinder {
    public static void main(String[] args){
        JFrame f = new JFrame("Java Largest Finder");
        f.setLayout(new FlowLayout());

        JTextField t1 = new JTextField(4),t2 = new JTextField(4),t3 = new JTextField(4);
        JButton btn = new JButton("Find");
        JTextField res = new JTextField(15);
        res.setEditable(false);

        f.add(t1); f.add(t2); f.add(t3); f.add(btn);f.add(res);

        btn.addActionListener(e -> {
            try {
                if(t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty()) {
                    throw new Exception("Please Enter all the numbers!");
                }

                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = Integer.parseInt(t3.getText());

                if (a>=0 || b>=0 || c>=0)
                    throw new IllegalArgumentException("Only negative numbers allowed!");

                int largest = Math.max(a,Math.max(b,c));
                res.setText(String.valueOf(largest));
            }catch(NumberFormatException exception){
                JOptionPane.showMessageDialog(f,"Error: Non-numeric input detected.");
            }catch(IllegalArgumentException exception){
                JOptionPane.showMessageDialog(f, exception.getMessage());
            }catch(Exception exception){
                JOptionPane.showMessageDialog(f, exception.getMessage());
            }
        });

        f.setSize(350, 150);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
