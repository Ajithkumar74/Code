const number=[1,2,3,4,5,6,7,8,9,10];
//value,index,array
/* number.forEach((value,index)=>{
    console.log("Index : "+index+" Value : "+value);
}); */

const users = [

    {full_name: "Ram",age: 12,city:"Salem", salary: 10000},
    
    {full_name: "Sam",age:15,city: "Chennai", salary: 10500},
   
    {full_name:"Ravi", age: 22,
    city: "Namakkal", salary: 12000},
   
    {full_name:"Joes",age:18,city: "Hosur", salary:6000},
   
    {full_name:"Aureen",age:47,
    city: "Dharmapuri", salary:10000},
   
    {full_name:"Stanley",age:10, city:"Salem", salary:8000},
    
];
//console.table(users);

/* users.forEach((value)=>{
console.log(value.full_name);
}); */

//Exploring the forEach method in JavaScript: More Examples
//1. Example of using the forEach method to print each element of an array:


const fruits=['apple','banana','cherry'];
fruits.forEach(fruit=>console.log(fruit));
//2. Example of using the forEach method to sum all elements of an array:
const numbers=[1,2,3,4,5];
let total=0;
numbers.forEach(number=>{
    total+=number;
});
console.log(total);
//3. Example of using the forEach method to create a new array from an existing one:

const numbers1=[1,2,3,4,5,6];
const doublednumbers=[];
numbers1.forEach(number=>{
    doublednumbers.push(number*2);
});
console.log(doublednumbers);
//4. Example of using the forEach method to find the max element of an array:

const numbers2=[1,2,3,4,5,6,7];
let max=numbers2[0];
numbers2.forEach(number=>{
    if(number>max){
        max=number;
    }
});
console.log(max);
//6. Example of using the forEach method to filter an array:

const numbers3=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const evennumbers=[];
numbers3.forEach(number=>{
    if(number%2===0){
        evennumbers.push(number);
    }
});
console.log("Even Numbers = "+evennumbers);
//7. Example of using the forEach method to update elements of an array:
const names = ['John', 'Mike', 'Bob', 'Jane'];

names.forEach((name,index)=>{
    console.log(name,index);
    names[index]=name.toUpperCase();
});
console.log(names);

//8. Example of using the forEach method to to remove elements from an array:
const numbers4=[1,2,3,4,5,6,7,8,9,10];
numbers.forEach((number,index)=>{
    if(number>5){
        numbers.splice(index,1);
    }
});
console.log(numbers); // [1, 2, 3, 4, 5]
//9. Example of using the forEach method to check if an element exists in an array:



const fruits1=['apple','banana','cherry'];
let exists=false;
fruits1.forEach(fruit=>{
    if(fruit ==='banana'){
        exists=true;
    }
});
console.log(exists);//true

//10. Example of using the forEach method to check concat array element:

const words=["hello"+"world"];
let concat=" ";
words.forEach(word=>{
    concat+=word+" ";
});
console.log(concat);