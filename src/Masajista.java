public class Masajista extends Carrera{
    private String Titulacion;
    private Integer AñosDeExpe;

    @Override
    public void Concentrarse(){
        System.out.println("El masajista esta concentrado");
    }
    public void Viajar(){
        System.out.println("El masajista esta viajando");
    }
    public void DarMasaje(){
        System.out.println("Esta masajeando");
    }
    public Masajista(){
    }
    public Masajista(int pId, String pNombre, String pApellido, int pEdad,
                     String pTitulacion, Integer pAñosDeExpe) {
        super(pId, pNombre, pApellido, pEdad);
        this.Titulacion = pTitulacion;
        this.AñosDeExpe = pAñosDeExpe;
    }
    public String getTitulacion() {
        return Titulacion;
    }
    public void setTitulacion(String pTitulacion) {
        this.Titulacion = pTitulacion;
    }
    public Integer getAñosDeExpe() {
        return AñosDeExpe;
    }
    public void setAñosDeExpe(Integer pAñosDeExpe) {
        this.AñosDeExpe = pAñosDeExpe;
    }
}
