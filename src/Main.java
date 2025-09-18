import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Main {
    static String a = "0";
    static String operador=null;
    static String b=null;
    public static void main(String[] args) {
        JFrame tela=new JFrame();
        tela.setSize(360,540);
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.setLayout(new BorderLayout());
        String[] buttonValues = {
                "AC", "+/-", "%", "÷",
                "7", "8", "9", "×",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "0", ".", "√", "="
        };
        String[] rightSymbols = {"÷", "×", "-", "+", "="};
        String[] topSymbols = {"AC", "+/-", "%"};

        
        Color lightGray=new Color(212,212,210);
        Color orange=new Color(255, 149, 0);
        Color darkGray=new Color(80,80,80);
        Color black=new Color(28,28,28);
        JLabel display=new JLabel();
        JPanel displaypanel=new JPanel();

        display.setBackground(black);
        display.setForeground(Color.white);
        display.setFont(new Font("Arial",Font.PLAIN,80));
        display.setHorizontalAlignment(JLabel.RIGHT);
        display.setText("0");
        display.setOpaque(true);

        displaypanel.setLayout(new BorderLayout());
        displaypanel.add(display);
        tela.add(displaypanel,BorderLayout.NORTH);

        JPanel numericPanel=new JPanel(new GridLayout(5,4));
        numericPanel.setBackground(black);
        for (int i = 0; i <buttonValues.length; i++) {
            JButton button = new JButton(buttonValues[i]);

            button.setFont(new Font("Arial", Font.PLAIN, 20));

            button.setFocusable(false);
            numericPanel.add(button);
            if (Arrays.asList(topSymbols).contains(buttonValues[i])) {
                button.setBackground(lightGray);
                button.setForeground(Color.black);
            } else if (Arrays.asList(rightSymbols).contains(buttonValues[i])) {
                button.setBackground(orange);
                button.setForeground(Color.black);
            } else {
                button.setBackground(black);
                button.setForeground(Color.white);
            }
            button.setBorder(new LineBorder(black));

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String value=button.getText();

                    if (Arrays.asList(topSymbols).contains(value)){
                        if (value=="AC"){
                            clearAll();
                            display.setText("0");
                        } else if (value=="+/-") {
                            display.setText(String.valueOf(removeZeroDecimal(Double.parseDouble(display.getText())*(-1))));
                        }else if(value=="%"){
                            display.setText(String.valueOf(removeZeroDecimal(Double.parseDouble(display.getText())/100)));;
                        }
                    }else if (Arrays.asList(rightSymbols).contains(value)){
                        if (value=="="){
                            if (a!=null){
                                b=display.getText();
                                double num1=Double.parseDouble(a);
                                double num2=Double.parseDouble(b);
                                double res=0;
                                if (operador =="+"){
                                    res=num1+num2;
                                    operador=null;
                                    display.setText(removeZeroDecimal(res));
                                } else if (operador=="-") {
                                    res=num1-num2;
                                    operador=null;
                                    display.setText(removeZeroDecimal(res));
                                } else if (operador=="×") {
                                    res=num1*num2;
                                    operador=null;
                                    display.setText(removeZeroDecimal(res));
                                } else if (operador=="÷") {
                                    res=num1*num2;
                                    operador=null;
                                    display.setText(removeZeroDecimal(res));
                                }
                            }
                        } else if ("+-÷×".contains(value)) {
                            if (operador==null){
                                a=display.getText();
                                display.setText("0");
                                b="0";
                            }
                            operador=value;
                        }
                    }else {
                        if (value.equals(".")){
                           if (!display.getText().contains(value))
                               display.setText(display.getText()+value);
                        } else if ("0123456789".contains(value)) {
                            if (display.getText().equals("0")){

                                display.setText(value);
                            }else{

                                display.setText(display.getText()+value);
                            }
                        } else {
                            display.setText(removeZeroDecimal(Math.sqrt(Double.parseDouble(display.getText()))));
                        }
                    }
                }
            });
        }

        tela.add(numericPanel);

        tela.setVisible(true);
    }

    static void clearAll(){
        a="0";
        b=null;
        operador=null;
    }

    static String removeZeroDecimal(double num){
        if (num%1==0)
            return Integer.toString((int) num);
        return Double.toString(num);
    }
}