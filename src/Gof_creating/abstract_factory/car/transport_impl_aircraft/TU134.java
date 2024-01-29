package Gof_creating.abstract_factory.car.transport_impl_aircraft;

import Gof_creating.abstract_factory.car.Aircraft;

public class TU134 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("TU-134 flight");
    }
}
