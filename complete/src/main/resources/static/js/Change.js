function changeImage() {
    return '<b id="image"><img src="../static/images/leg.jpg" width="1000" th:src="@{images/leg.jpg}"/></b>';
}

function remove(){
    return " ";
}

function createMulti(){
    var json= {
        "id" : "Math Q1",
        "difficulty" : 1,
        "questionText" : "2 + 2 = ?",
        "correctAnswer" : "4",
        "answers" : [ "2", "4", "5", "6" ]
    };
    
    return "<p>"+json.questionText+'</p> <input type="radio" th:field="*{plane}" value="Incorrect">'+json.answers[0]
        +'<br> <input type="radio" th:field="*{plane}" value="Correct">'+json.answers[1]
        +'<br> <input type="radio" th:field="*{plane}" value="Incorrect">'+json.answers[2]
        +'<br> <input type="radio" th:field="*{plane}" value="Incorrect">'+json.answers[3]+'<br>';
}

function displayFeedback() {
    document.getElementById('image').innerHTML = changeImage();
    document.getElementById('plane').innerHTML = createMulti();
    document.getElementById('structure').innerHTML = remove();
    document.getElementById('proximal').innerHTML = remove();
    document.getElementById('distal').innerHTML = remove();
    document.getElementById('zone').innerHTML = remove();

    document.getElementById('planeCorrect').innerHTML = remove();
    document.getElementById('structureCorrect').innerHTML = remove();
    document.getElementById('proximalCorrect').innerHTML = remove();
    document.getElementById('distalCorrect').innerHTML = remove();
    document.getElementById('zoneCorrect').innerHTML = remove();
}

function displayCheck(value){
    return "Your answer is: "+ value;
}

function checkAnswers(form){
    document.getElementById('planeCorrect').innerHTML = displayCheck(form.plane.value);
    document.getElementById('structureCorrect').innerHTML = displayCheck(form.structures.value);
    document.getElementById('proximalCorrect').innerHTML = displayCheck(form.proximal.value);
    document.getElementById('distalCorrect').innerHTML = displayCheck(form.distal.value);
    document.getElementById('zoneCorrect').innerHTML = displayCheck(form.zone.value);

    document.getElementById('submitButton').innerHTML = remove();
}
