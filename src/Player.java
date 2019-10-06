import java.util.ArrayList;
import java.util.List;

/**
 * Created by priya on 06/10/19
 */
public class Player {
    private String name;
    private List<Character> pinsDrop = new ArrayList<>();

    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Character> getPinsDrop() {
        return pinsDrop;
    }

    public void addPinDrop(Character drop) {
        this.pinsDrop.add(drop);
    }
}
