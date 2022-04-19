public class Chuck extends Pajaro{

    private String Nombre;
    public Chuck(int Daño, String Poder, String Color,String Nombre) {
        super(Daño,Poder,Color);
        this.Nombre = Nombre;
    }
    public void Mostrar() {
        System.out.println("El pajaro "+Nombre+ " hace "+getDaño()+ " de daño, su poder es "+getPoder()+ " para golpear rapidamente y su color es "+getColor());
    }
}