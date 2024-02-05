import com.NaiveMultiply.*;

public class rectanglematrix {

    public static void main(String[] args) {

        // OS Info
        String osArchitecture = System.getProperty("os.arch");
        String osVersion = System.getProperty("os.version");
        String osName = System.getProperty("os.name");

        // Java version info
        String javaVersion = System.getProperty("java.version");

        // CPU Info
        String cpuArch = System.getProperty("os.arch");
        int processorsAvailable = Runtime.getRuntime().availableProcessors();
        long memoryMax = Runtime.getRuntime().maxMemory() / (1024 * 1024);
        System.out.println("OS Name: " + osName);
        System.out.println("OS Version: " + osVersion);
        System.out.println("OS Architecture: " + osArchitecture);
        System.out.println("Java Version: " + javaVersion + "│ CPU Arch: " + cpuArch +
                "│ Available Processors - Cores: " + processorsAvailable + "│ Maximum Memory - MB: " + memoryMax);
        System.out.println();

        System.out.println("row Column timeintegernaive timedoublenaive timeinteger timedouble");

        for (int i = 50; i <= 1000; i += 50) {
            int row = i;
            int column = i + 20;

            int[][] integerMatrixA = NaiveMultiplication.intmatrix(row, column);
            double[][] doubleMatrixA = NaiveMultiplication.randdoublematrix(row, column);

            int[][] integerMatrixB = NaiveMultiplication.intmatrix(column, row);
            double[][] doubleMatrixB = NaiveMultiplication.randdoublematrix(column, row);

            // Multiply integer matrix
            long begin = System.nanoTime();
            int[][] resultInteger = NaiveMultiplication.multiplyintmatrix(integerMatrixA, integerMatrixB);
            long end = System.nanoTime();
            double integerTime = (end - begin);

            begin = System.nanoTime();
            resultInteger = NaiveMultiplication.multiplyintmatrix2(integerMatrixA, integerMatrixB);
            end = System.nanoTime();
            double integerTime2 = (end - begin);

            // Multiply double matrix
            begin = System.nanoTime();
            double[][] resultDouble = NaiveMultiplication.multiplydoublematrix(doubleMatrixA, doubleMatrixB);
            end = System.nanoTime();
            double doubleTime = (end - begin);

            begin = System.nanoTime();
            resultDouble = NaiveMultiplication.multiplydoublematrix2(doubleMatrixA, doubleMatrixB);
            end = System.nanoTime();
            double doubleTime2 = (end - begin);

            System.out.println(row + " " + column + " " + integerTime + " " + doubleTime + " " + integerTime2 + " " + doubleTime2 + " ");
        }
    }
}
