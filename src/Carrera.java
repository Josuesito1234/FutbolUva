public class Carrera {
    private int id;
    private String Nombre;
    private String Apellido;
    private int Edad;

    public void Concentrarse(){
        System.out.println("Ta concentrado");
    }
    public void Viajar(){
        System.out.println("Viajando");
    }
    public Carrera() {
    }
    public Carrera(int pId, String pNombre, String pApellido, int pEdad){
        this.id = pId;
        this.Nombre = pNombre;
        this.Apellido = pApellido;
        this.Edad = pEdad;
    }
    public int getId(){
        return id;
    }
    public void setId(int pId){
        this.id = pId;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String pNombre){
        this.Nombre = pNombre;
    }
    public String getApellido(){
        return Nombre;
    }
    public void setApellido(String pNombre){
        this.Nombre = pNombre;
    }
    public int getEdad(){
        return id;
    }
    public void setEdad(int pEdad){
        this.id = pEdad;
    }
}
