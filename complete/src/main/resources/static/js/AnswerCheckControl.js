function generateFeedback(isChecked) {
    if (isChecked == true) {
        return "Correct!";
    } else {
        return "Incorrect. So sad :(";
    }
}

function displayFeedback(displayString) {
    document.getElementById('answer').innerHTML = displayString;
}
