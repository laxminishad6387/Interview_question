//ask  microsoft company 

class Solution {
   private int   helper(int startingPoint, int endingPoint, int centerOfCircle)
    {
        if(startingPoint<=centerOfCircle && centerOfCircle <=endingPoint)
        return 0;
        if(centerOfCircle <= startingPoint)
        return startingPoint-centerOfCircle ;
        else
        return centerOfCircle -endingPoint;
        
    }
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int minX=helper(x1,x2,xCenter);
        int minY=helper(y1,y2,yCenter);
        if(minX*minX +minY *minY <=radius*radius)
           return true;
        else
        return false;

        
    }
}