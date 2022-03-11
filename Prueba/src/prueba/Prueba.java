package prueba;

public class Prueba {

    public int valor;
//metodo que modifica el contenido de la posicion posicion de un array con el valor pasado

    public void modificar(int[] vector) {
        int i;
        int posicion = 1;
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Modificamos el array
        if (posicion < vector.length) {
//mostramos su contenido
System.out.println("Elemento a modificar=" + vector[posicion]);
vector[posicion] = this.valor;
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }
//metodo que borra el elemento de la posicion posicion desplazando a la izquierda todos los elementos

    public void borrar(int[] vector) {
        int posicion = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (posicion < vector.length) {
            System.out.println("Elemento a borrar=" + vector[posicion]);
            for (i = posicion; i > vector.length - 1; i--) {
                vector[i] = vector[i + 1];
            }
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }
//metodo que inserta un elemento en la posicion posicion desplazando a la derecha todos los elementos

    public void insertar(int[] vector) {
        int posicion = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (posicion < vector.length) {
            System.out.println("Elemento a insertar=" + this.valor);
            for (i = vector.length - 1; i < posicion; i++) {
                vector[i] = vector[i - 1];
            }
            vector[posicion] = this.valor;
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }



}
//+++++++++++++++++++++++++++++++++++