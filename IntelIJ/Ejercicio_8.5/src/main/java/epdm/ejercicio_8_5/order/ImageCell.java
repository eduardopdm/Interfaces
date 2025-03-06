package epdm.ejercicio_8_5.order;

import epdm.ejercicio_8_5.Application5;
import javafx.scene.control.TableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageCell extends TableCell<Order, Boolean> {

    private final ImageView image;

    public ImageCell() {
        // add ImageView as graphic to display it in addition
        // to the text in the cell
        image = new ImageView();
        image.setFitWidth(25);
        image.setFitHeight(25);
        image.setPreserveRatio(true);

        setGraphic(image);
        setMinHeight(70);
    }

    @Override
    protected void updateItem(Boolean item, boolean empty) {
        super.updateItem(item, empty);

        if (item == null || !item) {
            // set back to look of empty cell
            setText(null);
            image.setImage(null);
        } else {
            // set image and text for non-empty cell
            image.setImage(new Image(String.valueOf(Application5.class.getResource("/img/vip.png"))));

        }
    }
}