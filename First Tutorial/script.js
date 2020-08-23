let greeting = 'Hello World';


function add(number1, number2) {
	let summ = number1 + number2;
	return sum;
}

let num1 = 2;
let num2 = 3;
let sum = add(num1, num2);
alert(sum);

if (age &lt; 18) \ {Alet("You're not an adult"); \} else \{alert("You're an adult");\}

let personDetails = {
	fullName: {
		firstName: 'Alicia'
		lastName: 'Stanton'
	},
	alertMessage: function(message) {
		alert(message);
	}
}

personDetails.alertMessage('Hello World');

let submitButton = document.querySelector('\#submit-button');


function clickListener(event)  {
	event.preventDefault();
	 console.log( 'Button clicked'); 
	} 



submit.addEventListener( 'click', clickListener);

function emailValidate(email) \ { if (email.includes('@')) \{ return true; \} else \{ return false; \} \}

console.log(emailValidate(emailText));

if(emaialValidate(emailText) \!== true) \ {console.log(' The email address must contain @'); return false; \}
console.log( ' Thanks for your message');


function emailValidate(email) {
	if(email.includes('@')) {
		return true;
	}
	else {
		return false;
	}
}