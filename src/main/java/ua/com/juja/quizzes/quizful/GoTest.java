package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/26/16.
 */
public class GoTest {

    public static void main(String[] args) {
        Sente a = new Sente();
        a.go(); //go in Sente
        Goban b = new Goban();
        b.go(); //go in Goban
        Stone c = new Stone();
        c.go(); //go in Goban
        Sente sente = new Goban();
        sente.go(); //go in Goban
    }
}

class Sente implements Go {
    public void go() {
        System.out.println("go in Sente");
    }
}

class Goban extends Sente {
    public void go() {
        System.out.println("go in Goban");
    }
}

class Stone extends Goban implements Go {
}

interface Go {
    public void go();
}
