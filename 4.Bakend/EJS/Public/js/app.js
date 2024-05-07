const butns = document.querySelectorAll("button");
for (butn of butns) {
  butn.addEventListener("click", () => {
    console.log("Buttons was clicked");
  });
}
