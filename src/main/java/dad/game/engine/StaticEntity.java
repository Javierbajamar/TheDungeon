package dad.game.engine;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

/**
 * Genera un objeto de transicion que visualmente es igual a un tile de suelo
 * emplea el metodo getShape para comprobar colisiones con el player
 */
public class StaticEntity extends Entity {

    public StaticEntity(Image image, double x, double y) {
        super();
        this.image = image;
        this.posX = x;
        this.posY = y;
        this.width = image.getWidth();
        this.height = image.getHeight();
    }

    @Override
    public void render(GraphicsContext gc) {
        gc.drawImage(image, posX, posY);
    }

    @Override
    public void update(long timeDifference) {
    }

    @Override
    public Shape getCollisionShape() {
        return new Rectangle(posX, posY, width, height);
    }

}
