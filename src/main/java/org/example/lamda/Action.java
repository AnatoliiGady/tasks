package org.example.lamda;

@FunctionalInterface
public interface Action<R, P> {
    R doAction(P param);
}
