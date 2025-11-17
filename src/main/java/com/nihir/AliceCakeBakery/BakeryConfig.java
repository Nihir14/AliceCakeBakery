package com.nihir.AliceCakeBakery;

import com.nihir.AliceCakeBakery.frosting.ChocolateFrosting;
import com.nihir.AliceCakeBakery.frosting.Frosting;
import com.nihir.AliceCakeBakery.syrup.ChocolateSyrup;
import com.nihir.AliceCakeBakery.syrup.StrawberrySyrup;
import com.nihir.AliceCakeBakery.syrup.Syrup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BakeryConfig {

    @Bean
    public Frosting frosting() {
        return new ChocolateFrosting(); // change to StrawberryFrosting()
    }

    @Bean
    public Syrup syrup() {
        return new ChocolateSyrup(); // change to StrawberrySyrup()
    }

}
