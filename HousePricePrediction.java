import java.util.Scanner;

class LinearRegression {
    double slope;
    double intercept;

    void train(double[] x, double[] y) {
        int n = x.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumXX = 0;

        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumXX += x[i] * x[i];
        }

        slope = (n * sumXY - sumX * sumY) / (n * sumXX - sumX * sumX);
        intercept = (sumY - slope * sumX) / n;
    }

    double predict(double x) {
        return slope * x + intercept;
    }
}

public class HousePricePrediction {

    public static void main(String[] args) {

        double[] area = {800, 1000, 1200, 1500, 1800};
        double[] price = {40, 50, 60, 75, 90};

        LinearRegression model = new LinearRegression();
        model.train(area, price);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter house area in sq ft: ");
        double userArea = sc.nextDouble();

        double predictedPrice = model.predict(userArea);
        System.out.println("Predicted House Price: ₹ " + predictedPrice + " lakhs");

        sc.close();
    }
}
