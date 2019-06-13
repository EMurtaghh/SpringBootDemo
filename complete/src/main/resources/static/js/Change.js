
function readJson(url){
    var request = new XMLHttpRequest();
    request.open("GET", url, false);
    request.send(null);

    return JSON.parse(request.response);
}

function readQuestion(question){
    if(question.difficulty==1) document.getElementById('plane').innerHTML = setPlane(question.correctAnswer);
    if(question.difficulty==2) document.getElementById('structure').innerHTML = createFillIn(question);
    if(question.difficulty==3) document.getElementById('proximal').innerHTML = remove();
    if(question.difficulty==4) document.getElementById('zone').innerHTML = remove();
}

function remove() {
    return " ";
}

function setPlane(type){
    if(type=="Transverse") return '<p>What plane is this?</p> <input type="radio" name="plane" value="Incorrect"> Lateral<br> <input type="radio" name="plane" value="Correct"> Transverse<br> <input type="radio" name="plane" value="Unsure"> I do not know<br>';
    return '<p>What plane is this?</p> <input type="radio" name="plane" value="Correct"> Lateral<br> <input type="radio" name="plane" value="Incorrect"> Transverse<br> <input type="radio" name="plane" value="Unsure"> I do not know<br>';

}

function createMulti(json) {
    return "<p>" + json.questionText + '</p> <input type="radio" th:field="*{plane}" value="Incorrect">' + json.answers[0] +
        '<br> <input type="radio" name="plane" value="Correct">' + json.answers[1] +
        '<br> <input type="radio" name="plane" value="Incorrect">' + json.answers[2] +
        '<br> <input type="radio" name="plane" value="Incorrect">' + json.answers[3] + '<br>';
}

function createFillIn(json) {
    return "<p>" + json.questionText + '</p> <input name="structures" list="structures"/> <datalist id="structures"> <option value="' +
        json.answers[0] + '"/> <option value="' + json.answers[1] + '"/> <option value="' + json.answers[2] +
        '"/> <option value="' + json.answers[3] + '"/> </datalist>';
}

function change() {
    var x = document.getElementById("image2");

    if (x.style.display === "none") {
        x.style.display = "block";
    } else {
        x.style.display = "none";
    }
}

function changeQuestions() {
    document.getElementById('image').innerHTML = remove();
    change();

    var question= readJson("/nextQuestion")
    readQuestion(question);

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

function addResponesToRecords() {
    var newResponse = {

    };

    //resourceRecords.push(newResponse);
}

function displayCheck(value) {
    if (value == "Correct") return '<font color=\"green\">Your answer is: ' + value + '</font>';
    if (value == "Incorrect") return '<font color=\"red\">Your answer is: ' + value + '</font>';
    if (value == "Unsure") return '<font color=\"#663399\">Your answer is: ' + value + '</font>';
}

function checkStructure(form) {
    if (form.structures.value == "Bone") return "Correct";
    if (form.structures.value == "Unsure") return "Unsure";
    return "Incorrect";
}

function checkDistal(form) {
    if (form.distal.value == "Bone") return "Correct";
    if (form.distal.value == "Unsure") return "Unsure";
    return "Incorrect";
}

function checkProximal(form) {
    if (form.proximal.value == "Bone") return "Correct";
    if (form.proximal.value == "Unsure") return "Unsure";
    return "Incorrect";
}

function checkAnswers(form) {
    document.getElementById('planeCorrect').innerHTML = displayCheck(form.plane.value);
    document.getElementById('structureCorrect').innerHTML = displayCheck(checkStructure(form));
    document.getElementById('proximalCorrect').innerHTML = displayCheck(checkProximal(form));
    document.getElementById('distalCorrect').innerHTML = displayCheck(checkDistal(form));
    document.getElementById('zoneCorrect').innerHTML = displayCheck(form.zone.value);

    document.getElementById('submitButton').innerHTML = remove();
}
