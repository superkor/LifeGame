//CREATED BY JUSTIN CHOW

package lifeGame;

import java.util.ArrayList;

public class Logic{
    private String[][] board;
    private ArrayList <CoordsToKeep> listKeep;

    public Logic(){
        board = new String[20][20];

        listKeep = new ArrayList<CoordsToKeep>();
        for (int y = 0; y < 20; y++){
            for (int x = 0; x < 20; x++){
                board[x][y] = "0";
            }
        }

    }

    public void refreshBoard(){
        
        for (int y = 0; y < 20; y++){
            for (int x = 0; x < 20; x++){
                board[x][y] = "0";
            }
        }
    }

    public boolean setValues(int x, int y){
        if (board[x][y].equals("X")){
            return(true);
        } else {
            board[x][y] = "X";
            return(false);
        }
    }

    public void showBoard(){
        for (int y = 0; y < 20; y++){
            for (int x = 0; x < 20; x++){
                System.out.print(board[x][y]);
            }
            System.out.println();
        }
    }

    public void cell(){
        int countCells, xToKeep, yToKeep;

        //Stay Alive
        for (int y = 0; y < 20; y++){
            for (int x = 0; x < 20; x++){
                countCells = 0;
                if (board[x][y].equals("X")){
                    switch (x){
                        case 0: 
                            if (y == 0){
                                if (board[x+1][y].equals("X")){
                                    countCells += 1;
                                } if (board[x][y+1].equals("X")){
                                    countCells += 1;
                                } if (board[x+1][y+1].equals("X")){
                                    countCells += 1;
                                }
                            } else if (y == 19){
                                if (board[x+1][y].equals("X")){
                                    countCells += 1;
                                } if (board[x][y-1].equals("X")){
                                    countCells += 1;
                                } if (board[x+1][y-1].equals("X")){
                                    countCells += 1;
                                }
                            } else {
                                if (board[x+1][y].equals("X")){
                                    countCells += 1;
                                } if (board[x][y+1].equals("X")){
                                    countCells += 1;
                                } if (board[x+1][y+1].equals("X")){
                                    countCells += 1;
                                } if (board[x][y-1].equals("X")){
                                    countCells += 1;
                                } if (board[x+1][y-1].equals("X")){
                                    countCells += 1;
                                }
                            }
                            break;

                        case 19:
                            if (y == 0){
                                if (board[x-1][y].equals("X")){
                                    countCells += 1;
                                } if (board[x-1][y+1].equals("X")){
                                    countCells += 1;
                                } if (board[x][y+1].equals("X")){
                                	countCells += 1;
                                }
                            } else if (y == 19){
                                if (board[x-1][y].equals("X")){
                                    countCells += 1;
                                } if (board[x][y-1].equals("X")){
                                    countCells += 1;
                                } if (board[x-1][y-1].equals("X")){
                                    countCells += 1;
                                }
                            } else {
                                if (board[x-1][y].equals("X")){
                                    countCells += 1;
                                } if (board[x][y-1].equals("X")){
                                    countCells += 1;
                                } if (board[x-1][y-1].equals("X")){
                                    countCells += 1;
                                } if (board[x][y+1].equals("X")){
                                    countCells += 1;
                                } if (board[x-1][y+1].equals("X")){
                                    countCells += 1;
                                }
                            }
                            break;
                        
                        default:
                        if (board[x-1][y].equals("X")){
                            countCells += 1;
                        } if (board[x+1][y].equals("X")){
                            countCells += 1;
                        } if (y == 0){
                            if (board[x-1][y+1].equals("X")){
                                countCells += 1;
                            } if (board[x][y+1].equals("X")){
                                    countCells += 1;
                            } if (board[x+1][y+1].equals("X")){
                                    countCells += 1;
                            }    
                        } else if (y == 19){
                            if (board[x][y-1].equals("X")){
                                countCells += 1;
                            }if (board[x+1][y-1].equals("X")){
                                    countCells += 1;
                            } if (board[x-1][y-1].equals("X")){
                                    countCells += 1;
                            } 
                        } else {
                            if (board[x-1][y+1].equals("X")){
                                countCells += 1;
                            } if (board[x][y+1].equals("X")){
                                    countCells += 1;
                            } if (board[x+1][y+1].equals("X")){
                                    countCells += 1;
                            } if (board[x][y-1].equals("X")){
                                countCells += 1;
                            }if (board[x+1][y-1].equals("X")){
                                    countCells += 1;
                            } if (board[x-1][y-1].equals("X")){
                                    countCells += 1;
                            }  
                        }

                            break;
                    }
                    
                    if (countCells >= 2){
                        listKeep.add(new CoordsToKeep(x,y));
                       
                    }
                }

            }
        }

        //Cell Become Alive
        for (int y = 0; y < 20; y++){
            for (int x = 0; x < 20; x++){
                countCells = 0;
                if (board[x][y].equals("0")){
                    switch (x){
                        case 0: 
                            if (y == 0){
                                if (board[x+1][y].equals("X")){
                                    countCells += 1;
                                } if (board[x][y+1].equals("X")){
                                    countCells += 1;
                                } if (board[x+1][y+1].equals("X")){
                                    countCells += 1;
                                }
                            } else if (y == 19){
                                if (board[x+1][y].equals("X")){
                                    countCells += 1;
                                } if (board[x][y-1].equals("X")){
                                    countCells += 1;
                                } if (board[x+1][y-1].equals("X")){
                                    countCells += 1;
                                }
                            } else {
                                if (board[x+1][y].equals("X")){
                                    countCells += 1;
                                } if (board[x][y+1].equals("X")){
                                    countCells += 1;
                                } if (board[x+1][y+1].equals("X")){
                                    countCells += 1;
                                } if (board[x][y-1].equals("X")){
                                    countCells += 1;
                                } if (board[x+1][y-1].equals("X")){
                                    countCells += 1;
                                }
                            }
                            break;

                        case 19:
                            if (y == 0){
                                if (board[x-1][y].equals("X")){
                                    countCells += 1;
                                } if (board[x-1][y+1].equals("X")){
                                    countCells += 1;
                                } if (board[x][y+1].equals("X")){
                                	countCells += 1;
                                }
                            } else if (y == 19){
                                if (board[x-1][y].equals("X")){
                                    countCells += 1;
                                } if (board[x][y-1].equals("X")){
                                    countCells += 1;
                                } if (board[x-1][y-1].equals("X")){
                                    countCells += 1;
                                }
                            } else {
                                if (board[x-1][y].equals("X")){
                                    countCells += 1;
                                } if (board[x][y-1].equals("X")){
                                    countCells += 1;
                                } if (board[x-1][y-1].equals("X")){
                                    countCells += 1;
                                } if (board[x][y+1].equals("X")){
                                    countCells += 1;
                                } if (board[x-1][y+1].equals("X")){
                                    countCells += 1;
                                }
                            }
                            break;
                        
                        default:
                        if (board[x-1][y].equals("X")){
                            countCells += 1;
                        } if (board[x+1][y].equals("X")){
                            countCells += 1;
                        } if (y == 0){
                            if (board[x-1][y+1].equals("X")){
                                countCells += 1;
                            } if (board[x][y+1].equals("X")){
                                    countCells += 1;
                            } if (board[x+1][y+1].equals("X")){
                                    countCells += 1;
                            }    
                        } else if (y == 19){
                            if (board[x][y-1].equals("X")){
                                countCells += 1;
                            }if (board[x+1][y-1].equals("X")){
                                    countCells += 1;
                            } if (board[x-1][y-1].equals("X")){
                                    countCells += 1;
                            } 
                        } else {
                            if (board[x-1][y+1].equals("X")){
                                countCells += 1;
                            } if (board[x][y+1].equals("X")){
                                    countCells += 1;
                            } if (board[x+1][y+1].equals("X")){
                                    countCells += 1;
                            } if (board[x][y-1].equals("X")){
                                countCells += 1;
                            }if (board[x+1][y-1].equals("X")){
                                    countCells += 1;
                            } if (board[x-1][y-1].equals("X")){
                                    countCells += 1;
                            }  
                        }

                            break;
                    }
                    
                    if (countCells >= 3){
                        listKeep.add(new CoordsToKeep(x,y));
                       
                    }
                }

            }

        }


            
            //apolgy for bad english
            //where were u wen club penguin die
            //i was at house eating dorito chip when phone ring
            //"club penguin is kil"
            //"no"
            
            refreshBoard();

            //keep cell that is no kil
            for (CoordsToKeep w : listKeep){
                xToKeep = w.getX();
                yToKeep = w.getY();

                board[xToKeep][yToKeep] = "X";
            }

            listKeep.removeAll(listKeep);
        
    }

    public boolean checkDone(){
        int amtX = 0;
        for (int y = 0; y < 20; y++){
            for (int x = 0; x < 20; x++){
                if (board[x][y].equals("0")){
                    amtX += 1;
                }
            }
        }

        if (amtX == 0){
            return(false);
        } else {
            return(true);
        }
    }
    
}