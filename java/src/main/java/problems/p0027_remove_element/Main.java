package problems.p0027_remove_element;

public class Main {
    public static void main(String[] args) {
        int[] variavel = new int[]{0,1,2,2,3,0,4,2};
        int result = Solution.removeElement(variavel, 2);

        System.out.println(result);
    }
}
