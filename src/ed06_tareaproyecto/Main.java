 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed06_tareaproyecto;

/**
 *
 * @author ED06
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creación de una instancia de Empleado
        Empleado empleado1 = new Empleado("1245678M","Perico de los Palotes");
        
        //inicialización de atributos de la instancia
        empleado1.setDireccion("C/del Pez,6");
        empleado1.setNumHijos(3);

        
        //Creamos un nuevo empleado
        Empleado empleado2 = new Empleado ("9873256H","Mariano de Triana");
        //inicialización de atributos de la instancia
        empleado2.setDireccion("Pza. de la Aurora, 2");
        empleado2.setNumHijos(1);
        
        imprimir_emp(empleado1);
        imprimir_emp(empleado2);
    }

    public static void imprimir_emp(Empleado queEmpleado) {
        System.out.println("DNI: "+ queEmpleado.getDni());
        System.out.println("Nombre: "+ queEmpleado.getNombre());
        System.out.println("Cargo: "+ queEmpleado.getCargo());
        System.out.println("Número de hijos: "+ queEmpleado.getNumHijos());
        System.out.println("Sueldo: " + queEmpleado.calcula_sueldo(1200));
    }
    
}
