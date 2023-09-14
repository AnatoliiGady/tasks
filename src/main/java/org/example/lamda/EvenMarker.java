package org.example.lamda;

public class EvenMarker implements Action<Boolean, Integer> {
    @Override
    public Boolean doAction(Integer param) {
        return param % 2 == 0;
    }
}
