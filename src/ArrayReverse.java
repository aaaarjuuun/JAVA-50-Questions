import javax.swing.*;
import java.awt.*;

public class ArrayReverse {
    public static void main(String[] args){

        JFrame f = new JFrame("ARRAY REVERSED");
        f.setLayout(new FlowLayout());

        JTextField[] inputs = new JTextField[8];
        JTextField[] outputs = new JTextField[8];

        JPanel topPanel = new JPanel();
        JPanel buttomPanel = new JPanel();

        for(int i=0;i<8;i++){
            inputs[i] = new JTextField(3);
            topPanel.add(inputs[i]);

            outputs[i] = new JTextField(3);
            outputs[i].setEditable(false);
            buttomPanel.add(outputs[i]);

        }

        JButton reversebtn = new JButton("REVERSE");

        f.add(topPanel);
        f.add(buttomPanel);
        f.add(reversebtn);

        reversebtn.addActionListener(e->{
            try{
                int[] arr = new int[8];

                for(int i=0;i<8;i++){
                    arr[i] = Integer.parseInt(inputs[i].getText());
                }

                int n = arr.length;
                for(int i=0; i<n/2;i++){
                    int temp = arr[i];
                    arr[i]= arr[n-1-i];
                    arr[n-1-i] = temp;
                }

                for(int i=0; i<8; i++){
                    outputs[i].setText(String.valueOf(arr[i]));
                }
            }catch(NumberFormatException exception){
                JOptionPane.showMessageDialog(f,"ERROR : Please enter a valid numbers");

            }
        });

        f.setSize(450,180);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
