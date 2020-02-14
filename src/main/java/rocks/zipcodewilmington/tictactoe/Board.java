package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board
{

    private Character [] [] game;

    public Board(Character[][] matrix)
    {
        this.game = matrix;
    }

    public Boolean isInFavorOfX()
    {


            for (int i = 0; i < game.length; i++) {
        if (game[i][0] == 'X' && game[i][1] == 'X' && game[i][2] == 'X')
        {
            return true;
        }
        if (game[0][i] == 'X' && game[1][i] == 'X' && game[2][i] == 'X')
        {
            return true;
        }

    }
        if (game[0][0] == 'X' && game[1][1] == 'X' && game[2][2] == 'X')
        {
        return true;
        }
        if (game[0][2] == 'X' && game[1][1] == 'X' && game[2][0] == 'X')
        {
        return true;
        }

        return false;
    }

    public Boolean isInFavorOfO()
    {
        for (int i = 0; i < game.length; i++)
        {
            if (game[i][0] == 'O' && game[i][1] == 'O' && game[i][2] == 'O')
            {
                return true;
            }
            if (game[0][i] == 'O' && game[1][i] == 'O' && game[2][i] == 'O')
            {
                return true;
            }

        }
        if (game[0][0] == 'O' && game[1][1] == 'O' && game[2][2] == 'O')
            {
            return true;
            }
        if (game[0][2] == 'O' && game[1][1] == 'O' && game[2][0] == 'O')
            {
            return true;
            }
        return false;
    }



    public Boolean isTie() {

        for (int i = 0; i < game.length; i++)
        {
            for (int j = 0; j < game.length; j++)
            {
                if (game[i][j] == ' ')
                {
                    return false;
                }
            }
        }
        return true;
    }


    public String getWinner() {

        if (isInFavorOfO()) {
            return "O";
        }
        if (isInFavorOfX()){
            return "X";
        }

        return "";
    }


}
