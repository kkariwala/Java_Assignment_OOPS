console.log("Hello js linked!");
// document.getElementsByClassName("left-side-navbar-option").forEach(function(el) {
//     el.addEventListener("click", logElement.bind(null, el));
// });
// document.getElementsByClassName("left-side-navbar-option").addEventListener("click",)
// console.log()

$(document).ready(function() {
    $(".left-side-navbar-option-div").click(function ({target}) {
        $(".left-side-navbar-option-div").removeClass("left-side-navbar-option-div-active");
        $(".left-side-navbar-option").removeClass("left-side-navbar-option-active")
        $(this).addClass("left-side-navbar-option-div-active");
        console.log(target);
        target.classList.add("left-side-navbar-option-active");
        // target.addClass("left-side-navbar-option-active")
        // const sibDiv =  Array.prototype.call(target.children)[0];
        // console.log(sibDiv);
        // sibDiv.addClass("left-side-navbar-option-active")
        $(this).childNodes         
    });

    $(".view-option").click(function({target}){
        $(".view-option").removeClass("view-option-active");
        $(this).addClass("view-option-active");
    })
});

