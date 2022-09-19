

public class organ {
    
    private String leftEye;
    private String rightEye;
    private String heart;
    private String stomach;
    private String skin;
    private String quit;

    public organ (String leftEye, String rightEye, String heart, String stomach, String skin, String quit) {
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
        this.quit = quit;
    }

    public void setLeftEye (String leftEye) {
        this.leftEye = leftEye;
    }

    public String getLeftEye () {
        return this.leftEye;
    }

    public void setRightEye (String rightEye) {
        this.rightEye = rightEye;
    }

    public String getRightEye () {
        return this.rightEye;
    }

    public void setHeart (String heart) {
        this.heart = heart;
    }

    public String getHeart () {
        return this.heart;
    }

    public void setStomach (String stomach) {
        this.stomach = stomach;
    }

    public String getStomach () {
        return this.stomach;
    }

    public void setSkin (String skin) {
        this.skin = skin;
    }

    public String getSkin () {
        return this.skin;
    }

    public void setQuit (String quit) {
        this.quit = quit;
    }

    public String getQuit () {
        return this.quit;
    }
}