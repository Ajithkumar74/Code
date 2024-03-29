const numbers=[1,2,3,4,5,6,7,8,9,10];

//map(value,index,array)
let sqrt=numbers.map((value)=>{
    return Math.sqrt(value.toFixed(2));
})
console.table(sqrt);
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
console.table(users);
let eligible_status=users.map((user)=>({
   /*  name:user.full_name,
    age:user.age,
    city:user.city,
    salary:user.salary, */
    ...user,
    status:user.age>=18?"Eligible":"Not Eligible"
}));
console.table(eligible_status);