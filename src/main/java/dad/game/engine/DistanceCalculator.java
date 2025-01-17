package dad.game.engine;

import javafx.geometry.Point2D;

/**
 * Clase que calcula la Dirección de un punto respecto a otro
 */
public class DistanceCalculator {

    private final Point2D referencePoint;

    public DistanceCalculator(Point2D referencePoint) {
        this.referencePoint = referencePoint;
    }

    public double calculateDistanceFromReference(Point2D otherPoint) {
        return referencePoint.distance(otherPoint);
    }


    public double calculateDistance(Point2D point1, Point2D point2) {
        return point1.distance(point2);
    }
}
