package chapter2.capsulation.v2;

// 로봇을 걷게 만들기
public class Robot {
    private boolean leftleg;
    private boolean rightleg;


    private boolean leftArm;
    private boolean rightArm;

    // 무분별한 세터 예시
//public void setLeftleg(boolean leftleg) {
//    this.leftleg = leftleg;
//}
//public void setRightleg(boolean rightleg) {
//    this.rightleg = rightleg;
//}
//public void setLeftArm(boolean leftArm) {
//    this.rightleg = leftArm;
//}
//public void setRightArm(boolean rightArm) {
//    this.rightleg = rightArm;
//}


    // 의미 있는 세터
    public void walk(boolean power){
        this.leftleg = power;
        this.rightArm = power;
        this.leftArm = power;
        this.rightleg = power;
    }
}
