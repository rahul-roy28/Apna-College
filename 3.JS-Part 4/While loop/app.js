

let favouritemovie='Avator';
let guess=prompt('Enter movie name :');
while((guess!=favouritemovie)&&(guess!='quite')){
    console.log('wrong!');
    guess=prompt('Chose another name:');

}
if(guess==favouritemovie){

    console.log('Congratuletion!')
}else {
    console.log('You quite')
}


// Using Break statement

// let favouritemovie='Avator';
// let guess=prompt('Enter movie name :');
// while(guess!=favouritemovie){
//     if (guess=='quite'){
//         console.log('You Quite')
//         break;
//     }
//     console.log('wrong!');
//     guess=prompt('Chose another name:');

// }
// if(guess==favouritemovie){

//     console.log('Congratuletion!')
// }