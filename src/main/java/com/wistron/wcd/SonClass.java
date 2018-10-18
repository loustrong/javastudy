package com.wistron.wcd;

class FatherClass {

    private String id;
    private String name;

    FatherClass() {
        this.name = "Zhang San";
        this.id = "101";
    }

    FatherClass(String id, String name) {
        this.name = name;
        this.id = id;
    }
}

final class SunClass extends FatherClass {
    private String id;
    private String prof;
    private String name;

    public void say(String... args) {
        for (String arg : args) {
            System.out.println(arg);

        }
    }

    SunClass() {
        super();
        System.out.println("SunClass!");
    }

    public void getName() {
        System.out.println(this.name);
    }
}

public class SonClass {

    public static void main(String[] args) {
        SunClass sun = new SunClass();
        sun.getName();
        sun.say("nihao", "OK", "nidemingzi");

    }
}
