package _7_test_260121.ex;

import java.util.HashMap;

public class _3_HashMap_Ex1 {
    public static void main(String[] args) {
//        실습3
//        HashMap (메뉴판 관리)
//
//        다음 요구사항을 만족하는 코드를 작성하세요.
//
//        1. `HashMap<String, Integer>`를 생성합니다. (변수명: `menuMap`)
        // Integer : 기초 타입 정수를 -> 객체 타입으로 변환된 클래스,
        // 정수를 다루는 클래스.
        HashMap<String, Integer> menuMap = new HashMap<>();
//        2. 다음 메뉴와 가격을 추가하세요.
//                * "김밥": 3000
//                * "라면": 4500
//                * "떡볶이": 5000
        menuMap.put("김밥",3000);
        menuMap.put("라면",4500);
        menuMap.put("떡볶이",5000);
//        3. "라면"의 가격을 출력하세요.
        System.out.println("\"라면\"의 가격을 출력하세요 : " + menuMap.get("라면") + "원");
//        4. "김밥"의 가격을 **3500원**으로 수정하세요.
        menuMap.put("김밥", 3500);
        System.out.println("\"김밥\"의 가격을 **3500원**으로 수정 후 출력 : " + menuMap.get("김밥") + "원");
//        5. "돈까스"라는 메뉴가 있는지 확인하고, 결과를 출력하세요.
        if(menuMap.containsKey("돈까스")) {
            System.out.println("돈까스 메뉴가 있습니다.");
        } else {
            System.out.println("돈까스 메뉴가 없습니다.");
        }
//        6. 맵에 들어있는 모든 메뉴 이름(Key)와 값도 같이 출력하세요.
        System.out.println("===전체메뉴===");
        for(String menuKey: menuMap.keySet()) {
            System.out.println("메뉴 : " + menuKey + ", 가격 : " + menuMap.get(menuKey) +"원");
        }

    }
}
