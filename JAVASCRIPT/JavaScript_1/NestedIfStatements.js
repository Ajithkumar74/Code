/* Nested  If Statement in JavaScript
Syntax:
if (outerCondition)
{
    Code to be executed if outerCondition is true
     if (innerCondition1) {
        // Code to be executed if innerCondition1 is true
     } else {
        // Code to be executed if innerCondition1 is false
     }
     if (innerCondition2) {
        // Code to be executed if innerCondition2 is true
     } else {
        // Code to be executed if innerCondition2 is false
     }
} else {
    Code to be executed if outerCondition is false
} */

//Nested If Statement
/*
if(cond)
{
  if(cond)
  {
    ---
  }
}

min mark >=35
  91-100 A
  81-90 B
  71-80 C
  D
*/


let English=95,tamil=98,maths=75;

let total,avg;

total=English+tamil+maths;
avg=total/3;
console.log("Total:"+total);
console.log("Average:"+avg.toFixed(2));
if(English>=35 && tamil>=35 && maths>=35)
{
  console.log("Result  : Pass");
  if(avg>90 && avg<=100){
    console.log("Grade   : A Grade");
  }else if(avg>80 && avg<=90){
    console.log("Grade   : B Grade");
  }else if(avg>70 && avg<=80){
    console.log("Grade   : C Grade");
  }else{
    console.log("Grade   : D Grade");
  }
}
else{
    console.log("Result : Fail");
    console.log("Grade: No Grade");
}