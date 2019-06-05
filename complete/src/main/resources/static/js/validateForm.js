function validateForm() {
    console.log("we here");
    if (document.getElementById('exampleRadios4').checked) {
        console.log("correct");
        document.getElementById("answer").innerHTML = "Correct!";
    } else {
        console.log("incorrect");
        document.getElementById("answer").innerHTML = "Incorrect :(";
    }
}
