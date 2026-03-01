import javax.swing.JOptionPane; // This is the import you need!

public class CircleCalculator {
    public static void main(String[] args) {
        // Given diameter
        double diameter = 18.0;
        double radius = diameter / 2;
        
        // Formulas
        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;
        
        // Creating a formatted String for the pop-up
        String output = String.format("Circle Results (Diameter = 18)\n" +
                                     "------------------------------\n" +
                                     "Radius: %.2f\n" +
                                     "Area: %.2f\n" +
                                     "Perimeter: %.2f", 
                                     radius, area, perimeter);
        
        // This line actually creates the pop-up window
        JOptionPane.showMessageDialog(null, output, "Circle Calculator", JOptionPane.INFORMATION_MESSAGE);
    }
}