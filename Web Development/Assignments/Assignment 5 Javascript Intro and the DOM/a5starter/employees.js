/******f**********
    
Assignment 5
Name: Salweyar Patel
Date: 01-11-2019
Description: JavaScript for the employee pay assessment

 ****************/

function load(){
	// Event listeneers for the submit and clear buttons
	var calculate = document.getElementById("calcButton");
	calculate.addEventListener("click", checkData);

	var clear = document.getElementById("clearbutton");
	clear.addEventListener("click", clearButton);


	// check the local storage for existing data
	if(localStorage.getItem("EmployeeData")){
		//populate the data from local storage into the table
		document.getElementById("emp").innerHTML = localStorage.getItem("EmployeeData");

		// dispaly the clear button as data does exit
		document.getElementById("clearbutton").style.dispaly = "block";

	}

}

// validates the data by retrieveinng values from the DOM
function checkData(){
	var fullName = document.getElementById("fullName").value;
	var hoursWorked = document.getElementById("hoursWorked").value;
	var hourlyRate = document.getElementById("hourlyRate").value;

	// Javasccript will treeat an empty string as 0 so we must first parse
	hoursWorked = parseFloat(hoursWorked); // will change values to a float
	if(fullName != "" && isNaN(hoursWorked) == false && isNaN(hourlyRate) == false){
		displayData(fullName,hoursWorked,hourlyRate);
	}

	/*hourlyRate = parseFloat(hourlyRate); // will change values to a float
	if(fullName != "" && isNaN(hourlyRate) == false){
		displayData(fullName,hoursWorked,hourlyRate);
	}*/

	resetFields();

}

function displayData(fullName,hoursWorked,hourlyRate){
	// Declare variables 
	var grossPay;
	var  tax;
	var netPay;
	
	var tbody = document.getElementsByTagName("tbody") [0];

	// Check to see if employees works more or less then 40 hours to calculate grossPay, tax and netPay
	if (hoursWorked > 40){
		var overTime = hoursWorked - 40;
		 grossPay =(overTime*hourlyRate) * 0.5 + hoursWorked * hourlyRate;
	}
	else{
		grossPay = hoursWorked*hourlyRate;
	}

	// calculate tax based on grossPay
	if(grossPay < 250){

		tax = grossPay * 0.25;

	} else if(grossPay >= 250 && grossPay < 500){

		tax = grossPay * 0.30;	

	}else if(grossPay >= 500 && grossPay <= 750){

		tax = grossPay * 0.40;

	} else if(grossPay > 750){
		tax = grossPay * 0.50;
	}

	// Calculate netPay based on given formula
	netPay = grossPay - tax;



	// Create the elements using DOM methods
	// Advantagges:
	//      Much cleaner code than building a large string 
	//      Add and removing nodes has no effet on sibling nodes


	// Build the row and its tds
	var newTr = document.createElement("tr");
	var newNameTd = document.createElement("td");
	var newGrossPayTd = document.createElement("td");
	var newTaxTd = document.createElement("td");
	var newNetPayTd = document.createElement("td");

	// Add the data to the new elements and append to the tr
	newNameTd.innerHTML = fullName;
	newGrossPayTd.innerHTML = Currency(grossPay);
	newTaxTd.innerHTML = Currency(tax);
	newNetPayTd.innerHTML = Currency(netPay);
	newTr.appendChild(newNameTd);
	newTr.appendChild(newGrossPayTd);
	newTr.appendChild(newTaxTd);
	newTr.appendChild(newNetPayTd);

	// Append the new tr to the tbody
	tbody.appendChild(newTr);


	clearbutton.style.display = "block"; // display the clear button after value is display

	saveListData(); // save the data in local storage
}

// function to convert number into currency format
function Currency(amt) {
  return "$" + amt.toFixed(2); // this will return i.e. $455.00
}

// saves the data in table to local storage
function saveListData(){
var tableData = document.getElementById("emp").innerHTML
	localStorage.setItem("EmployeeData", tableData);
 }


//	Clears the data in the form and hides the clear button
function clearButton(){
	var tbody = document.getElementsByTagName("tbody") [0];
	while(tbody.firstChild){
		tbody.removeChild(tbody.firstChild);

	}

	// hide the clear button
		clearbutton.style.display = "none";
		resetFields();

		saveListData();
}

//	Resets the form's inputs
function resetFields(){
	document.getElementById("fullName").value = "";
	document.getElementById("hoursWorked").value = "";
	document.getElementById("hourlyRate").value = "";
	document.getElementById("fullName").focus();
}

document.addEventListener("DOMContentLoaded", load);












