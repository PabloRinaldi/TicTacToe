package TicTacToe;

import javax.swing.JOptionPane;

public class TicTacToe {

    public static void main(String[] args) {
        String nombre1, nombre2;
        Ventana vn = new Ventana();
        
        nombre1 = JOptionPane.showInputDialog(null,"Ingrese el nombre del primer jugador lala");
        nombre2 = JOptionPane.showInputDialog(null,"Ingrese el nombre del segundo jugador");
        
        vn.setLocationRelativeTo(vn);
        vn.setNombre(nombre1, nombre2);
        vn.setVisible(true);
    }
    
}
