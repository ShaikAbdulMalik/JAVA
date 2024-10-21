import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello!! "+name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));//parseint allows you to change a datatype from string to int
        JOptionPane.showMessageDialog(null, "You are "+age+"Years old");

    }
}
