package prueba;

public class NoCambiaLongitud {

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

    private int valor;
//metodo que modifica el contenido de la posicion posicion de un array con el valor pasado

    public void Visualizar(final int longitud, int[] vector) {
        //Mostramos los elementos del array
        System.out.print("v={");
        for (int i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }



}
//+++++++++++++++++++++++++++++++++++