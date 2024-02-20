
const taps = document.querySelectorAll('.tap');
const body = document.querySelector('body');
const text = document.querySelectorAll('.text');
const text2 = document.querySelectorAll('.text2');

taps.forEach(function (tap) {
  console.log(tap);
  tap.addEventListener('click', function (e) {
    console.log(e);
    console.log(e.target);
    if (e.target.id === 'red') {
      body.style.backgroundColor = e.target.id;
    }
    if (e.target.id === 'green') {
      body.style.backgroundColor = e.target.id;
    }
    if (e.target.id === 'blue') {
      body.style.backgroundColor = e.target.id;
    }
    if (e.target.id === 'yellow') {
      body.style.backgroundColor = e.target.id;
    }
    if (e.target.id === 'grey') {
      body.style.backgroundColor = e.target.id;
    }
    if (e.target.id === 'white') {
      body.style.backgroundColor = e.target.id;
      body.style.color = 'black';
    } 
  });
});

