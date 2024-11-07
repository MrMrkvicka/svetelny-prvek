import java.util.ArrayList;
import java.util.List;

public class KonfiguraceOsvetleni {
    private List<SvetelnyPrvek> svetelnePrvky;



    public KonfiguraceOsvetleni() {
        this.svetelnePrvky = new ArrayList<>();
    }



    public void pridatSvetelnyPrvek(SvetelnyPrvek prvek) {
        svetelnePrvky.add(prvek);
    }

    public void oddelatSvetelnyPrvek(SvetelnyPrvek prvek) {
        svetelnePrvky.remove(prvek);
    }



    public List<SvetelnyPrvek> getSvetelnePrvky() {
        return new ArrayList<>(svetelnePrvky);
    }




}
