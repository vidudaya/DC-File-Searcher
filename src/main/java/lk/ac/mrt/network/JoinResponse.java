package lk.ac.mrt.network;

/**
 * Created by dinu on 11/3/16.
 */
public class JoinResponse extends Response {

    int value;

    public JoinResponse(){ this.type = ResponseType.JOIN;}

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
