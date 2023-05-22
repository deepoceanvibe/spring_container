package com.spring.core.chep02;
    // 제어의 역전(IOC) : 객체 생성의 제어권을 Hotel이 아닌 외부로 넘긴다.
    // 의존성 주입(DI) : Hotel 생성시 외부에서 이미 생성된 객체를 주입하는 개념

public class Hotel {

    private Restaurant restaurant;
    private Chef chef;

    // 생성자의 파라미터로 들어온 객체를 레스토랑, 셰프로 주입함 !
    public Hotel(Restaurant restaurant, Chef chef) {
        this.restaurant = restaurant;
        this.chef = chef;
    }

    // 호텔의 정보를 알려주기
    public void inform() {
        String chefName = chef.getClass().getSimpleName();
        String restaurantName = restaurant.getClass().getSimpleName();
        System.out.println("우리 호텔의 레스토랑은 " + restaurantName + "이며, 수석 셰프는 " + chefName + "입니다.");
        restaurant.order();
    }

}
