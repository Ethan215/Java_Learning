import java.awt.*;
import java.security.PublicKey;
import javax.swing.*;

public class JavaTest {
    public static void main(String args[]){
        int age = 50;
        if(age > 20 && age < 30){
            System.out.println("This is false");
        }
        System.out.println("we don't go through the if-condition");
        int a = 4;
        int b = 4;
        if((a >1 )&& ((++b )< 90)){
            System.out.println(" if stasify the condtion" +
                    "we can get the b is : " + b);
        }
        String river = "Mississippi";
        System.out.println(river.replace("issipp","our"));

        // Create the frame code
        JFrame frame = new JFrame();
        frame.setSize(300,400);
        frame.setTitle(("An empty frame"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RectangleComponent component = new RectangleComponent();
        frame.add(component);

        frame.setVisible(true);
    }
    public static class RectangleComponent extends JComponent
    {
        public void paintComponent(Graphics g)
        {
            Graphics2D g2 = (Graphics2D)g;
            Rectangle box = new Rectangle(5,10,20,30);
            g2.draw(box);
            box.translate(15,25);
            g2.draw(box);
        }
    }


}
