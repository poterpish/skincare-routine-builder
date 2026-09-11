public class SkincareObjectBuilder implements SkincareRoutineBuilder {

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

    public SkincareRoutine getResult() {
        validateState();

        return new SkincareRoutine(
                cleanser,
                toner,
                moisturizer,
                sunscreen
        );
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