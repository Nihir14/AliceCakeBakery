package com.nihir.AliceCakeBakery;

import com.nihir.AliceCakeBakery.frosting.Frosting;
import com.nihir.AliceCakeBakery.syrup.Syrup;
import org.springframework.stereotype.Component;

@Component
public class CakeBakery {

    private final Frosting frosting;
    private final Syrup syrup;

    // Constructor-based Dependency Injection
    public CakeBakery(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bakeCake() {
        System.out.println("Baking a cake with: ");
        System.out.println("- " + frosting.getFrostingType());
        System.out.println("- " + syrup.getSyrupType());
        System.out.println("Cake is ready! 🎂");
    }
}