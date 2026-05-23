import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
public class ArraySorter {
    public static void main(String[] args){
        JFrame f = new JFrame("ArraySorter");
        f.setLayout(new FlowLayout());


        JTextField[] inputs = new JTextField[8];
        JTextField[] outputs = new JTextField[8];

        JPanel toppanel = new JPanel();
        JPanel bottompanel = new JPanel();


        for(int i=0; i<8; i++){
            inputs[i] = new JTextField(3);
            toppanel.add(inputs[i]);

            outputs[i] = new JTextField(3);
            outputs[i].setEditable(false);
            bottompanel.add(outputs[i]);
        }

        JButton sortBtn = new JButton("SORT");

        f.add(toppanel);
        f.add(bottompanel);
        f.add(sortBtn);

        sortBtn.addActionListener(e -> {
            try{
                int[] arr = new int[8];

                for(int i= 0; i<8 ; i++){
                    arr[i] = Integer.parseInt(inputs[i].getText());
                }

                Arrays.sort(arr);

                for(int i=0;i<8;i++){
                    outputs[i].setText(String.valueOf(arr[i]));
                }
            }catch (NumberFormatException exception){
                JOptionPane.showMessageDialog(f,"Error: Please Enter a valid Number");
            }
        });

        f.setSize(450,180);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
