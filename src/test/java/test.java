
import UFC.ligue;
import UFC.match;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

@Getter
@AllArgsConstructor

public class test {
    @Test
    public  void testListerMatch() {
         match match = new match("dragon", "12/03/2025","Mahamasina","lala","bema", UFC.match.type.amicaux);
         match match1 = new match("lion","15/03/24", "Besarety", );

        ligue ligue = new ligue();
        ligue.ListerMatch(List.of(ligue));

        Assertions.assertEquals(ligue.ListerMatch(());
    }

}
