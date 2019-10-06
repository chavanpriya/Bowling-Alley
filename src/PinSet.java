/**
 * Created by priya on 06/10/19
 */
public class PinSet {
    private static final int TOTAL = 10;
    private int available = TOTAL;
    private int ballsThrown = 0;

    public boolean isSetFinish() {
        return ballsThrown == 2 || available == 0;
    }

    public void ballThrown(Character pinDrop) {
        if(pinDrop == 'x' || pinDrop == '/') {
            available = 0;
        } else {
            available -= Integer.parseInt(String.valueOf(pinDrop));
        }
        ballsThrown++;
    }

}
