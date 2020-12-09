import javax.swing.JFrame;

class mygui{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        //frame.setDefaultCloseOperation();
        frame.setTitle("first Gui application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
    }
}