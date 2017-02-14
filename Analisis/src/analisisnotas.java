import java.util.Scanner;

public class analisisnotas {
    public void procesarResultadosE(){
        //crea objeto Scanner para obtener la entrada de la ventada de comandos
        Scanner entrada = new Scanner (System.in);
        //se inicializan las variables
        int aprobadas = 0;
        int reprobadas = 0;
        int contadorEstudiante = 1;
        int resultado;
        
        //procesar los 10 estudiantes, usando ciclo controlado por contador
        while (contadorEstudiante <= 10) 
        {   
            //pide al usuario la entrada y se obtiene el valor
            System.out.print("escriba el resultado(1 = aparobado, 2 = reprobado): ");
            resultado = entrada.nextInt();
            
            // aqui hay un if anidado en el while
            if (resultado == 1)//si resultado es 1
                aprobadas = aprobadas + 1; // incrementa aprobados
            else    // caso contrario resultado no es 1
                reprobadas = reprobadas + 1; // incrementa en 1 reprobados
            
            //incrementa contadorEstudiantes, para que el ciclo termine en un momento dado
            contadorEstudiante = contadorEstudiante + 1;
            
        } // fin while
        
        // fase de terminacion prepara la fase de resultados
        System.out.printf("Aprobados: %d\nReprobados: %d", aprobadas, reprobadas);
        
        // otro if anidado para determinar si más de 8 estudiantes aprobaron
        if (aprobadas > 8)
            System.out.println("PASAN DE AÑO");
    }
}
