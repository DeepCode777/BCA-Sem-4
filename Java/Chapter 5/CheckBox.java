import java.awt.*;
public class CheckBox{
    CheckBox() {
        Frame f = new Frame("Checkbox");
        Checkbox cb = new Checkbox("C++");
        cb.setBounds(100, 100, 50, 50);
        
        Checkbox cb2 = new Checkbox("Java", true);
        cb2.setBounds(100, 150, 50, 50);
        
        f.add(cb);
        f.add(cb2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]) {
        CheckBox r = new CheckBox();
    }
}