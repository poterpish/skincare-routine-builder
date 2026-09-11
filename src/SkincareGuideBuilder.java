public class SkincareGuideBuilder implements SkincareRoutineBuilder {

    private String cleanser;
    private String toner;
    private String moisturizer;
    private String sunscreen;

    @Override
    public SkincareRoutineBuilder setCleanser(String cleanser) {
        this.cleanser = cleanser;
        return this;
    }
    @Override
    public SkincareRoutineBuilder setToner(String toner) {
        this.toner = toner;
        return this;
    }
    @Override
    public SkincareRoutineBuilder setMoisturizer(String moisturizer) {
        this.moisturizer = moisturizer;
        return this;
    }
    @Override
    public SkincareRoutineBuilder setSunscreen(String sunscreen) {
        this.sunscreen = sunscreen;
        return this;
    }

    public String getResult() {
        validateState();
        return "Skincare Guide:\n" +
                "1. Cleanser: " + cleanser + "\n" +
                "2. Toner: " + toner + "\n" +
                "3. Moisturizer: " + moisturizer + "\n" +
                "4. Sunscreen: " + sunscreen;
    }

    private void validateState() {
        if (cleanser == null || cleanser.isBlank()) {
            throw new IllegalStateException("Cleanser is required");
        }

        if (moisturizer == null || moisturizer.isBlank()) {
            throw new IllegalStateException("Moisturizer is required");
        }
    }
}