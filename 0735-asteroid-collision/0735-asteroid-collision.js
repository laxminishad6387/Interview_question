/**
 * @param {number[]} asteroids
 * @return {number[]}
 */
var asteroidCollision = function(asteroids) {
    let stack=[];
    for(let currast of asteroids){
      
        let currastAlive=true;
        while(currastAlive && stack.length>0 && stack[stack.length-1]>0 && currast<0){
            let top=stack[stack.length-1];
        
            if(Math.abs(top)<Math.abs(currast)) stack.pop();
            
            else if(Math.abs(top)==Math.abs(currast))
            {
                stack.pop();
                currastAlive=false;
            }
            else currastAlive=false;
            
        }
        if( currastAlive) stack.push(currast);
        
    }
    return stack;
};