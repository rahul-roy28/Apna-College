function getNumber(n) {
  let arr = new Array(n);
  for (let i = 0; i < n; i++) {
    arr[i] = Math.floor(Math.random() * 10);
  }
  return arr;
}
function sum(arr) {
  return arr.reduce((sum, curr) => sum + curr, 0);
}
function winning(sum) {
  if (sum === 15) {
    return "Congratulations! You won the Lottery!";
  } else {
    return "Sorry, you did not win. Better luck next time!";
  }
}
export { getNumber, sum, winning };
