package nyc.c4q;

/**
 * Created by amyquispe on 5/19/15.
 */
public abstract class AbstractAwesomeClass implements AwesomeInterface {
    public int someData = 4;

    @Override
    public int getData() {
        return this.someData;
    }

    @Override
    public void setData(int someData) {
        this.someData = someData;

    }
}
