package UFC;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

public class match extends combattant {
    private String id;
    private String date;
    private String endroit;
    private type type;

    public match(String id, String date, String endroit, combattant , combattant joueur2, type type) {
        super(nom);
        this.id = id;
        this.date = date;
        this.endroit = endroit;
        this.type = type;
    }


    public enum type {
        amicaux, officiel, titre
    }

  public void calculerScore(){
      System.out.println(joueur1.getPoids() + joueur2.getPoids());
  }

  public void mettreAJour(){
        if(type == type.amicaux){
            System.out.println(calculerGagnant();)
        } if(type == type.officiel){

      }if(type == type.titre){
            if(joueur1.getPoids() > joueur2.getPoids()){
                return joueur1.setTitres();
            }
            if(joueur1.getPoids() < joueur2.getPoids()){
                return joueur2.setTitres();
            }
            return ;
      }
  }
 public void calculerGagnant(){
     if(joueur1.getPoids() > joueur2.getPoids()){
         System.out.println("Le "+joueur1+" a gagne");
     }if(joueur1.getPoids() < joueur2.getPoids()){
         System.out.println("Le "+ joueur2+" a gagne");
     }else{
         System.out.println("Match nul");
     }
 }


}
