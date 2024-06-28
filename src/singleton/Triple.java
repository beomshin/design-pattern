package singleton;

public class Triple {

    private String name;
    private static  Triple ALPHA = new Triple("ALPHA");
    private static  Triple BETA = new Triple("BETA");
    private static  Triple GAMMA = new Triple("GAMMA");

    private Triple(String name) {
        this.name = name;
    }

    public static Triple getInstance(String name) {
        if (ALPHA.name.equals(name)) {
            return ALPHA;
        } else if (BETA.name.equals(name)) {
            return BETA;
        } else if (GAMMA.name.equals(name)) {
            return GAMMA;
        }
        return null;
    }

    public String getName() {
        return name;
    }
}
