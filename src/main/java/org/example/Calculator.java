package org.example;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Calculator extends JFrame implements ActionListener {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    JTextField tfield;
    double temp, temp1, result, a;
    static double m1, m2;
    int k = 1, x = 0, y = 0, z = 0;
    char ch;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, zero, clr, pow2, pow3, exp,
            fac, plus, min, div, log, rec, mul, eq, addSub, dot, sqrt, sin, cos, tan;
    Container cont;
    JPanel textPanel, buttonpanel;

    public Calculator() {
        cont = getContentPane();
        cont.setLayout(new BorderLayout());
        JPanel textpanel = new JPanel();
        tfield = new JTextField(25);
        tfield.setHorizontalAlignment(SwingConstants.RIGHT);
        tfield.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent keyevent) {
                char c = keyevent.getKeyChar();
                if (c >= '0' && c <= '9') {
                } else {
                    keyevent.consume();
                }
            }
        });
        textpanel.add(tfield);
        buttonpanel = new JPanel();
        buttonpanel.setLayout(new GridLayout(7, 4, 2, 2));
        boolean t = true;


        b1 = new JButton("1");
        buttonpanel.add(b1);
        b1.addActionListener(this);
        b2 = new JButton("2");
        buttonpanel.add(b2);
        b2.addActionListener(this);
        b3 = new JButton("3");
        buttonpanel.add(b3);
        b3.addActionListener(this);

        b4 = new JButton("4");
        buttonpanel.add(b4);
        b4.addActionListener(this);
        b5 = new JButton("5");
        buttonpanel.add(b5);
        b5.addActionListener(this);
        b6 = new JButton("6");
        buttonpanel.add(b6);
        b6.addActionListener(this);

        b7 = new JButton("7");
        buttonpanel.add(b7);
        b7.addActionListener(this);
        b8 = new JButton("8");
        buttonpanel.add(b8);
        b8.addActionListener(this);
        b9 = new JButton("9");
        buttonpanel.add(b9);
        b9.addActionListener(this);

        zero = new JButton("0");
        buttonpanel.add(zero);
        zero.addActionListener(this);

        plus = new JButton("+");
        buttonpanel.add(plus);
        plus.addActionListener(this);

        min = new JButton("-");
        buttonpanel.add(min);
        min.addActionListener(this);

        mul = new JButton("*");
        buttonpanel.add(mul);
        mul.addActionListener(this);

        div = new JButton("/");
        div.addActionListener(this);
        buttonpanel.add(div);

        addSub = new JButton("^");
        buttonpanel.add(addSub);
        addSub.addActionListener(this);

        dot = new JButton(".");
        buttonpanel.add(dot);
        dot.addActionListener(this);

        eq = new JButton("=");
        buttonpanel.add(eq);
        eq.addActionListener(this);

        rec = new JButton("1/x");
        buttonpanel.add(rec);
        rec.addActionListener(this);
        sqrt = new JButton("Sqrt");
        buttonpanel.add(sqrt);
        sqrt.addActionListener(this);
        log = new JButton("log");
        buttonpanel.add(log);
        log.addActionListener(this);

        sin = new JButton("SIN");
        buttonpanel.add(sin);
        sin.addActionListener(this);
        cos = new JButton("COS");
        buttonpanel.add(cos);
        cos.addActionListener(this);
        tan = new JButton("TAN");
        buttonpanel.add(tan);
        tan.addActionListener(this);
        pow2 = new JButton("x^2");
        buttonpanel.add(pow2);
        pow2.addActionListener(this);
        pow3 = new JButton("x^3");
        buttonpanel.add(pow3);
        pow3.addActionListener(this);
        exp = new JButton("^");
        exp.addActionListener(this);
        buttonpanel.add(exp);
        fac = new JButton("n!");
        fac.addActionListener(this);
        buttonpanel.add(fac);

        clr = new JButton("AC");
        buttonpanel.add(clr);
        clr.addActionListener(this);
        cont.add("Center", buttonpanel);
        cont.add("North", textpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("1")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "1");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "1");
                z = 0;
            }
        }
        if (s.equals("2")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "2");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "2");
                z = 0;
            }
        }
        if (s.equals("3")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "3");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "3");
                z = 0;
            }
        }
        if (s.equals("4")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "4");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "4");
                z = 0;
            }
        }
        if (s.equals("5")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "5");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "5");
                z = 0;
            }
        }
        if (s.equals("6")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "6");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "6");
                z = 0;
            }
        }
        if (s.equals("7")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "7");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "7");
                z = 0;
            }
        }
        if (s.equals("8")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "8");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "8");
                z = 0;
            }
        }
        if (s.equals("9")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "9");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "9");
                z = 0;
            }
        }
        if (s.equals("0")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "0");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "0");
                z = 0;
            }
        }
        if (s.equals("AC")) {
            tfield.setText("");
            x = 0;
            y = 0;
            z = 0;
        }
        if (s.equals("log")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
            } else {
                a = natLogA(Double.parseDouble(tfield.getText()));
                tfield.setText("");
                tfield.setText(tfield.getText() + a);
            }
        }
        if (s.equals("1/x")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
            } else {
                a = inverse(Double.parseDouble(tfield.getText()));
                tfield.setText("");
                tfield.setText(tfield.getText() + a);
            }
        }
