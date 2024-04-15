const max=prompt('Enter Max Number:');
let guess=prompt('Enter youe guess:');
const random=Math.floor(Math.random()*max+1);

while(true){
  if(guess=='quite'){
    console.log('Quiting game');
    break;
  }
  if(guess==random){
    console.log('Congrachulation! You are right. Random Number was',random);
    break;
  }else if(guess<random){
    guess=prompt(' Hint! Your guess is small, Please Try again:')
  }else{
    guess=prompt('Hint! Your guess is large, Please Try again:')
  }
  // else{
  //   guess=prompt('You are wrong! Please Try again:')
  // }
};