package chapter2;

public class Main {
    public static void main(String[] args) {

        //객체 생성(인스턴스화)
        /// ----personA ----;
        /// - name = " haryun"
        /// - age + 20;
        /// - address = null
        Person personA = new Person("haryun", 20);
        Person personB = new Person("mavin", 13);

        //속성에 직접 접근
//        System.out.println("설정전 personA 이름: " + personA.name);
//        System.out.println("설정전 personB 이름: " + personB.name);
//
//        personA.name = "haryun";
//        personB.name = "mavin";
//        System.out.println("설정전 personA 이름: " + personA.name);
//        System.out.println("설정전 personB 이름: " + personB.name);

        int result1 = personA.sum(1,2);
        int result2 = personB.sum(2,3);
        System.out.println("result1 = " +  result1);
        System.out.println("result2 = " +  result2);

        //게터 활용
        String name = personB.getName();
        System.out.println("getName = " + name);

        //세터 활용
        System.out.println("personA 의 주소 = " + personA.address);
        personA.setAddress("서울");
        System.out.println("personA 의 주소 = " + personA.address);

    }
}