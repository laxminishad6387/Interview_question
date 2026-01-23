/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function (height) {
  let max=0;
  let i=0; let j=height.length-1;
  let curr=0;
  while(i<j)
  {
    curr=Math.min(height[i], height[j])*(j-i);
    max=Math.max(curr,max);
    if(height[i]<=height[j])
     i++;
     else
     j--;
  }
  return max;
};