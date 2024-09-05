package DecoratorPattern;

import StrategyPattern.EngineStrategy;
import StrategyPattern.TurboChargerStrategy;

public class Sema extends NOS {
    public Sema(EngineStrategy engineStrategy, TurboChargerStrategy turbochargerStrategy) {
        super(engineStrategy, turbochargerStrategy);
    }

    @Override
    public void apply() {
        System.out.println("Applying Sema Nitrous Oxide System");
    }

    @Override
    public NOS selectNOS() {
        return new Sema(getEngineStrategy(), getTurbochargerStrategy());
    }
}
