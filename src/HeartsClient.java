
public class HeartsClient {
    public static void main(String[] args) throws Exception {
        Heart Test1 = new Heart();
        Test1.setCost(50);
        Test1.adjPrice(.25);
        System.out.println(Test1.getCost());
    }
}
