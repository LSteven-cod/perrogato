
/**
 * Write a description of class perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class perro
{
    // instance variables - replace the example below with your own
    private String nombre="titan";
    private int edad=2;
    private float peso=1.0f;

    /**
     * Constructor for objects of class perro
     */
    public int edadHumana(){
       return edad*7; 
    }
    public String Interactuar(){
        return "guau";
    }
    public void imprimeInformacion(){
        System.out.println("es un perro comiendo carne,tengo "+edad+" años. y me llamo "+nombre);
    }
    public void alimentar(int tipoDeComida){
        if (tipoDeComida==0)
            System.out.println("es un perro comiendo carne");
        else
            System.out.println("es un perro comiendo croquetas");
    }
}
