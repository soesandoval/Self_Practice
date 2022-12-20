package MariaAndMe;

public class IfReview {

    public static String name;

    static {
        name = "heyo";

    }

    public static void main(String[] args) {

        IfReview ifReview = new IfReview();
        ifReview.name = "yoyo";

        IfReview ifReview2 = new IfReview();
        ifReview.name = "nono";


        IfReview ifReview3 = new IfReview();

        System.out.println(ifReview3.name);




    }

}
