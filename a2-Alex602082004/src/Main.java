import Domain.Comanda;
import Domain.Tort;
import Exceptions.RepoException;
import Repos.RepoComanda;
import Repos.RepoTort;
import Services.ServiceComanda;
import Services.ServiceTort;
import UI.UInterface;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws IOException, RepoException {
        Calendar calendar = Calendar.getInstance();
        Tort t1 = new Tort("vanilie");
        Tort t2 = new Tort("caramel");
        Tort t3 = new Tort("bezea");
        Tort t4 = new Tort("cioco");
        Tort t5 = new Tort("mousse");
        List<Tort> torturi1 = Arrays.asList(t1, t2, t3, t4, t5);
        List<Tort> torturi2 = Arrays.asList(t1, t2, t3);


        calendar.set(2024, Calendar.MARCH, 1);
        Comanda c1 = new Comanda(torturi1, calendar.getTime());
        calendar.set(2024, Calendar.MAY, 3);
        Comanda c2 = new Comanda(torturi2, calendar.getTime());
        calendar.set(2024, Calendar.MARCH, 3);
        Comanda c3 = new Comanda(torturi1, calendar.getTime());

        RepoTort r = new RepoTort();
        RepoComanda c = new RepoComanda();

        c.add(c1);
        c.add(c2);
        c.add(c3);

        r.add(t1);
        r.add(t2);
        r.add(t3);
        r.add(t4);
        r.add(t5);

        ServiceTort st = new ServiceTort(r);
        ServiceComanda sc = new ServiceComanda(c, r);
        UInterface ui = new UInterface(sc, st);
        ui.run();

    }
}
