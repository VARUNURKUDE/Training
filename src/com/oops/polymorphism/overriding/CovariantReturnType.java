package com.oops.polymorphism.overriding;

public class CovariantReturnType {

    //Java 5.0 onwards it is possible to have different return type for a overriding method in child class,
    // but child’s return type should be sub-type of parent’s return type.
    // Overriding method becomes variant with respect to return type.

    //Co-variant return type is based on Liskov substitution principle.

    static class WildAnimal {
        public String willYouBite(){
            return "Yes";
        }
    }

    static class Lion extends WildAnimal {
        public String whoAreYou() {
            return "Lion";
        }
    }

    static class BengalTiger extends WildAnimal {
        public String whoAreYou() {
            return "Bengal Tiger";
        }
    }

    static class Zoo {
        WildAnimal getWildAnimal() {
            return new WildAnimal();
        }
    }

    static class AfricaZoo extends Zoo {
        @Override
        Lion getWildAnimal() {
            return new Lion();
        }
    }

    static class IndiaZoo extends Zoo {
        @Override
        BengalTiger getWildAnimal() {
            return new BengalTiger();
        }
    }


        public static void main(String args[]) {
            AfricaZoo afZoo = new AfricaZoo();
            System.out.println(afZoo.getWildAnimal().whoAreYou());
            IndiaZoo inZoo = new IndiaZoo();
            System.out.println(inZoo.getWildAnimal().whoAreYou());
        }
}
