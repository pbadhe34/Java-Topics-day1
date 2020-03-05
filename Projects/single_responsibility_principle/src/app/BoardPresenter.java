package app;
 
public class BoardPresenter {
    Board board;

    public BoardPresenter(Board board) {
        this.board = board;
    }

    public void displayBoard() {
        String formattedBoard = "";
        for (int i = 0; i < (this.board.size*this.board.size-1); i++) {
            String borderOrNewline = "";
            if ((i+1) % board.size == 0) {
                borderOrNewline += "\n";
            }
            else {
                borderOrNewline += "|";
            }
           // System.out.println("I is "+i);
            if(i >23)
            	break;
            formattedBoard += board.spots.get(i);
            
            formattedBoard += borderOrNewline;
        }
        System.out.print(formattedBoard);
    }
}
