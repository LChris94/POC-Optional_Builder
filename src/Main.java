import java.util.ArrayList;
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

        List<Evento> traer5xid = eventos.stream()
                .filter(inv -> inv.getId() < 5)
                .limit(5)
                .collect(Collectors.toList());
        for(int x=0;x<eventos.size();x++){
            System.out.println(traer5xid.get(x).getNombre());
        }

    }
}
