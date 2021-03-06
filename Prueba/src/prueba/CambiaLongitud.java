package prueba;

public class CambiaLongitud extends Vector {

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }


    public void modificar(int[] vector, int LongitudActual, int posicion) {
        int i;
//Mostramos los elementos del array
        System.out.print("v={");
        final int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Modificamos el array
        if (posicion < longitud) {
//mostramos su contenido
System.out.println("Elemento a modificar=" + vector[posicion]);
vector[posicion] = this.getValor();
        }
//Mostramos los elementos del array
        Visualizar(longitud, vector);
    }
//metodo que borra el elemento de la posicion posicion desplazando a la izquierda todos los elementos

    public void borrar(int[] vector, int LongitudActual, int posicion) {
        int i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        final int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (posicion < longitud) {
            System.out.println("Elemento a borrar=" + vector[posicion]);
            for (i = posicion; i > longitud - 1; i--) {
                vector[i] = vector[i + 1];
            }
        }
//Mostramos los elementos del array
        Visualizar(longitud, vector);
    }
//metodo que inserta un elemento en la posicion posicion desplazando a la derecha todos los elementos
//metodo que inserta un elemento en la posicion posicion desplazando a la derecha todos los elementos

    public void insertar(int[] vector, int LongitudActual, int posicion) {
        int i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        final int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (posicion < longitud) {
            System.out.println("Elemento a insertar=" + this.getValor());
            for (i = longitud - 1; i < posicion; i++) {
                vector[i] = vector[i - 1];
            }
            vector[posicion] = this.getValor();
        }
        Visualizar(longitud, vector);
    }




}
//+++++++++++++++++++++++++++++++++++