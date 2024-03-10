package day5;

import javax.swing.JFrame;

class FirstGUI {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html
        // https://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html#constructor_summary
        JFrame frame = new JFrame("My First GUI");


        // https://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html#method_summary

        // https://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html#setDefaultCloseOperation(int)
        // https://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html#field_detail
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Methods inherited from class java.awt.Frame... (awt == "Abstract Windows Toolkit")

        // https://docs.oracle.com/javase/7/docs/api/java/awt/Frame.html#setTitle(java.lang.String)
        // frame.setTitle("My First GUI");


        // Methods inherited from class java.awt.Window...

        // https://docs.oracle.com/javase/7/docs/api/java/awt/Window.html#setSize(int,%20int)
        frame.setSize(800, 400);

        // https://docs.oracle.com/javase/7/docs/api/java/awt/Window.html#setVisible(boolean)
        frame.setVisible(true);
    }
}


// We're using JAVA 11 and so it would be best to use the documentation for JAVA 11.
// Upon comparing the two, you will find that there are very few differences.
// Because the JAVA 7 links are shorter, I'll use them for the remaining snippets.

// https://docs.oracle.com/en/java/javase/11/docs/api/java.desktop/javax/swing/JFrame.html
// https://docs.oracle.com/en/java/javase/11/docs/api/java.desktop/javax/swing/JFrame.html#constructor.summary
// https://docs.oracle.com/en/java/javase/11/docs/api/java.desktop/javax/swing/JFrame.html#method.summary
// https://docs.oracle.com/en/java/javase/11/docs/api/java.desktop/javax/swing/JFrame.html#setDefaultCloseOperation(int)
// https://docs.oracle.com/en/java/javase/11/docs/api/java.desktop/javax/swing/JFrame.html#field.detail
// https://docs.oracle.com/en/java/javase/11/docs/api/java.desktop/java/awt/Frame.html#setTitle(java.lang.String)
// https://docs.oracle.com/en/java/javase/11/docs/api/java.desktop/java/awt/Window.html#setSize(int,int)
// https://docs.oracle.com/en/java/javase/11/docs/api/java.desktop/java/awt/Window.html#setVisible(boolean)
