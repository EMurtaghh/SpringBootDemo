function changeImage() {
    return '<b id="image"><img src="../static/images/leg.jpg" width="1000" th:src="@{images/leg.jpg}"/></b>';
}

function remove(){
    return " ";
}

function displayFeedback() {
    document.getElementById('image').innerHTML = changeImage();
    document.getElementById('plane').innerHTML = remove();
    document.getElementById('structure').innerHTML = remove();
    document.getElementById('proximal').innerHTML = remove();
    document.getElementById('distal').innerHTML = remove();
    document.getElementById('zone').innerHTML = remove();
}
