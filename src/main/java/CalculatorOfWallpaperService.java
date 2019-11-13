public class CalculatorOfWallpaperService {

    public int calculateOfNumberPiece(double widthRoom, double lengthRoom, double heightRoom, double lengthPiece, double widthPiece) {

        double perimeter = (widthRoom + lengthRoom) * 2;
        double numberOfCloth = Math.ceil(perimeter / widthPiece);
        double reserveForHeight = 0.10;
        double totalHeightRoom = heightRoom + reserveForHeight;
        double numberOfClothOnePiece = Math.floor(lengthPiece / totalHeightRoom);
        int numberPiece = (int) Math.ceil(numberOfCloth / numberOfClothOnePiece);

        return numberPiece;
    }
}
