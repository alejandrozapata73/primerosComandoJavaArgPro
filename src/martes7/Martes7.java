/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package martes7;

/**
 *
 * @author Usuario
 */
public class Martes7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hola mundo java");
        System.out.println("Hola Mathias");
        //Hola esto es codigo comentado
        System.out.println(10);
        /*
        
        Tipos de datos: String/cadena de caracters
        tipo de datos: numeros ( flotantes, enteros)
        tipo de datos: booleanas
        
        */
        
        System.out.println(true);
        System.out.println(false);
        //operaciones basicas
        System.out.println(10+10);
        System.out.println(10-15);
        System.out.println(10/2);
        System.out.println(10*2);
        System.out.println(10%3);//¿?
        
        int numero1 = 10;
        String nombre = "Eugenia";
        String apellido = "Orozco";
        
        boolean verdad = true;
        boolean mentira = false;
        
        System.out.println("El numero es: " + numero1);
        
        System.out.println("El nombre de usuario es: " + nombre +" "+ apellido);
        
        System.out.println("Verdad: " + verdad);
        System.out.println("Mentira: " + mentira);
        
        //condicionales
        
        //operadores de relacion <,<=,>,>=,!=, ==
        //operadores logicos: And / OR / Not
        //...t.......f = t
        if((8>6) || (5<4)){
        
            System.out.println("Hola se cumple");
            
        }else{
        
            System.out.println("aqui no se cumple!!");
        
        }
        
        int dia = 2;
        
        if(dia==1){
        
            System.out.println("Es lunes");
            
        }else if(dia==2){
            
            System.out.println("Es Martes");
        
            }else if(dia==3){
            
                System.out.println("Es miercoles");
            }
        else{

             System.out.println("no ha elegido ningun dia");
            }
        
        
        switch(dia){
            
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es Martes");
                break;
            default:
               System.out.println("no ha elegido...");
               break;
        
        }
        
        
        int contadores = 0;
        
        contadores = contadores + 1;
        contadores++;
        contadores +=1;
        
        System.out.println("Contador: " + contadores);
        
        contadores--;
        contadores -= 1;
        
        int reloj = 0;
       
        while(reloj<10){
        
            
            System.out.println("Hola while: " + reloj);
            
            if(reloj==5){
            
                reloj=20;
            }
            
            reloj++;
        
        
        }
        
        //
        int [] numeros = {10,4,8,9};
        String [] peliculas = {"Batman","transformer","avatar 2","Teen titans","piratas del caribe"};
        
        String pelicula1 = "Batman";
        String pelicula2 = "Transfomer";
        String pelicula3 = "avatar2";
        
        
        System.out.println("Valor array" + numeros[0]);
        System.out.println("Valor array" + numeros[1]);
        System.out.println("Valor array" + numeros[2]);
        System.out.println("Valor array" + numeros[3]);
        //System.out.println("Valor array" + numeros[4]);
        
        System.out.println("Valor array Peliculas: " + peliculas[0]);
        
        System.out.println("Cantidad peliculas: "+ peliculas.length);
        
        for(int i=0;i<peliculas.length;i++){
        
            System.out.println("peliculas: ..." + peliculas[i]);
        }
        
        
        int [] edades = {45,24,36,47,18,36};
        
        int acumulador = 0;
        
        double promedio = 0;
      
        System.out.println("Valor acumulador: " + acumulador);
        
       
        for(int i=0;i<edades.length;i++){
        
            acumulador = acumulador + edades[i];
            
        
        }
        
        System.out.println("Valor acumulador final: " + acumulador);
        
        promedio = acumulador / edades.length;
        
        System.out.println("El promedio de edad es: " + promedio);
        
    }
    
}
