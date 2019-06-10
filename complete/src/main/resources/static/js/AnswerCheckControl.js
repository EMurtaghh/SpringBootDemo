function generateFeedback(isChecked) {
    if (isChecked) {
        return "Correct!";
    } else {
        return "Incorrect. So sad :(";
    }
}

function generateFeedbackMulti(isCheckedQ1, isCheckedQ2, isCheckedQ3) {
    var count = 0;
    if (isCheckedQ1) {
        count++;
    }
    if (isCheckedQ2) {
        count++;
    }
    if (isCheckedQ3) {
        count++
    }
    if (count == 3) {
        return "Correct!";
    } else {
        return "Incorrect. So sad :(";
    }
}

function displayFeedback(displayString) {
    document.getElementById('answer').innerHTML = displayString;
}
