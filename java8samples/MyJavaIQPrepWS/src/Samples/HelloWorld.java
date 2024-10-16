package Samples;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Optional;

class Question4 {
    public static void main(String[] args) {
        A a = new A();
        Optional<Integer> checkNull = Optional.ofNullable(a.methodOfA());
        System.out.println(checkNull);
    }
}


class A {
    int methodOfA() {
        return (true ? null : 0);
    }
}