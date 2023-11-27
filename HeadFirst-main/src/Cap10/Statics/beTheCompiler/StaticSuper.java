package Cap10.Statics.beTheCompiler;

class StaticSuper {
    static {
        System.out.println("super static block");
    }

    StaticSuper () {
        System.out.println("super constructor");
    }
}
