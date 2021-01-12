//	Name: average.js
//	Author: Your name

//	Add your JavaScript here
/*function battingAverage(name,hits,atbats){
	
}*/

function load(){
	let name = prompt("Please enter the hitter's name");
	let hits = prompt(`Please enter ${name}'s hit total this year`);
	let atbats = prompt(`How many at bats did ${name} have this year?`);

	battingAverage(name,hits,atbats);
}

function battingAverage(name,hits,atbats){
	var average = hits/atbats;

	let num = average.toFixed(3) //Where “x” is the number of decimal places you need

	var section = document.getElementById("results");
	var h2 = document.createElement("h2");

	if(num < 0.300){

		h2.innerHTML = name + " is not quite Cooperstown material with a batting average of " + num;
		section.appendChild(h2);
	}
	else{

		h2.innerHTML =  "We're opening up the doors to Cooperstown for " + name + " and their" +num+ "average!";
		section.appendChild(h2);
	}





}
document.addEventListener("DOMContentLoaded", load);