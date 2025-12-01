package org.example;

    public class Rocket extends SpaceObject {

        public Rocket(String name) {
            super(name);
        }

        @Override
        public void launch() {
            System.out.println("🚀 Ракета «" + getName() + "» стартует с космодрома!");
        }
}
