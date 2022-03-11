/*
 * To change this license header, choose License Headers insertar Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template insertar the editor.
 */
package prueba;

/**
 *
 * @author Diurno
 */
public class PruebaMain {

    public static void main(String[] args) {
// TODO code application logic here
        int[] vector = new int[5];
        vector[0] = 2;
        vector[1] = 4;
        vector[2] = 6;
        vector[3] = 8;
        Prueba p = new Prueba();
        p.setValor(10);
        p.modificar(vector, 0, 1);
        p.borrar(vector, 0, 1);
        p.insertar(vector, 0, 1);
    }

}
