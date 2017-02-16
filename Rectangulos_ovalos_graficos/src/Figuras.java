//DEMUESTRA COMO DIBUJAR FIGURAS

import java.awt.Graphics;
import javax.swing.JPanel;

public class Figuras extends JPanel{
    private int opcion; // indica la opcion al usuario sobre que figura dibujar
    //el constructor establece la opcion del usuario
    public Figuras (int opcionUsuario){
        opcion = opcionUsuario; 
    }// fin figura
    
    //con esto dibuja una cascada de figuras, empezando desde la esquina superior izquierda
    public void paintComponet(Graphics g){
        super.paintComponent (g);
        for (int i = 0; i<10; i++){
            //se elije la figura con base en la opcion del usuario
            switch (opcion){
                case 1: // dibuja rectangulos
                    g.drawRect(10+i*10, 10+i*10, 50+1*10, 50+i*10);
                    break;
                case 2: //dibuja ovalos
                    g.drawOval(10+i*10, 10+i*10, 50+1*10, 50+i*10);
                    break;
            }
        }
    }
}
