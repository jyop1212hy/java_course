package chapter3.collection.ex;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product onion = new Product("양파", 3000);
        Product apple = new Product("사과", 10000);
        Product fish = new Product("생선", 12000);
        Product tofu = new Product("두부", 2000);

        // 장바구니에 상품 추가
        System.out.println("장바구니 상품 추가: ");
        cart.addProduct(onion);
        cart.addProduct(apple);
        cart.addProduct(fish);
        cart.addProduct(tofu);
        System.out.println();

        // 장바구니 상품회조
        System.out.println("장바구니 상품 조회: ");
        cart.printCart();
        System.out.println();

// 장바구니 총 금액
        System.out.println("장바구니 총 금액 조회: ");
        cart.calculateTotalPrice();
        System.out.println();

// 장바구니 상품 제거(사과)
        System.out.println("장바구니에서 사과 제거: ");
        cart.removeProduct("사과");
        System.out.println();
// 장바구니 상품 조회
        System.out.println("장바구니 상품 조회: ");
        cart.printCart();
        System.out.println();

// 장바구니 총 금액
        System.out.println("장바구니 총 금액 조회: ");
        cart.calculateTotalPrice();
        System.out.println();
    }
}
