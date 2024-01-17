import java.util.Vector;

public class VectorUnion {

    public static Vector<String> union(Vector<String> a, Vector<String> b) {
        Vector<String> unionVector = new Vector<>();

        for (String item: a) {
            if (!unionVector.contains(item)) {
                unionVector.add(item);
            }
        }

        for (String item: b) {
            if (!unionVector.contains(item)) {
                unionVector.add(item);
            }
        }

        return unionVector;
    }


    public static void main(String[] args) {

        Vector<String> vectorA = new Vector<>();
        vectorA.add("a");
        vectorA.add("b");

        Vector<String> vectorB = new Vector<>();
        vectorB.add("b");
        vectorB.add("c");

        Vector<String> result = union(vectorA, vectorB);
        System.out.println(result);
    }
}