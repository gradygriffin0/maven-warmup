public class Countries {
    private String name;
    private String hemisphere;
    private boolean isEnglish;

    public Countries(String name, String hemisphere, boolean isEnglish) {
        this.name = name;
        this.hemisphere = hemisphere;
        this.isEnglish = isEnglish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHemisphere() {
        return hemisphere;
    }

    public void setHemisphere(String hemisphere) {
        this.hemisphere = hemisphere;
    }

    public boolean isEnglish() {
        return isEnglish;
    }

    public void setEnglish(boolean english) {
        isEnglish = english;
    }
}
