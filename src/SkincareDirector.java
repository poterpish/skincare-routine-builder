public class SkincareDirector {
    public void makeMorningRoutine(SkincareRoutineBuilder builder) {
        builder
                .setCleanser("Gentle Cleanser")
                .setToner("Hydrating Toner")
                .setMoisturizer("Light Moisturizer")
                .setSunscreen("SPF 50");
    }

    public void makeEveningRoutine(SkincareRoutineBuilder builder) {
        builder
                .setCleanser("Deep Cleanser")
                .setToner("Soothing Toner")
                .setMoisturizer("Night Cream")
                .setSunscreen("Not needed at night");
    }
}
