import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Evento> eventos = new ArrayList<>();
        eventos.add(new Evento(9,"JJJ", new Localidad(1,"Bs As",new Ciudad(1,"Mar del Plata"))));
        eventos.add(new Evento(4,"AAA", new Localidad(2,"Bs As",new Ciudad(2,"Miramar"))));
        eventos.add(new Evento(7,"EEE", new Localidad(3,"Bs As",new Ciudad(3,"Balcarce"))));
        eventos.add(new Evento(1,"HHH", new Localidad(4,"Bs As",new Ciudad(4,"Tandil"))));
        eventos.add(new Evento(5,"DDD", new Localidad(5,"Bs As",new Ciudad(5,"Necochea"))));
        eventos.add(new Evento(6,"BBB", new Localidad(6,"Bs As",new Ciudad(6,"Azul"))));

        //ORDEN ID
        List<Evento> traer5xid = eventos.stream()
                .sorted(Comparator.comparingInt(Evento::getId))
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Orden por ID");
        for(int x=0;x<5;x++){
            System.out.println(traer5xid.get(x).getId());
        }



        //ORDEN ALFABETICAMENTE
        Comparator<Evento> comp = new Comparator<Evento>() {

            @Override
            public int compare(Evento c1, Evento c2) {
                return c1.getNombre ().compareTo(c2.getNombre ());
            }
        };
        List<Evento> traer5xorden = eventos.stream()
                .sorted(comp)
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Ordenado Alfabeticamente");
        for(int x=0;x<5;x++){
            System.out.println(traer5xorden.get(x).getNombre());
        }


    }
}
