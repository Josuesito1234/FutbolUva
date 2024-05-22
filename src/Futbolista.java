public class Futbolista extends Carrera{
    private int Dorsal;
    private String Demarcacion;

    @Override
    public void Concentrarse(){
        System.out.println("El futbolista esta concentrado");
    }
    public void Viajar(){
        System.out.println("El futbolista esta viajando");
    }
    public void JugarPartido(){
        System.out.println("El futbolista esta jugando");
    }
    public void Entrenar(){
        System.out.println("El futbolista esta entrenado");
    }
    public Futbolista(){}
    public Futbolista(int pId, String pNombre, String pApellido, int pEdad, int pDorsal,
                      String pDemarcacion) {
        super(pId, pNombre, pApellido, pEdad);
        this.Dorsal = pDorsal;
        this.Demarcacion = pDemarcacion;
    }

    public int getDorsal(){
        return Dorsal;
    }
    public void setDorsal(int pDorsal){
        this.Dorsal = pDorsal;
    }
    public String getDemarcacion(){
        return Demarcacion;
    }
    public void setDemarcacion(String pDemarcacion){
        this.Demarcacion = pDemarcacion;
    }
}
