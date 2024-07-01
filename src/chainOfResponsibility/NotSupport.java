package chainOfResponsibility;

public class NotSupport extends Support{

    public NotSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
