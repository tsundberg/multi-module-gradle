package se.thinkcode.app;

import se.thinkcode.api.Mirror;

class Main {
    private Mirror mirror;

    Main(Mirror mirror) {
        this.mirror = mirror;
    }

    public static void main(String[] args) {
        Mirror mirror = new Mirror();
        Main main = new Main(mirror);

        String reflection = main.reflect("A sun beam");
        System.out.println(reflection);
    }

    String reflect(String beam) {
        return mirror.reflect(beam);
    }
}
