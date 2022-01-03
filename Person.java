class Person {
    String name;
    int grade;
    double meetingsPerWeek;

    Person(String name, int grade, double mpw) {
        this.name = name;
        this.grade = grade;
        this.meetingsPerWeek = mpw;
    }

    boolean likelyToAttend() {
        if (this.grade > 12 || this.grade < 9) {
            return false;
        }
        if (this.meetingsPerWeek < 1.0) {
            return false;
        }
        return true;
    }
}
