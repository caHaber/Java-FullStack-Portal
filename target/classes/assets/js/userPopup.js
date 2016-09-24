$(document).ready(function() {
    if(localStorage.getItem('popState') != 'shown'){
        $("#jpopup").delay(2000).fadeIn();
        localStorage.setItem('popState','shown')
    }
});