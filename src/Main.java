import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        organ Organs = new organ("1. Left Eye", "2. Right Eye", "3. Heart", "4. Stomach", "5. Skin", "6. Quit");

        System.out.println("You are a doctor... 患者的命运掌握在你手上");

        try (Scanner numberScanner = new Scanner(System.in)) {
            for (int i = 0; i<999999999; i++) {
                System.out.println(Organs.getLeftEye());
                System.out.println(Organs.getRightEye());
                System.out.println(Organs.getHeart());
                System.out.println(Organs.getStomach());
                System.out.println(Organs.getSkin());
                System.out.println(Organs.getQuit());
                System.out.println("Please choose an organ...");
                    int input1 = numberScanner.nextInt();
                    if (input1==1) {
                        states States1 = new states("Left Eye", "blind", "Blue", "0");
                        System.out.println("Name: " + States1.getName());
                        System.out.println("Medical States: " + States1.getMedicalStates());
                        System.out.println("Color: " + States1.getColor());
                        System.out.println("请开始你的表演...");
                        System.out.println("     1. Replace with a good eyeball");
                        System.out.println("     2. Destroy this eyeball");
                        int input2 = numberScanner.nextInt();
                        switch (input2) {
                            case 1 -> System.out.println("Eyeball replaced");
                            case 2 -> System.out.println("Eyeball destroyed...   你真jb牛逼");
                            default -> System.out.println("no action");
                        }
                    } else if (input1==2) {
                        states States2 = new states("Right Eye", "Short Sighted", "Green", "0");
                        System.out.println("Name: " + States2.getName());
                        System.out.println("Medical States: " + States2.getMedicalStates());
                        System.out.println("Color: " + States2.getColor());
                        System.out.println("请开始你的表演...");
                        System.out.println("     1. Cure this eyeball");
                        System.out.println("     2. Destroy this eyeball");
                        int input3 = numberScanner.nextInt();
                        switch (input3) {
                            case 1 -> System.out.println("Eyeball cured");
                            case 2 -> System.out.println("Eyeball destroyed...   你真jb牛逼");
                            default -> System.out.println("no action");
                        }
                    } else if (input1==3) {
                        states States3 = new states("Heart", "Miocardial Infarction (心肌梗塞)", "90");
                        System.out.println("Name: " + States3.getName());
                        System.out.println("Medical States: " + States3.getMedicalStates());
                        System.out.println("Heart Rate: " + States3.getHeartRate());
                        System.out.println("请开始你的表演...");
                        System.out.println("     1. Cure this heart");
                        System.out.println("     2. Crush this eyeball");
                        System.out.println("     3. Change the heart rate to 1000");
                        int input4 = numberScanner.nextInt();
                        switch (input4) {
                            case 1 -> System.out.println("Heart cured");
                            case 2 -> System.out.println("Heart destroyed...  牛逼");
                            case 3 -> System.out.println("Heart rate changed to 1000...");
                            default -> System.out.println("no action");
                        }
                    }else if (input1==4) {
                        states States4 = new states("stomach", "Gastric Cancer(胃癌)");
                        System.out.println("Name: " + States4.getName());
                        System.out.println("Medical States: " + States4.getMedicalStates());
                        System.out.println("请开始你的表演...");
                        System.out.println("     1. Cure this stomach");
                        System.out.println("     2. Bomb this stomach");
                        int input5 = numberScanner.nextInt();
                        switch (input5) {
                            case 1 -> System.out.println("Cancer cured");
                            case 2 -> {
                                System.out.println("Stomach bombed...");
                                System.out.println("Congratulations! 你把自己也一起炸死了！患者们敲锣打鼓普天同庆");
                                return;
                            }
                            default -> System.out.println("no action");
                        }
                    }else if (input1==5) {
                        states States5 = new states("skin", "Burned");
                        System.out.println("Name: " + States5.getName());
                        System.out.println("Medical States: " + States5.getMedicalStates());
                        System.out.println("请开始你的表演...");
                        System.out.println("     1. Cure this skin");
                        System.out.println("     2. Put some Gasoline and burn this skin completely");
                        int input6 = numberScanner.nextInt();
                        switch (input6) {
                            case 1:
                                System.out.println("Skin cured");
                                break;

                            case 2:
                                System.out.println("Skin burned completely...   你真牛逼");
                        
                            default:
                                System.out.println("no action");
                                break;
                        }
                    }else if (input1==6) {
                        System.out.println("Congratulations! 病人都给你治死了");
                        return;
                    }else {
                        System.out.println("你跑路了，患者们敲锣打鼓普天同庆");
                        return;
                    }
                    }
        }
        }
    }
