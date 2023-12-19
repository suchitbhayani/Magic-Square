
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here

        int nextNoToBePlaced = 1;
        int x = size/2;
        int y = 0;

        while (nextNoToBePlaced <= square.getHeight() * square.getHeight()) {
            if (x >= 0  && x < square.getWidth() && y >= 0 && y < square.getHeight()) { // if cursor is in legal bounds
                if (square.readValue(x, y) == 0) {
                    square.placeValue(x, y, nextNoToBePlaced);
                    nextNoToBePlaced++;
                    x++;
                    y--;
                } else {
                    x--;
                    y += 2;
                }

            }
            if (x >= square.getWidth()) {
                x = 0;
            }
            if (x < 0) {
                x = square.getWidth() - 1;
            }
            if (y < 0) {
                y = square.getHeight() - 1;
            }
            if (y >= square.getHeight()) {
                y = y - square.getHeight();
            }
        }

        return square;
    }

}
