


function handleLogin(event){
	event.preventDefault();
	//get user input
	const email=document.getElementById("email");
	const password=document.getElementById("password");
	const user={
		email:email,
		password:password
	};
	fetch
	
	
}

const loginForm=document.getElementById("loginForm");
loginForm.addEventListener("submit",handleLogin);