//        if (s.equals("Exp")) {
//            if (tfield.getText().equals("")) {
//                tfield.setText("");
//            } else {
//                a = Math.exp(Double.parseDouble(tfield.getText()));
//                tfield.setText("");
//                tfield.setText(tfield.getText() + a);
//            }
//        }
        if (s.equals("x^2")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
            } else {
                a = squared(Double.parseDouble(tfield.getText()));
                tfield.setText("");
                tfield.setText(tfield.getText() + a);
            }
        }
        if (s.equals("x^3")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
            } else {
                a = cube(Double.parseDouble(tfield.getText()));
                tfield.setText("");
                tfield.setText(tfield.getText() + a);
            }
        }
        if (s.equals("+/-")) {
            if (x == 0) {
                tfield.setText("-" + tfield.getText());
                x = 1;
            } else {
                tfield.setText(tfield.getText());
            }
        }
        if (s.equals(".")) {
            if (y == 0) {
                tfield.setText(tfield.getText() + ".");
                y = 1;
            } else {
                tfield.setText(tfield.getText());
            }
        }
        if (s.equals("+")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
                temp = 0;
                ch = '+';
            } else {
                temp = Double.parseDouble(tfield.getText());
                tfield.setText("");
                ch = '+';
                y = 0;
                x = 0;
            }
            tfield.requestFocus();
        }

        if (s.equals("-")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
                temp = 0;
                ch = '-';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(tfield.getText());
                tfield.setText("");
                ch = '-';
            }
            tfield.requestFocus();
        }
        if (s.equals("/")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
                temp = 1;
                ch = '/';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(tfield.getText());
                ch = '/';
                tfield.setText("");
            }
            tfield.requestFocus();
        }
        if (s.equals("*")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
                temp = 1;
                ch = '*';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(tfield.getText());
                ch = '*';
                tfield.setText("");
            }
            tfield.requestFocus();
        }
        if (s.equals("^")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
                temp = 0;
                ch = '^';
            } else {
                temp = Double.parseDouble(tfield.getText());
                tfield.setText("");
                ch = '^';
                y = 0;
                x = 0;
            }
            tfield.requestFocus();
        }

        if (s.equals("Sqrt")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
            } else {
                a = sqrt(Double.parseDouble(tfield.getText()));
                tfield.setText("");
                tfield.setText(tfield.getText() + a);
            }
        }
        if (s.equals("SIN")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
            } else {
                a = sin(Double.parseDouble(tfield.getText()));
                tfield.setText("");
                tfield.setText(tfield.getText() + a);
            }
        }
        if (s.equals("COS")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
            } else {
                a = cos(Double.parseDouble(tfield.getText()));
                tfield.setText("");
                tfield.setText(tfield.getText() + a);
            }
        }
        if (s.equals("TAN")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
            } else {
                a = tan(Double.parseDouble(tfield.getText()));
                tfield.setText("");
                tfield.setText(tfield.getText() + a);
            }
        }
        if (s.equals("=")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
            } else {
                temp1 = Double.parseDouble(tfield.getText());
                switch (ch) {
                    case '+':
                        result = addition(temp,temp1);
                        break;
                    case '-':
                        result = subtraction(temp ,temp1);
                        break;
                    case '*':
                        result = multiplication(temp,temp1);
                        break;
                    case '/':
                        result = division(temp,temp1);
                        break;
                    case '^':
                        result = pow(temp,temp1);
                        break;

                }
                tfield.setText("");
                tfield.setText(tfield.getText() + result);
                z = 1;
            }
        }
        if (s.equals("n!")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
            } else {
                a = factorial(Double.parseDouble(tfield.getText()));
                tfield.setText("");
                tfield.setText(tfield.getText() + a);
            }
        }
        tfield.requestFocus();
    }

    public double factorial(double n) {
        logger.info("[FACTORIAL] - " + n);
        if (n < 0) {
            System.out.println("Factorial of -ve numbers isn't defined.\n");
            throw new IllegalArgumentException();
        } else {
            double res = fact(n);
            logger.info("[RESULT] - " + res);
            return res;
        }
    }

    public double fact(double n) {
        double factorial = 1;
        for (int i = 1; i <= n; ++i) {
            factorial *= i;
        }
        return factorial;
    }



    public double natLogA(double a) {
        logger.info("[NATURAL LOG A] - " + a);
        if (a <= 0) {
            System.out.println("Logarithm of 0 or -ve numbers isn't defined.\n");
            throw new IllegalArgumentException();
        } else {
            double res = Math.log(a);
            logger.info("[RESULT] - " + res);
            return res;
        }
    }
    public double inverse(double n) {
        logger.info("[inverse] - " + n);
        if (n == 0) {
            System.out.println("inverse of 0 defined.\n");
            throw new IllegalArgumentException();
        } else {
            double res =1/n;
            logger.info("[RESULT] - " + res);
            return res;
        }
    }

    public double squared(double n) {
        logger.info("[SQUARED] - " + n);
        double res = Math.pow(n, 2);
        logger.info("[RESULT] - " + res);
        return res;
    }
    public double cube(double n) {
        logger.info("[SQUARED] - " + n);
        double res = Math.pow(n, 3);
        logger.info("[RESULT] - " + res);
        return res;
    }
    public double sqrt(double n) {
        logger.info("[SQRT] - " + n);
        if (n < 0) {
            System.out.println("Square Root of -ve Numbers isn't defined.\n");
            throw new IllegalArgumentException();
        } else {
            double res = Math.sqrt(n);
            logger.info("[RESULT] - " + res);
            return res;
        }
    }
    public double sin(double x) {
        logger.info("[SIN] - " + x);
        double res = Math.sin(x);
        logger.info("[RESULT] - " + res);
        return res;
    }
    public double cos(double x) {
        logger.info("[COS] - " + x);
        double res = Math.cos(x);
        logger.info("[RESULT] - " + res);
        return res;
    }

    public double tan(double x) {
        logger.info("[TAN] - " + x);
        double res = Math.tan(x);
        logger.info("[RESULT] - " + res);
        return res;
    }
    public double addition(double a, double b) {
        logger.info("[ADDITION] - " + a + " " + b);
        double res = a + b;
        logger.info("[RESULT] - " + res);
        return res;
    }
    public double subtraction(double a, double b) {
        logger.info("[SUBTRACTION] - " + a + " " + b);
        double res = a - b;
        logger.info("[RESULT] - " + res);
        return res;
    }
    public double multiplication(double a, double b) {
        logger.info("[MULTIPLICATION] - " + a + " " + b);
        double res = a * b;
        logger.info("[RESULT] - " + res);
        return res;
    }
    public double division(double a, double b) {
        logger.info("[DIVISION] - " + a + " " + b);
        double res = 0.0;

        if (b <= 0) {
            System.out.println("Cannot Divide By Zero.\n");
            throw new ArithmeticException();
        } else {
            res = a / b;
            logger.info("[RESULT] - " + res);
            return res;
        }
    }
    public double pow(double a, double n) {
        logger.info("[POW] - " + a + " " + n);
        double res = Math.pow(a, n);
        logger.info("[RESULT] - " + res);
        return res;
    }

    public static void main(String args[]) {
        try {
            UIManager
                    .setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
        }
        Calculator f = new Calculator();
        f.setTitle("ScientificCalculator");
        f.pack();
        f.setVisible(true);
    }
}