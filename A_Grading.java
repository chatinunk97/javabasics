/*Most of the time a Java file has only 1 public class
It serves as a entry point of the file where other is like tools for the file to operate
*/

/* If there's a public class in a Java file
 the file name must match that class name
 */
public class A_Grading {
    public static void main(String[] args) {
        Student a001 = new Student();
        a001.name = "Boss";
        System.out.println(a001.name);
        double[] score = { 100, 200, 1, 0 };

        System.out.println(a001.judege(a001.calculateAvg(score)));
    }
}

class Student {
    String name;

    public double calculateAvg(double[] data) {
        double sum = 0;

        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        System.out.println(sum / data.length);
        return sum / data.length;
    }

    public String judege(double data) {
        if (data >= 60) {
            return "passed";
        } else {
            return "failed";
        }
    }
}