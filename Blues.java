public class Blues extends Pajaro{
    private String Nombre;
    public Blues(int Daño, String Poder, String Color,String Nombre) {
        super(Daño,Poder,Color);
        this.Nombre = Nombre;
    }
    public void Mostrar() {
        System.out.println("El pajaro "+Nombre+ " hace "+getDaño()+ " de daño, su poder es "+getPoder()+ " dividiendose en 3 pajaros y su color es "+getColor());
    }

}