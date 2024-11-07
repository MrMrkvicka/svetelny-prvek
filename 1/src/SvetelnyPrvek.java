import java.time.LocalDate;

public class SvetelnyPrvek {




    private String typ;
    private int intenzita;
    private int cena;
    private boolean vNabidce;
    private LocalDate datum;
    private int x;
    private int y;

    public SvetelnyPrvek(String typ, int intenzita, int cena, boolean vNabidce, LocalDate datum,int x,int y) {
        this.typ = typ;
        this.intenzita = intenzita;
        this.cena = cena;
        this.vNabidce = vNabidce;
        this.datum = datum;
        this.x = x;
        this.y = y;

    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public boolean isvNabidce() {
        return vNabidce;
    }

    public void setvNabidce(boolean vNabidce) {
        this.vNabidce = vNabidce;
    }

    public int getIntenzita() {
        return intenzita;
    }

    public void setIntenzita(int intenzita) {
        this.intenzita = intenzita;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
