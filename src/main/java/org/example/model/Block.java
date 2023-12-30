package org.example.model;

public class Block {

    private Point topLeftPoint;
    private Point topRightPoint;
    private Point bottomLeftPoint;
    private Point bottomRightPoint;
    private BlockColor blockColor;
    private boolean clickable;
    private boolean inPocket;
    private GameBoard gameBoard;

    public Block(Point topLeftPoint, Point topRightPoint, Point bottomLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.topRightPoint = topRightPoint;
        this.bottomLeftPoint = bottomLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
        blockColor = BlockColor.WHITE;
        inPocket = false;
    }

    public void onClick(){
        if (this.clickable){
            gameBoard.blocksOnTheBoard.remove(this);

        }
    }

    public BlockColor getBlockColor() {
        return blockColor;
    }

    public void setBlockColor(BlockColor blockColor) {
        this.blockColor = blockColor;
    }

    public boolean isClickable() {
        return clickable;
    }

    public void setClickable(boolean clickable) {
        this.clickable = clickable;
    }

    public boolean isInPocket() {
        return inPocket;
    }

    public void setInPocket(boolean inPocket) {
        this.inPocket = inPocket;
    }

    public void setGameBoard(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }

    

    class Point{
        private boolean visible;
        private int x;
        private int y;
        private int layer;

        public Point(int x, int y, int layer) {
            this.x = x;
            this.y = y;
            this.layer = layer;
        }

        public boolean isVisible() {
            return visible;
        }

        public void setVisible(boolean visible) {
            this.visible = visible;
        }
    }



}
