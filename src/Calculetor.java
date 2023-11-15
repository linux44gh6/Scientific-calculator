import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

import static java.lang.Math.abs;
import static java.lang.Math.nextUp;


public class Calculetor {
    private List<String> history;
    private JPanel Calculetor;
    private JTextField textField1;
    private JButton Button3;

    private JButton Button4;

    private JButton Button32;
    private JButton Button31;
    private JButton Button30;
    private JButton Button14;
    private JButton Button29;
    private JButton Button33;
    private JButton Button6;
    private JButton Button7;
    private JButton Button5;
    private JButton Button34;
    private JButton Button22;
    private JButton Button23;
    private JButton Button24;
    private JButton Button25;
    private JButton Button26;
    private JButton Button27;
    private JButton Button28;
    private JButton Button21;
    private JButton Button20;
    private JButton Button19;
    private JButton Button18;
    private JButton Button17;
    private JButton Button16;
    private JButton Button15;
    private JButton Button8;
    private JButton Button9;
    private JButton Button10;
    private JButton Button11;
    private JButton Button12;
    private JButton Button13;
    private JButton Button35;
    private JRadioButton ONRadioButton;
    private JRadioButton OFFRadioButton;
    private JButton Button2;
    private JButton Button1;

    double num1, num2, result;
    String opr;

    public void enable() {
        ONRadioButton.setEnabled(false);
        OFFRadioButton.setEnabled(true);
        textField1.setEnabled(true);
        Button1.setEnabled(true);
        Button2.setEnabled(true);
        Button3.setEnabled(true);
        Button4.setEnabled(true);
        Button5.setEnabled(true);
        Button6.setEnabled(true);
        Button7.setEnabled(true);
        Button8.setEnabled(true);
        Button9.setEnabled(true);
        Button10.setEnabled(true);
        Button11.setEnabled(true);
        Button12.setEnabled(true);
        Button13.setEnabled(true);
        Button14.setEnabled(true);
        Button15.setEnabled(true);
        Button16.setEnabled(true);
        Button17.setEnabled(true);
        Button18.setEnabled(true);
        Button19.setEnabled(true);
        Button20.setEnabled(true);
        Button21.setEnabled(true);
        Button22.setEnabled(true);
        Button23.setEnabled(true);
        Button24.setEnabled(true);
        Button25.setEnabled(true);
        Button26.setEnabled(true);
        Button27.setEnabled(true);
        Button28.setEnabled(true);
        Button29.setEnabled(true);
        Button30.setEnabled(true);
        Button31.setEnabled(true);
        Button32.setEnabled(true);
        Button33.setEnabled(true);
        Button34.setEnabled(true);
        Button35.setEnabled(true);
    }

