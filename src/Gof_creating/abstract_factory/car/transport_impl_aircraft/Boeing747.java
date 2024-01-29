package Gof_creating.abstract_factory.car.transport_impl_aircraft;

import Gof_creating.abstract_factory.car.Aircraft;

public class Boeing747 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("Not stopped yet");
    }
}
