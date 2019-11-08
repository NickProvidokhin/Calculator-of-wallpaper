import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorOfWallpaperServiceTest {
    @Test
    void calculateCloth() {
        CalculatorOfWallpaperService service = new CalculatorOfWallpaperService();
        double widthRoom = 5.0;
        double lengthRoom = 6.0;
        double heightRoom = 2.75;
        double lengthPiece = 10.0;
        double widthPiece = 1.06;

        int result = service.calculateOfNumberPiece(widthRoom, lengthRoom, heightRoom, lengthPiece, widthPiece);

        assertEquals(7, result);
    }

    @Test
    void calculateClothWithBoundaryHeightRoom() {
        CalculatorOfWallpaperService service = new CalculatorOfWallpaperService();
        double widthRoom = 5.0;
        double lengthRoom = 6.0;
        double heightRoom = 3.3;
        double lengthPiece = 10.0;
        double widthPiece = 1.06;

        int result = service.calculateOfNumberPiece(widthRoom, lengthRoom, heightRoom, lengthPiece, widthPiece);

        assertEquals(11, result);
    }

    @Test
    void calculateClothWhenWidthRoomZero() {
        CalculatorOfWallpaperService service = new CalculatorOfWallpaperService();
        double widthRoom = 5.0;
        double lengthRoom = 0.0;
        double heightRoom = 2.75;
        double lengthPiece = 10.0;
        double widthPiece = 1.06;

        int result = service.calculateOfNumberPiece(widthRoom, lengthRoom, heightRoom, lengthPiece, widthPiece);

        assertEquals(4, result);
    }


}