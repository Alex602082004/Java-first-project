package Repos;

import Domain.Comanda;
import Domain.Tort;
import Exceptions.RepoException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class RepoComanda implements RepoInter<Comanda> {
    Vector<Comanda> comenzi;

    public RepoComanda() {
        comenzi = new Vector<>();
    }

    public RepoComanda(Vector<Comanda> comanda) {
        this.comenzi = comanda;
    }

    @Override
    public void add(Comanda c) {
        comenzi.add(c);
    }

    @Override
    public void createComanda(List<Tort> l, Date data) throws FileNotFoundException {
        Comanda c = new Comanda(l, data);
        comenzi.add(c);
    }

    public Vector<Comanda> getComenzi() {
        return comenzi;
    }

    public Comanda getIDComanda(int id) throws RepoException {
        for (Comanda c : comenzi) {
            if (c.getId() == id) {
                return c;
            }
        }
        throw new RepoException("Invalid ID");
    }

    public Comanda getComandait(int it) throws RepoException {
        for (int i = 0; i < comenzi.size(); i++) {
            if (comenzi.elementAt(i) == comenzi.elementAt(it)) {
                return comenzi.elementAt(i);
            }
        }
        throw new RepoException("Invalid comanda!");
    }

    @Override
    public int size() {
        return comenzi.size();
    }

    @Override
    public void createTort(String name) throws IOException {
    }

    @Override
    public Comanda get(int i) throws RepoException {
        for (Comanda c : comenzi) {
            if (c.getId() == i) {
                return c;
            }
        }
        throw new RepoException("Invalid id");
    }

    public Vector<Date> getDate() {
        Vector<Date> date = new Vector<>();
        for (Comanda c : comenzi) {
            date.add(c.getData());
        }
        return date;
    }

    @Override
    public void remove(int i) throws RepoException {
        for (Comanda c : comenzi) {
            if (c.getId() == i) {
                comenzi.remove(c);
                return;
            }
        }
        throw new RepoException("Invalid id");
    }

    public void updateLista(int i, List<Tort> l) throws RepoException {
        for (Comanda c : comenzi) {
            if (c.getId() == i) {
                c.setCakes(l);
                return;
            }
        }
        throw new RepoException("Invalid id");

    }

    public void updateData(int i, Date data) throws RepoException {
        for (Comanda c : comenzi) {
            if (c.getId() == i) {
                c.setData(data);
                return;
            }
        }
        throw new RepoException("Invalid id");
    }

    @Override
    public String toString() {
        return "Comenzi = " + comenzi;
    }
}
