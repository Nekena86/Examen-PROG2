package UFC;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@AllArgsConstructor
@Setter

public class combattant {
    private String id;
    private String nom;
    private String nomCombattant;
    private double poids;
    private List<String> titres;

    public static void main(String[] args) {
        combattant joueur1= new combattant(1,"lala","lala", 12, List.of("lion","dragon"));
        combattant joueur2= new combattant(2,"bema", "bema", 15, List.of("lion","dragon"));
    }
    public void ListerTitre(){
        System.out.println(titres);
    }
}
