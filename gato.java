
/**
 * Write a description of class gao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gato
{
    // instance variables - replace the example below with your own
    private String nombre="mish";
    private int edad=3;
    private float peso=1.0f;

    /**
     * Constructor for objects of class perro
     */
    public int edadHumana(){
        return edad*4;
    }
    public String interactuar(){
        return "miau";
    }
    public void imprimeInformacion(){
        System.out.println("soy un gato comiendo wiska,"+edad+" años. Me llamo "+nombre);
    }
    public void alimentar (int tipoDeComida){
         if (tipoDeComida==0)
            System.out.println("es un gato comiendo wiska");
        else
            System.out.println("es un gato comiendo atum");
    }
}
