public class Entrenador extends Carrera{
    private String Federacion;
    @Override
    public void Concentrarse(){
        System.out.println("El entranador esta concentrado");
    }
    public void Viajar(){
        System.out.println("El entranador esta viajando");
    }
    public void DirigurPartido(){
        System.out.println("El entrenador esta dirigiendo el partido");
    }
    public void DirigirEntrenamiento(){
        System.out.println("El entrenador esta dirigiendo los entrenamientos");
    }
    public Entrenador(){
    }
    public Entrenador(int pId, String pNombre, String pApellido, int pEdad, String pFederacion) {
        super(pId, pNombre, pApellido, pEdad);
        this.Federacion = pFederacion;
    }
    public String getFederacion() {
        return Federacion;
    }
    public void setFederacion(String pFederacion) {
        this.Federacion = pFederacion;
    }
}
