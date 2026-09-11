public class SkincareRoutine {
    private final String cleanser;
    private final String toner;
    private final String moisturizer;
    private final String sunscreen;

    SkincareRoutine(String cleanser, String toner, String moisturizer, String sunscreen) {
        this.cleanser = cleanser;
        this.toner = toner;
        this.moisturizer = moisturizer;
        this.sunscreen = sunscreen;
    }

    @Override
    public String toString() {
        return "SkincareRoutine{" +
                "cleanser='" + cleanser + '\'' +
                ", toner='" + toner + '\'' +
                ", moisturizer='" + moisturizer + '\'' +
                ", sunscreen='" + sunscreen + '\'' +
                '}';
    }
}
