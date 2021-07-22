public class Main {
    public static void main(String[] args) {
        Countries America = new Countries("America", "Western", true);
        Countries China = new Countries("China", "Eastern", false);
        Countries Mexico = new Countries("Mexico", "Western", false);

        System.out.println(America.getHemisphere());
        System.out.println(China.getName());
        System.out.println(Mexico.isEnglish());

    }
}
