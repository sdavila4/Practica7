public class Red extends Pajaro{
    private String Nombre;
    //Pajaro red no tiene poderes
    public Red(int Daño, String Poder, String Color,String Nombre) {
        super(Daño,Poder,Color);
        this.Nombre = Nombre;
    }
    public void Mostrar() {
        System.out.println("El pajaro "+Nombre+ " hace "+getDaño()+ " de daño, su color es "+getColor());
    }

}