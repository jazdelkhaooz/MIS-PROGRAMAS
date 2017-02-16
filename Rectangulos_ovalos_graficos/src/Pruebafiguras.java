import javax.swing.JFrame; // para manejar la pantalla
import javax.swing.JOptionPane;// para manejar la entrada

/**
 *
 * @author Xavier
 */
public class Pruebafiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("ESCRIBA 1 PARA DIBUJAR RECTANGULOS\n" + 
                "ESCRIBA 2 PARA DIBUJAR OVALOS");
        
        int opcion = Integer.parseInt(entrada); // convierte la entrada en int
        // CREA EL PANEL CON LA ENTRADA DEL USUARIO
        
        Figuras panel = new Figuras(opcion);
        //se crea una instancia de la clase Figuras
        JFrame  aplicacion = new JFrame(); // crea un nuevo objeto Frame
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);// agrega el panel al marco
        aplicacion.setSize(300, 300);// establece el tamaño deseado
        aplicacion.setVisible(true); //muestra el marco
    }
    
}
