package dad.game.textures;

import dad.game.engine.StaticEntity;
import javafx.scene.image.Image;


public class Rio5 extends StaticEntity {

    public Rio5(double x, double y) {
        super(new Image("/images/Rio5.png"), x, y);
    }

    // Comando para Checkear colisiones
    /*
     * Rectangle shape = getCollisionShape(); gc.setFill(Color.YELLOW);
     * gc.fillRect(shape.getX(), shape.getY(), shape.getWidth(), shape.getHeight());
     */
}


