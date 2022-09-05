package com.siddhu;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Mediatek implements MobileProcessor {

    @Override
    public void process() {
        System.out.println("worlds 2 best processor");
        
    }
    
}
