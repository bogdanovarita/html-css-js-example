document.getElementById("saveButton").addEventListener("click", onSaveButtonClick);

function onSaveButtonClick() {
  alert("You are going to save: " +
    document.getElementById("validationCustom02").value + " " +
    document.getElementById("validationCustom01").value
  );
}
function onHelloButtonClick() {
  alert("Hello!");
}
