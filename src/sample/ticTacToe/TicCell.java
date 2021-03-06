package sample.ticTacToe;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import sample.Cell;

public class TicCell extends Cell {

    char state = '-'; // 'X', 'O' , or '-'
    static boolean turn = true; //true: p1, false: p2

    /**
     * @param x cell position x
     * @param y cell position y
     */
    TicCell(int x, int y) {
        super(x, y);
    }

    /**
     * asigns this.state
     * @param st state char
     */
    void setState(char st) {
        this.state = st;
        lbl_state.setText(Character.toString(this.state));
    }

    /**
     * draws GUI for cell
     */
    public void draw() {
        pn_layout = new StackPane();
        lbl_state = new Label(Character.toString(this.state));
        lbl_state.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
        rec_btn = new Rectangle(100, 100, Color.DARKGRAY);
        rec_btn.setStrokeWidth(1);
        rec_btn.setStroke(Color.BLACK);
        rec_btn.setArcWidth(10);
        rec_btn.setArcWidth(10);
        pn_layout.getChildren().addAll(rec_btn, lbl_state);
        pn_rt.getChildren().addAll(pn_layout);
    }

}
