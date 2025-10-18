package chapter3.collection.ex;

import ex.Cat;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    //    장바구니 상품: 양파, 사과, 생선, 두부
    //속(변수형)
    private List<Product> cart = new ArrayList<>();

    //생(여러개, 반환타입 없음, 클래스명 동일)
    //기
    //    기능1: 상품추가( addProduct )
    public void addProduct(Product product) {
        cart.add(product);
        System.out.println(product.getName() + " 가 장바구니에 추가 되었습니다.");
    }

    //    기능2: 장바구니 목록 출력( printCart )
    public void printCart() {
        if (cart.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
        } else {
            for (Product product : cart) {
                System.out.println(product.getName() + ": " + product.getPrice());
            }
        }
    }

    //    기능3: 상품 삭제( removeProduct )
    public void removeProduct(String removeProductName) {
        boolean removed = false;

        for (Product product : cart) {
            String foundProductName = product.getName();
            if (foundProductName.equals(removeProductName)) {
                cart.remove(product);
                removed = true;
                System.out.println(product.getName() + "가 장바구니에서 제거 되었습니다.");
                break;
            }
        }
        if (!removed) {
            System.out.println("해당 상품이 장바구니에 없습니다.");
        }
    }

    //    기능4: 총 가격 계산( calculateTotalPrice )
    public void calculateTotalPrice() {
        int total = 0;
        for (Product product : cart) {
            total += product.getPrice();
        }
        System.out.println("총 금액은: " + total);
    }
}

