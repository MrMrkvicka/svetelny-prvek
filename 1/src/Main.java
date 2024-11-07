


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        SvetelnyPrvek svetelnyprvek1 = new SvetelnyPrvek("led",200,20,true,LocalDate.of(2024,10,24), 20,50);
        SvetelnyPrvek svetelnyprvek2 = new SvetelnyPrvek("led",200,30,true,LocalDate.of(2024,10,24),30,50);
        SvetelnyPrvek svetelnyprvek3 = new SvetelnyPrvek("led",200,240,true,LocalDate.of(2024,10,24),40,50);


        List<SvetelnyPrvek> evidence = new ArrayList<>();
        evidence.add(svetelnyprvek1);
        evidence.add(svetelnyprvek2);
        evidence.add(svetelnyprvek3);

        for (SvetelnyPrvek prvek : evidence) {
            System.out.println("typ " + prvek.getTyp() + " a intenzita " + prvek.getIntenzita());
        }

        int x = 0;

        for(int i = 0; i < evidence.size(); i++) {
            x += evidence.get(i).getCena();
        }
        System.out.println(x);

        for(SvetelnyPrvek prvek : evidence) {
            if(prvek.getCena()>= 150){
                System.out.println(prvek.getTyp() +" "+ prvek.getX() +" "+ prvek.getY());

            }
        }

    }
}