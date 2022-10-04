

public class organ {
    
    private final String leftEye;
    private final String rightEye;
    private final String heart;
    private final String stomach;
    private final String skin;
    private final String quit;

    public organ (String leftEye, String rightEye, String heart, String stomach, String skin, String quit) {
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
        this.quit = quit;
    }

    public String getLeftEye () {
        return this.leftEye;
    }

    public String getRightEye () {
        return this.rightEye;
    }
    public String getHeart () {
        return this.heart;
    }
    public String getStomach () {
        return this.stomach;
    }
    public String getSkin () {
        return this.skin;
    }
    public String getQuit () {
        return this.quit;
    }
}