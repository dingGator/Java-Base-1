import java.awt.*;

/**
 * Created by Ki on 10/31/2016.
 */
public class MyWindow extends Frame {
    public MyWindow(String title){
        super(title);
        setSize(500, 140);
        addWindowListener(mew WindowAdapter(){
            @Override
            public void windowClosed(WindowEvent e){
                    System.exit(0);
            }
        });
    }
    @Override
    public void paint(Graphics g){
        super.paint;
    }
}
