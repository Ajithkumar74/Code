//type conversion

let a;
a=25;
console.log(a,typeof a);
a=String(a);
console.log(a,typeof a);

a=25.0;
console.log(a,typeof a);
a=String(a);
console.log(a,typeof a);

a=true;
console.log(a,typeof a);
a=String(a);
console.log(a,typeof a);


a=new Date();
console.log(a,typeof a);
a=String(a);
console.log(a,typeof a);

a=[1,2,3,4,5];
console.log(a,typeof a);
a=toString(a);
console.log(a,typeof a);

//Type Coercion

let c="25";
let b=10;
console.log(c+b);

c=Number(c);
console.log(c+b);