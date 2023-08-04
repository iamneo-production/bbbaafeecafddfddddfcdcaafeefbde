package controller;

public class CalculateBMI {

    public static double calculate(double height, double weight) {
        return weight / height * height;
    }

    public static String description(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else if (bmi >= 30 && bmi < 34.9) {
            return "Obese";
        } else {
            return "Extremely Obese";
        }
    }

    public static void main(String[] args) {
        double height = 1.70;
        double weight = 70;
        double bmi = calculate(height, weight);
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Your BMI category is: " + description(bmi));
    }
}
