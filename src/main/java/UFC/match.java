package UFC;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

public class match{
    private String id;
    private String date;
    private String endroit;
    private combattant joueur1;
    private combattant joueur2;
    private type type;

    public match(String id, String date, String endroit, combattant joueur1, combattant joueur2){
        this.id = id;
        this.date = date;
        this.endroit = endroit;
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.type = type;
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
