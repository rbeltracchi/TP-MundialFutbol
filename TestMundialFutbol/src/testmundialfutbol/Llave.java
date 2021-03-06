package testmundialfutbol;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yaki's
 */
public class Llave extends EtapaMundial {

@Override
    public List<Equipo> getEquiposQueAvanzan() {
        List<Equipo> parti2 = new ArrayList<>();
        //Recorre la lista de partidos y devuelve los equipos que pasan de ronda, sin empates
        for (Partido llave : super.getPartidos()) {
            if (llave.getResultado().ganoLocal()) {
                parti2.add(llave.getLocal());
            }
            if (llave.getResultado().ganoVisitante()) {
                parti2.add(llave.getVisitante());
            }
        }
        return parti2;
    }

}
