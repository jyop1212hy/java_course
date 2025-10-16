package chapter2.capsulation.v2;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();


        // 무분별한 세터 예시
//        robot.setLeftleg(true);
//        robot.setRightleg(true);
//        robot.setLeftArm(true);
//        robot.setRightArm(true);

        // 의미 있는 세터
        robot.walk(true);
    }
}
