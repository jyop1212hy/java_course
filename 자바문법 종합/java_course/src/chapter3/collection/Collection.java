package chapter3.collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Collection {
    public static void main(String[] args) {

        //배열의 한계(정적 한계)
        //선언과 동시에 길이를 설정 필요

        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        //배열의 정적인 특징의 한계
        // numbers[3] = 40;

        //컬렉션
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        
        // ArrayList 활용
        ArrayList<String> names = new ArrayList<>();
        
        //데이터 추가
        names.add("Spar");
        names.add("Apple");
        names.add("Terea");
        names.add("1");
        names.add("2");

        // 순서 보장
        System.out.println("names = " + names);

        //중복 데이터 허용
        names.add("Apple");
        System.out.println("names = " + names);
        
        //데이터 단건 조회
        String names1 = names.get(0);
        System.out.println("names1 = " + names1);
        
        //데이터 삭제
        names.remove("Spar");
        System.out.println("names = " + names);


        // HashSet 사용 방법-순서 보장 불가, 중복 데이터 허용
        HashSet<String> uniqueNames = new HashSet<>();
        
        // 데이터 추가
        uniqueNames.add("Spar");
        uniqueNames.add("Terea");
        uniqueNames.add("Mavin");
        uniqueNames.add("Apple");
        uniqueNames.add("1");
        uniqueNames.add("2");
        
        // 순서를 보장 안함
        System.out.println("uniqueNames = " + uniqueNames);
        // get() 활용불가
//        uniqueNames.get();

        //중복 데이터 불가
        uniqueNames.add("Spar");
        System.out.println("uniqueNames = " + uniqueNames);

        //데이터 제거
        uniqueNames.remove("Spar");
        System.out.println("uniqueNames = " + uniqueNames);

        //HashMap 활용
        //   <키(".."),  값(1) > -저장방식
        HashMap<String,Integer> memberMap = new HashMap<>();
        memberMap.put("Spar",11);
        memberMap.put("Apple",4);
        memberMap.put("Mama",15);
        memberMap.put("Woo",2);
        
        //순서 보장 안됨
        System.out.println("memberMap = " + memberMap);

        //키 중복 불가: 값이 덮어쓰기 발생
        memberMap.put("Apple", 5);
        System.out.println("memberMap = " + memberMap);

        //단건 조회
        Integer wooGet = memberMap.get("Woo");
        System.out.println("wooGet = " + wooGet);

        //삭제
        memberMap.remove("Mama");
        System.out.println("memberMap = " + memberMap);

        //키 확인
        Set<String> keyset =memberMap.keySet();
        System.out.println("keyset = " + keyset);

        // 값 확인
        java.util.Collection<Integer> values = memberMap.values();
        System.out.println("values = " + values);
    }
}
