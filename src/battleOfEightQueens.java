class fieldOperators{

    public static int fieldReader(char charPos, int xPos, int yPos){
        if (xPos < 1 || yPos < 1) return (-1);
        else if (charPos == 'D') return (0);
        else if (charPos == '.') return (1);
        else if (charPos == '-') return (2);
        else return (3);
    }

    public static int fieldSelector(int status){
        if (status == -1) return (-1);
        else if (status == 0 || status == 1 || status == 2) return (0);
        else return (1);
    }
    
    public static char fieldWriter(int status){
        if (status == 0) return 'D';
        else if (status == 1) return '.';
        else if (status == 2) return '-';
        else return 'i';
    }


}

class fieldPostion{
    int xPos, yPos;
}


public class battleOfEightQueens {
    
    public char[][] chessBoard = new char[8][8];
    

}