    public void disable() {
        ONRadioButton.setEnabled(true);
        OFFRadioButton.setEnabled(false);
        textField1.setEnabled(false);
        Button2.setEnabled(false);
        Button1.setEnabled(false);
        Button3.setEnabled(false);
        Button4.setEnabled(false);
        Button5.setEnabled(false);
        Button6.setEnabled(false);
        Button7.setEnabled(false);
        Button8.setEnabled(false);
        Button9.setEnabled(false);
        Button10.setEnabled(false);
        Button11.setEnabled(false);
        Button12.setEnabled(false);
        Button13.setEnabled(false);
        Button14.setEnabled(false);
        Button15.setEnabled(false);
        Button16.setEnabled(false);
        Button17.setEnabled(false);
        Button18.setEnabled(false);
        Button19.setEnabled(false);
        Button20.setEnabled(false);
        Button21.setEnabled(false);
        Button22.setEnabled(false);
        Button23.setEnabled(false);
        Button24.setEnabled(false);
        Button25.setEnabled(false);
        Button26.setEnabled(false);
        Button27.setEnabled(false);
        Button28.setEnabled(false);
        Button29.setEnabled(false);
        Button30.setEnabled(false);
        Button31.setEnabled(false);
        Button32.setEnabled(false);
        Button33.setEnabled(false);
        Button34.setEnabled(false);
        Button35.setEnabled(false);
    }
void initalize(){
        textField1.setEditable(false);
   textField1.setText("0");
   history=new ArrayList<>();

}
   //using constructor
    public Calculetor() {
    initalize();
        Button25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!"0".equals(textField1.getText())) {
                    textField1.setText(textField1.getText() + "7");
                }
                else {
                    textField1.setText("7");
                }
            }
        });

        Button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!"0".equals(textField1.getText())) {
                    textField1.setText(textField1.getText() + "8");
                }
                else {
                    textField1.setText("8");
                }
            }
        });

        Button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!"0".equals(textField1.getText())) {
                    textField1.setText(textField1.getText() + "9");
                }
                else {
                    textField1.setText("9");
                }
            }
        });

        Button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!"0".equals(textField1.getText())) {
                    textField1.setText(textField1.getText() + "6");
                }
                else {
                    textField1.setText("6");
                }
            }
        });

        Button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!"0".equals(textField1.getText())) {
                    textField1.setText(textField1.getText() + "5");
                }
                else {
                    textField1.setText("5");
                }
            }
        });

        Button26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!"0".equals(textField1.getText())) {
                    textField1.setText(textField1.getText() + "4");
                }
                else {
                    textField1.setText("4");
                }
            }
        });

        Button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!"0".equals(textField1.getText())) {
                    textField1.setText(textField1.getText() + "3");
                }
                else {
                    textField1.setText("3");
                }
            }
        });

        Button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!"0".equals(textField1.getText())) {
                    textField1.setText(textField1.getText() + "2");
                }
                else {
                    textField1.setText("2");
                }
            }
        });

        Button27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!"0".equals(textField1.getText())) {
                    textField1.setText(textField1.getText() + "1");
                }
                else {
                    textField1.setText("1");
                }
            }
        });

        Button28.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!"0".equals(textField1.getText())) {
                    textField1.setText(textField1.getText() + "0");
                }
                else {
                    textField1.setText("0");
                }
            }
        });

        Button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField1.setText(textField1.getText() + ".");
            }
        });
        Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField1.setText("0");
            }
        });
        Button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;
                if (textField1.getText().length() > 0) {
                    StringBuilder s = new StringBuilder(textField1.getText());
                    s.deleteCharAt(textField1.getText().length() - 1);
                    backspace = s.toString();
                    textField1.setText(backspace);
                }

            }
        });

        Button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField1.getText());
                textField1.setText("");
               opr = "+";
                 textField1.setText("");
            }
        });
        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField1.getText());
                textField1.setText("");
                opr = "-";
            }
        });
        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField1.getText());
                textField1.setText("");
                opr = "*";
            }
        });
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField1.getText());
                textField1.setText("");
                opr = "/";
            }
        });
        Button23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField1.getText());
               textField1.setText("");
                opr = "%";
            }
        });
        Button14.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                try {
                    num2 = Double.parseDouble(textField1.getText());

                    if (opr == "+") {
                        result = num1 + num2;
                        textField1.setText(Double.toString(result));
                    } else if (opr == "-") {
                        num2 = Double.parseDouble(textField1.getText());
                        result = abs(num1 - num2);
                        textField1.setText(Double.toString(result));
                    } else if (opr == "*") {
                        num2 = Double.parseDouble(textField1.getText());
                        result = num1 * num2;
                        textField1.setText(Double.toString(result));
                    } else if (opr=="π") {
                        num2=Double.parseDouble(textField1.getText());
                        result=num2*3.1416;
                        textField1.setText(Double.toString(result));

                    } else if (opr == "/") {
                        num2 = Double.parseDouble(textField1.getText());
                        result = num1 / num2;
                        textField1.setText(Double.toString(result));
                    } else if (opr == "%") {
                        num2 = Double.parseDouble(textField1.getText());
                        result = num1 % num2;
                        textField1.setText(Double.toString(result));
                    } else if (opr == "x^y") {
                        for (int i = 0; i < num2; i++) {
                            result = num1 * num2;

                        }
                        textField1.setText(Double.toString(result));
                    }
                    if (opr != null) {
                        performOperation();
                        history.add((textField1.getText()));
                        history.add(opr);
                        history.add(Double.toString(num2));
                        history.add("="+ Double.toString(result));
                        textField1.setText(Double.toString(result));
                        num1 = result;
                        opr = null;
                    }
                } catch (ArithmeticException ex){
                    System.out.println(ex);
                }

                }
        });


        Button21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    double value=Double.parseDouble(textField1.getText());
                    Double t = Math.sin(value);

                    textField1.setText("sin("+value+")="+t);
                   // textField1.setText(textField1.getText() + t);
                }catch (NumberFormatException ex){
                    System.out.println(ex);
                }

            }
        });

        Button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double t = Math.cos(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText() + t);
            }
        });

        Button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double t = Math.tan(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText() + t);
            }
        });

        Button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double t = Math.sinh(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText() + t);
            }
        });

        Button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double t = Math.cosh(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText() + t);
            }
        });

        Button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double t = Math.tanh(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText() + t);
            }
        });

        Button22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double t = Math.exp(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText() + t);
            }
        });

        Button35.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double t = 1 / (Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText() + t);
            }
        });

        Button32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double t = Math.sqrt(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText() + t);
            }
        });

        Button30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double t = Math.log10(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText() + t);
            }
        });
        Button34.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double t = Double.parseDouble(textField1.getText());
                result = t * t;
                textField1.setText("");
                textField1.setText(textField1.getText() + result);
            }
        });
        Button33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField1.getText());
                textField1.setText("");
                opr = "x^y";
            }
        });

        Button29.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n = Double.parseDouble(textField1.getText());
                if(n<0){
                    textField1.setText("Error");
                } else if ( isFractiona(Double.toString(n)) ) {
                    textField1.setText("Error");
                } else {
                    double fact = 1;
                    while (n != 0) {
                        fact = fact * n;
                        n--;
                    }
                    textField1.setText("");
                    textField1.setText(Double.toString(fact));
                }
            }
        });
        ONRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enable();
            }
        });
        OFFRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disable();
            }
        });

        Button24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "" + "(");
            }
        });
        Button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + ")");
            }
        });

        Button31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!"0".equals(textField1.getText())){
                    textField1.setText(textField1.getText()+"3.1416");
                }
            }
        });
    }

    private void performOperation() {
        switch (opr) {

               case "+":
                   result = num1 + num2;
                   break;
               case "-":
                   result = num1 - num2;
                   break;
               case "*":
                   result = num1 * num2;
                   break;
               case "/":
                   result = num1 / num2;
                   break;


        }
    }
    //chek the fractional number
    private boolean isFractiona(String n){
        if (n.contains(".")){
            double doubleValue = Double.parseDouble(n);
            return doubleValue % 1 != 0;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculetor");
        frame.setContentPane(new Calculetor().Calculetor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Calculetor ob=new Calculetor();

          }
}
