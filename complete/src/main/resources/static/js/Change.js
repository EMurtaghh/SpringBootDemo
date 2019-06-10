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

function createFillIn(){
    var json= {
        "id" : "Math Q1",
        "difficulty" : 1,
        "questionText" : "2 + 2 = ?",
        "correctAnswer" : "4",
        "answers" : [ "2", "4", "5", "6" ]
    };

    return "<p>"+json.questionText+'</p> <input name="distal" list="structures3"/> <datalist id="structures3"> <option value="'
        + json.answers[0]+ '"/> <option value="' + json.answers[1] + '"/> <option value="' + json.answers[2]
        + '"/> <option value="' + json.answers[3] + '"/> </datalist>';
}

function changeQuestions() {
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
    if(value=="Correct") return '<font color=\"green\">Your answer is: '+ value+ '</font>';
    if(value=="Incorrect") return '<font color=\"red\">Your answer is: '+ value+ '</font>';
    if(value=="Unsure") return '<font color=\"#663399\">Your answer is: '+ value+ '</font>';
}

function checkStructure(form){
    if (form.structures.value=="Bone") return "Correct";
    if (form.structures.value=="Unsure") return "Unsure";
    return "Incorrect";
}

function checkDistal(form){
    if (form.distal.value=="Bone") return "Correct";
    if (form.distal.value=="Unsure") return "Unsure";
    return "Incorrect";
}

function checkProximal(form){
    if (form.proximal.value=="Bone") return "Correct";
    if (form.proximal.value=="Unsure") return "Unsure";
    return "Incorrect";
}

function checkAnswers(form){
    document.getElementById('planeCorrect').innerHTML = displayCheck(form.plane.value);
    document.getElementById('structureCorrect').innerHTML = displayCheck(checkStructure(form));
    document.getElementById('proximalCorrect').innerHTML = displayCheck(checkProximal(form));
    document.getElementById('distalCorrect').innerHTML = displayCheck(checkDistal(form));
    document.getElementById('zoneCorrect').innerHTML = displayCheck(form.zone.value);

    document.getElementById('submitButton').innerHTML = remove();
}
