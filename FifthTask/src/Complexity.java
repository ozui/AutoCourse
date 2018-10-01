public enum Complexity {
    HARD(4),
    MEDIUM(2),
    EASY(1);

    private final int h;

    Complexity(int h) {
        this.h = h;
    }

    public  int getHours(){
        return h;
    }
}
