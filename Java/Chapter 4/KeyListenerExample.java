import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample extends Frame implements KeyListener {
    TextField tf;
    Label l;
    KeyListenerExample(){
        setLayout(new FlowLayout());
        tf=new TextField(20);
        l=new Label("Typed Text:");
        tf.addKeyListener(this);
        add(tf); add(l);
        setSize(400,200);
        setVisible(true);
    }
    public void keyPressed(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){
        l.setText("Typed Text: "+tf.getText()+e.getKeyChar());
    }
    public static void main(String[] args){
        new KeyListenerExample();
    }
}
