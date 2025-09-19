public class Lab1 {
    public static void main(String[] args) {
        long[] n  = new long[9];
        float[] x = new float[13];
        double[][] w = new double[9][13]; // double because of problems with typecasting

        int fill_index = 0; // temp util variable

        for (long i = 6; i <= 22; i += 2){
            n[fill_index] = i;
            fill_index++;
        }
        fill_index = 0;

        for (int i = 0; i < x.length; i++){
            x[fill_index] = (float) Math.random() * 23 - 10;
            fill_index ++;
        }

        for (int i = 0; i < n.length; i++){
            for (int j = 0; j < x.length; j++){
                int curr = (int) n[i];
                switch(curr){
                    case 8 -> w[i][j] = equation1(x[j]);
                    case 10, 12, 14, 16 -> w[i][j] = equation2(x[j]);
                    case 6, 18, 20, 22 -> w[i][j] = equation3(x[j]);
                }
            }
        }
        matrix_print(w);
        
    }

    // double in all of the methods because of the Math lib
    public static double equation1(float x){
        return Math.pow((Math.pow(Math.E, Math.log(Math.abs((double) x)))) / 2.0, 2);
    }
    public static double equation2(float x){
        return Math.atan(Math.sin(Math.asin(Math.sin(x))));
    }
    public static double equation3(float x){
        return Math.asin(Math.pow(Math.E, Math.cbrt(-Math.pow(Math.cos(Math.pow((0.5 * (Math.pow(Math.E, x) + 1)), 2)), 2))));
    }
    public static void matrix_print(double[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.printf("%.3f \t", matrix[i][j]);
            }
        }
    }
}