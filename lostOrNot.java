public class lostOrNot {
    public static void main(String[] args) {
        Person eric = new Person("eric", 9, 1.0);
        Person james = new Person("james", 69, 1.1);
        Person steven = new Person("steven", 17, 6.6);
        Person keobkeig = new Person("cupcake", 9, 100.0);

        Person[] arr = { eric, james, steven, keobkeig };
        for (Person i : arr) {
            if (i.likelyToAttend()) {
                System.out.println(i.name + " is not lost");
            } else {
                System.out.println(i.name + " is lost :(");
            }
        }
    }
}
