package com.spring.core.chap02;

import com.spring.core.chep02.Hotel;
import com.spring.core.chep02.config.HotelManager;
import org.junit.jupiter.api.Test;

public class HotelManagerTest {

    @Test
    public void diTest() {
        HotelManager manager = new HotelManager();
        Hotel hotel = manager.hotel();
        hotel.inform();
    }
}
