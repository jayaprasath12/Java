class Team {
    void print(int age) {
        System.out.println("Player Age: " + age);
    }

    void print(String name) {
        System.out.println("Printing string: " + name);
    }

    void print(char initial) {
        System.out.println("Printing double: " + initial);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Team csk = new Team();
        csk.print(28);
        csk.print("Ruturaj");
        csk.print("G");
    }
}
