import java.util.*;

public class Q_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read area of the square sheet
        int area = scanner.nextInt();
        double side = Math.sqrt(area);
        
        // Define the corners of the square
        double[][] corners = {
            {0, 0},
            {0, side},
            {side, 0},
            {side, side}
        };
        
        // Read folding line coordinates
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        // Set to hold unique folded corners
        Set<String> foldedCorners = new HashSet<>();
        
        // Add original corners and their reflections
        for (double[] corner : corners) {
            double[] reflectedCorner = reflectPoint(corner, x1, y1, x2, y2);
            foldedCorners.add(String.format("%.2f %.2f", corner[0], corner[1]));
            foldedCorners.add(String.format("%.2f %.2f", reflectedCorner[0], reflectedCorner[1]));
        }
        
        // Convert to a list and sort
        List<String> resultList = new ArrayList<>(foldedCorners);
        Collections.sort(resultList, (a, b) -> {
            String[] aParts = a.split(" ");
            String[] bParts = b.split(" ");
            double xA = Double.parseDouble(aParts[0]);
            double yA = Double.parseDouble(aParts[1]);
            double xB = Double.parseDouble(bParts[0]);
            double yB = Double.parseDouble(bParts[1]);
            
            if (xA != xB) {
                return Double.compare(xA, xB);
            } else {
                return Double.compare(yA, yB);
            }
        });
        
        // Print the result
        for (String point : resultList) {
            System.out.println(point);
        }
        
        scanner.close();
    }
    
    private static double[] reflectPoint(double[] point, double x1, double y1, double x2, double y2) {
        double px = point[0];
        double py = point[1];
        
        // Line vector
        double dx = x2 - x1;
        double dy = y2 - y1;
        
        // Normalize line vector
        double length = Math.sqrt(dx * dx + dy * dy);
        dx /= length;
        dy /= length;
        
        // Vector from point to line
        double lineToPointX = px - x1;
        double lineToPointY = py - y1;
        
        // Project point onto line
        double dot = lineToPointX * dx + lineToPointY * dy;
        
        // Closest point on the line
        double closestX = x1 + dot * dx;
        double closestY = y1 + dot * dy;
        
        // Calculate reflected point
        double reflectedX = closestX + (closestX - px);
        double reflectedY = closestY + (closestY - py);
        
        return new double[]{reflectedX, reflectedY};
    }
}