package Domain;

import java.io.IOException;

public class Tort extends ID {
    String CakeType;

    public Tort() throws IOException {
        super();
        this.CakeType = "";
    }

    public Tort(String CakeType) throws IOException {
        super();
        this.CakeType = CakeType;

    }

    public String getCakeType() {
        return CakeType;
    }

    public void setCakeName(String CakeType) {
        this.CakeType = CakeType;
    }

    @Override
    public String toString() {
        return "\nTort{" +
                "id=" + id +
                ", CakeType=" + CakeType +
                '}';
    }
}
