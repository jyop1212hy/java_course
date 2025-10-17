package ex;

public class Main {
    public static void main(String[] args) {
      //------mayo------
      //----name = "mayi"
       // -age = 7
        //- isNeutering
         //---------
        int a =1;
        System.out.println("a = " + a);
        
      Cat mayo = new Cat("mayo",7);
        System.out.println("mayo = " + mayo);

        //------nez------
        //----name = "nez"
        // -age = 8
        //- isNeutering = false
        //---------
      Cat nez = new Cat("nez",8, false);


        String mayoname = mayo.getName();
        System.out.println("mayoname = " + mayoname);


        nez.setNeutering(true);
        System.out.println("isNeutering = " + nez.getNeutering());
    }
}
