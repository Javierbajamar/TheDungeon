package dad.game.textures;

import dad.game.engine.StaticEntity;
import javafx.scene.image.Image;
import javafx.scene.shape.Shape;

public class EsquinaCesped4 extends StaticEntity {

    public EsquinaCesped4(double x, double y) {
        super(new Image("/images/EsquinaCesped4.png"), x, y);
    }

    @Override
    public Shape getCollisionShape() {
        return null;
    }

}
