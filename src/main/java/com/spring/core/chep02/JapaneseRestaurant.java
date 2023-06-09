package com.spring.core.chep02;

public class JapaneseRestaurant implements Restaurant {
    // 셰프 선언
    private Chef chef;

    // 코스 선언
    private Course course;

    public JapaneseRestaurant() {
        this.chef = new JapaneseChef();
        this.course = new JapaneseCourse();
    }

    @Override
    public void order() {
        System.out.println("일식 레스토랑입니다.");
        course.combineMenu();
        chef.cook();
    }
}
