package chapter3.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5));
        //for 명령형 스타일 : 각 요소 * 10 처리
        ArrayList<Integer> ret1 = new ArrayList<>();
        for (Integer num : arrayList) {
            Integer mulipliedNum = num * 10;
            ret1.add(mulipliedNum);
        }
        System.out.println("ret1 = " + ret1);

        // stream(스트림) 선언형 스타일: 각 요소 * 10처리
        List<Integer> ret2 = arrayList.stream() //1. 데이터 준비 - 데이터를 스트림으로 변환하여 연산 흐름을 만들 준비 합니다.
                .map(num -> num * 10) // 2. 간 연산 등록 - 각 요소를 주어진 함수에 적용해서 변환합니다.
                .collect(Collectors.toList()); // 3. 종 연산 - 결과를 원하는 형태( List , Set )로 수집합니다.
        // toList 가 원하는 List 형태로 받겠다는 의미임
        System.out.println("ret2 = " + ret2);

        /*
        arrayList
                .stream() // 1. 데이터 준비
                .map() // 2. 중간 연산 등록
                .collect() // 3. 최종 연산
        // 1. 데이터 준비: 스트림 생성
        Stream<Integer> stream = arrayList.stream();
        // 2. 중간 연산 등록: 각 요소를 10배로 변환 로직 등록
        Stream<Integer> mappedStream = stream.map(num → num * 10);
        // 3. 최종 연산: 최종 결과 리스트로 변환
        List<Integer> ret2 = mappedStream.collect(Collectors.toList());
        */


        // 1.익명 클래스를 직접 만들어서 변수에 담아 매개변수로 전달
        Function<Integer, Integer> function = new Function<>() {

            @Override
            public Integer apply(Integer Integer) { // (Integer Integer) 매개변수
                return Integer * 10;
            }
        };
        List<Integer> ret3 = arrayList.stream() // 1. 데이터 준비 - 데이터를 스트림으로 변환하여 연산 흐름을 만들 준비 합니다.
                .map(function)                  // 2. 간 연산 등록 - 각 요소를 주어진 함수에 적용해서 변환합니다.
                .collect(Collectors.toList());  // 3. 종 연산 - 결과를 원하는 형태( List , Set )로 수집합니다.
        // toList 가 원하는 List 형태로 받겠다는 의미임
        System.out.println("ret3 = " + ret3);

    // 2. 람다식으로 만들어서 매개면수로 전달
        Function<Integer, Integer> functionLamda = (Integer -> Integer * 10); // (Integer -> Integer * 10)이부분도 매개변수
        List<Integer> ret4 = arrayList.stream() // 1. 데이터 준비 - 데이터를 스트림으로 변환하여 연산 흐름을 만들 준비 합니다.
                .map(function)                  // 2. 간 연산 등록 - 각 요소를 주어진 함수에 적용해서 변환합니다.
                .collect(Collectors.toList());  // 3. 종 연산 - 결과를 원하는 형태( List , Set )로 수집합니다.
        // toList 가 원하는 List 형태로 받겠다는 의미임
        System.out.println("ret4 = " + ret4);

        // 3. 람다식을 직접 매개변수로 전달
        List<Integer> ret5 = arrayList.stream() //1. 데이터 준비 - 데이터를 스트림으로 변환하여 연산 흐름을 만들 준비 합니다.
                .map(num -> num *10) // 2. 간 연산 등록 - .map( num -> num *10  이부분이 직접 매개변수 전달
                .collect(Collectors.toList()); // 3. 종 연산 - 결과를 원하는 형태( List , Set )로 수집합니다.
        // toList 가 원하는 List 형태로 받겠다는 의미임
        System.out.println("ret5 = " + ret5);

        // 4. 중간 연산을 함께 사용 하는 방법(filter() + map())사용
        // 요구사항: 리스트에서 짝수를 찾아서 * 10
        // 1) 짝수 찾기
        // 2) * 10 하기
        List<Integer> ret6 = arrayList.stream() // 1. 데이터 흐름 준비(1, 2, 3, 4, 5)
                .filter(num -> num % 2 == 0) // 2. 중간 연산 등록 (짝수찾기)
                .map(num -> num * 10)        // 3. 중간 연산 등록 (* 10)
                .collect(Collectors.toList());
        System.out.println("ret6 = " + ret6);

    }
}