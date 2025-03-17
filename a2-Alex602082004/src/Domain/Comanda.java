
package Domain;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Comanda extends ID {
    List<Tort> cakes;
    Date data;


    public Comanda() throws FileNotFoundException {
        super();
        this.cakes = new ArrayList<>();
        this.data = new Date();
    }

    public Comanda(List<Tort> cakes, Date data) throws FileNotFoundException {
        super();
        this.cakes = cakes;
        this.data = data;
    }

    public List<Tort> getCakes() {
        return cakes;
    }

    public void addTort(Tort t) {
        cakes.add(t);
    }

    public void setCakes(List<Tort> cakes) {
        this.cakes = cakes;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nComanda{" +
                "id = " + id +
                ", cakes = " + cakes +
                ", data = " + data +
                '}' + "\n";
    }
}
