public class App {
    public static void main(String[] args){
        Futbolista obj = new Futbolista();

        obj.setNombre("Jorge");
        obj.setApellido("Lopez");
        obj.setEdad(21);
        obj.setDorsal(7);
        obj.setDemarcacion("Delantero");

        System.out.println("El Nombre del Jugador es " + obj.getNombre() + " su apellido es "
                + obj.getApellido() + " su edad " + obj.getEdad() + " su dorsal es el numero " + obj.getDorsal() + " y su demarcacion es "
                + obj.getDemarcacion());
        obj.Concentrarse();
        obj.Viajar();
        obj.JugarPartido();
        obj.Entrenar();

        Entrenador objj = new Entrenador();
        objj.setNombre("Mario");
        objj.setApellido("Aguilar");
        objj.setEdad(43);
        objj.setFederacion("REEF");
        System.out.println("El Nombre del Entrenador es " + objj.getNombre() + " su apellido es "
                + objj.getApellido() + " su edad " + objj.getEdad() + " y su federacion es " + objj.getFederacion());
        objj.Concentrarse();
        objj.Viajar();
        objj.DirigurPartido();
        objj.DirigirEntrenamiento();


        Masajista obje = new Masajista();
        obje.setNombre("Carlos");
        obje.setApellido("Ruiz");
        obje.setEdad(50);
        obje.setTitulacion("Quiropractico");
        obje.setAñosDeExpe(9);
        System.out.println("El Nombre del Masajista es " + obje.getNombre() + " su apellido es "
                + obje.getApellido() + " su edad " + obje.getEdad() + " su Titulacion es " + obje.getTitulacion() + " y sus años de experiencia son "
        + obje.getAñosDeExpe());
        obje.Concentrarse();
        obje.Viajar();
        obje.DarMasaje();


        System.out.println("Este es el cambioo >:)");
        System.out.println("Este es el cambio de Esaú osea mio");

        System.out.println("Este es el cambio de natita:3");
        System.out.println("El barcita por siempre no madrilistas");

    }
}
