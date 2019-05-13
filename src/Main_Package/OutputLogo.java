package Main_Package;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OutputLogo {

    public JButton createLogoButton;
    public JPanel TextOut;
    public JLabel OUTPUT;

    public OutputLogo(String[] ans,long[] size) {

        createLogoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Process Logo Created");

                for(int i=0;i<ans.length;i++) {
                    if (size[i] == 1) {
                        OUTPUT.setFont(new Font("Serif", Font.PLAIN, 20));
                        OUTPUT.setText(OUTPUT.getText() + ans[i]);
                        System.out.println(size[i]);
                    }
                    else if(size[i] == 2){
                        OUTPUT.setFont(new Font("Serif", Font.PLAIN, 14));
                        OUTPUT.setText(OUTPUT.getText() + ans[i]);
                        System.out.println(size[i]);
                    }
                    else if(size[i] == 3){
                        OUTPUT.setFont(new Font("Serif", Font.PLAIN, 12));
                        OUTPUT.setText(OUTPUT.getText() + ans[i]);
                        System.out.println(size[i]);
                    }
                }

            }
        });
    }

    public void createUIComponents() {

        // TODO: place custom component creation code here
    }
}
