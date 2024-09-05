package DecoratorPattern;

import StrategyPattern.EngineStrategy;
import StrategyPattern.TurboChargerStrategy;

public class Resonac extends NOS {
    public Resonac(EngineStrategy engineStrategy, TurboChargerStrategy turbochargerStrategy) {
        super(engineStrategy, turbochargerStrategy);
    }

    @Override
    public void apply() {
        System.out.println("Applying Resonac Nitrous Oxide System");
    }

    @Override
    protected NOS selectNOS() {
        return new Resonac(getEngineStrategy(), getTurbochargerStrategy());
    }
}
