public class CCuenta {

    //Las variables de la clase.
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo) //El constructor de la clase CCuenta.
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado() //La funcion que devuelve el numero de saldo.
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception //La funcion que utilizamos para aumentar la cantidad de dinero.
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception //La funcion que utilizamos para reducir la cantidad de dinero.
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
