// // Odd numbers

// // Method 1
// for(i=1; i<=15;i=i+2){
//     console.log(i);
// }
// // Method 2
// for(i=1; i<=15;i++){
//     if(i%2 !=0){
//         console.log(i);
//     }
// }

// // Even numbers

// // Method 1
// for(i=2; i<=15;i=i+2){
//     console.log(i);
// }
// // Method 2
// for(i=1; i<=15;i++){
//     if(i%2 ==0){
//         console.log(i);
//     }
// }

// Table of any number

// let n=prompt('Enter number :');
// n=parseInt(n);
// for (i=n; i<=n*10; i=i+n){
//     console.log(i); 
// }

// Nested For loop
for (i=1;i<=5;i++){
    console.log(`Outer loop ${i}`);
    for (j=1;j<=5;j++){
        console.log(j); 
    }

}