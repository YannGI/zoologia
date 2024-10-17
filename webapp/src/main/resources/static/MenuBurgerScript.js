

const burgerBTN = document.querySelector('.menuburger');
const burgerParent = document.querySelector('.card1');

burgerBTN.addEventListener('click', ()=> {
    burgerParent.classList.toggle('closed');
})