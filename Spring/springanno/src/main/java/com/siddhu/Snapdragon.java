package com.siddhu;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Snapdragon implements MobileProcessor {

    @Override
    public void process() {
        System.out.println("Worlds Best processor");
        
    }
    
}
