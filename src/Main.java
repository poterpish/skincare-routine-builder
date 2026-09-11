public class Main {
    public static void main(String[] args) {
        SkincareDirector director = new SkincareDirector();

        SkincareObjectBuilder objectBuilder = new SkincareObjectBuilder();
        director.makeMorningRoutine(objectBuilder);

        SkincareRoutine morningRoutine = objectBuilder.getResult();

        System.out.println("MORNING ROUTINE: ");
        System.out.println(morningRoutine);

        System.out.println();

        SkincareGuideBuilder guideBuilder = new SkincareGuideBuilder();
        director.makeEveningRoutine(guideBuilder);

        String eveningGuide = guideBuilder.getResult();

        System.out.println("EVENING GUIDE: ");
        System.out.println(eveningGuide);
    }
}