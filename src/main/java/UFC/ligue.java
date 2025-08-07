package UFC;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@AllArgsConstructor
@ToString

public class ligue {
    private String nom;
    private List<String> joueurs;
    private match macth;


    public List<String> ListerMatch(List<String> liste) {
        return liste;
    }
};